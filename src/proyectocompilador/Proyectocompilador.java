package proyectocompilador;

import org.antlr.v4.runtime.*;
import java.util.ArrayList;
import java.io.File;
import proyectocompilador.TablaSimbolos.AnalizadorSemantico;


public class Proyectocompilador {

    public static void main(String[] args) {
        String archivoEntrada = "entrada.txt";

        try {
            File f = new File(archivoEntrada);
            if (!f.exists()) {
                System.out.println("Error: No se encontró el archivo 'entrada.txt' en: " + f.getAbsolutePath());
                return;
            }

            // 1. Leer archivo de entrada
            CharStream input = CharStreams.fromFileName(archivoEntrada);
            
            //2. Análisis Léxico
            GramaticaLexer lexer = new GramaticaLexer(input);
ErrorCollector errorCollector = new ErrorCollector();

lexer.removeErrorListeners();
lexer.addErrorListener(errorCollector);

// IMPORTANTE: CommonTokenStream por defecto ignora canales como los de comentarios o espacios.
// Como ya pusiste "-> skip" en la gramática, esto está bien.
CommonTokenStream tokens = new CommonTokenStream(lexer);

// 3. Recolectar tokens para la bitácora
ArrayList<String> filasTokens = new ArrayList<>();

// Forzamos al lexer a leer todos los tokens hasta el final (EOF)
tokens.fill(); 

for (Token t : tokens.getTokens()) {
    if (t.getType() != Token.EOF) {
        String nombreToken = GramaticaLexer.VOCABULARY.getSymbolicName(t.getType());
        String categoria = identificarCategoria(nombreToken); // <--- Nueva función

        filasTokens.add(
            "<tr>" +
            "<td>" + escaparHTML(t.getText()) + "</td>" +
            "<td>" + nombreToken + "</td>" +
            "<td>" + categoria + "</td>" + // <--- Añadimos la categoría al HTML
            "<td>" + t.getLine() + "</td>" +
            "<td>" + t.getCharPositionInLine() + "</td>" +
            "</tr>"
        );
    }
}

// 4. Análisis sintáctico
            GramaticaParser parser = new GramaticaParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(errorCollector);

            org.antlr.v4.runtime.tree.ParseTree tree = parser.programa();

            // 5. Análisis Semántico (Llenado de Tabla de Símbolos)
            org.antlr.v4.runtime.tree.ParseTreeWalker walker = new org.antlr.v4.runtime.tree.ParseTreeWalker();
            AnalizadorSemantico analizadorSemantico = new AnalizadorSemantico(errorCollector);
            walker.walk(analizadorSemantico, tree); 

            // 6. Generar reportes HTML
            ReporteGenerator.generarHTML(
                "BitacoraTokens",
                "Reporte de Tokens",
                "<th>Lexema</th><th>Token</th><th>Categoría</th><th>Línea</th><th>Columna</th>",
                filasTokens
            );

            ReporteGenerator.generarHTML(
                "TablaDeSimbolos",
                "Tabla de Símbolos",
                "<th>Nombre</th><th>Tipo</th><th>Ámbito</th><th>Línea</th><th>Columna</th>",
                analizadorSemantico.tablaSimbolos.obtenerFilasHTML()
            );

            ReporteGenerator.generarHTML(
                "BitacoraErrores",
                "Reporte de Errores",
                "<th>Tipo</th><th>Línea</th><th>Columna</th><th>Lexema</th><th>Mensaje</th>",
                errorCollector.errores
            );

            System.out.println("-------------------------------------------------------");
            System.out.println("Proceso finalizado con exito");
            System.out.println("- Se genero: BitacoraTokens.html");
            System.out.println("- Se genero: TablaDeSimbolos.html");
            System.out.println("- Se genero: BitacoraErrores.html");
            System.out.println("-------------------------------------------------------");

        } catch (Exception e) {
            System.err.println("Error critico durante la ejecucion: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    private static String identificarCategoria(String nombreToken) {
    if (nombreToken == null) return "Desconocido";

    switch (nombreToken) {
        // Tipos de Datos
        case "PAL_NUMERO": case "PAL_REAL": case "PAL_PRECISO": 
        case "PAL_SIGNO": case "PAL_TEXTO": case "PAL_ESTADO": 
        case "PAL_VACIO":
            return "Tipo de Dato";

        // Estructuras de Control (Condicionales y Ciclos)
        case "PAL_VALIDAR": case "PAL_ALTERNO": case "PAL_SIGUIENTE":
        case "PAL_REPETIR": case "PAL_INICIAR": case "PAL_LOOP": // Aquí está el for
            return "Estructura de Control";

        // Palabras Reservadas de Funciones y E/S
        case "PAL_PROYECTAR": case "PAL_CAPTAR": 
        case "PAL_DAR": case "PAL_RAIZ":
        case "PAL_PARAR": case "PAL_SALTAR":
        case "PAL_ASIGNA":
            return "Palabra Reservada";

        // Operadores Aritméticos
        case "PAL_UNE": case "PAL_VECES": case "PAL_QUITA": 
        case "PAL_REPARTE": case "PAL_SOBRA":
            return "Operador Aritmético";

        // Operadores Relacionales
        case "PAL_SUPERA": case "PAL_BAJO": case "PAL_MINIMO": 
        case "PAL_TOPE": case "PAL_CALCA": case "PAL_AJENO":
            return "Operador Relacional";

        // Operadores Lógicos
        case "PAL_VINCULO": case "PAL_OPCION": case "PAL_OPUESTO":
            return "Operador Lógico";

        // Incremento y Decremento
        case "PAL_SUBIR": case "PAL_BAJAR":
            return "Incremento/Decremento";

        // Delimitadores y Símbolos
        case "CONTIENE": case "LISTO": case "HECHO": 
        case "ABRE": case "CIERRA": case "SEPARA":
            return "Símbolo/Delimitador";

        // Literales y Valores
        case "NUMERO":
            return "Literal Numérico";
        case "PAL_VERDAD": case "PAL_MENTIRA":
            return "Literal Booleano";
        case "IDENTIFICADOR":
            return "Identificador";

        // Componentes de la Cadena (Gracias al Modo del Lexer)
        case "CADENA_INICIO": case "CADENA_CIERRA":
            return "Delimitador de Cadena";
        case "TEXTO_CADENA":
            return "Contenido de Cadena";

        // Comentarios
        case "COMENTARIO_LINEA": case "COMENTARIO_BLOQUE":
            return "Comentario";

        default:
            return "Otros";
    }
}

    // Evita que caracteres especiales rompan el HTML
    private static String escaparHTML(String texto) {
        if (texto == null) {
            return "";
        }
        return texto
                .replace("&", "&amp;")
                .replace("<", "&lt;")
                .replace(">", "&gt;")
                .replace("\"", "&quot;")
                .replace("'", "&#39;");
    }
}