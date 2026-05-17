/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectocompilador;

public class CategoriaToken {

    public static String identificarCategoria(String nombreToken) {
        if (nombreToken == null) {
            return "Desconocido";
        }

        switch (nombreToken) {
            case "PAL_NUMERO":
            case "PAL_REAL":
            case "PAL_PRECISO":
            case "PAL_SIGNO":
            case "PAL_TEXTO":
            case "PAL_ESTADO":
            case "PAL_VACIO":
                return "Tipo de Dato";

            case "PAL_VALIDAR":
            case "PAL_ALTERNO":
            case "PAL_SIGUIENTE":
            case "PAL_REPETIR":
            case "PAL_INICIAR":
            case "PAL_LOOP":
                return "Estructura de Control";

            case "PAL_PROYECTAR":
            case "PAL_CAPTAR":
            case "PAL_DAR":
            case "PAL_RAIZ":
            case "PAL_PARAR":
            case "PAL_SALTAR":
            case "PAL_ASIGNA":
                return "Palabra Reservada";

            case "PAL_UNE":
            case "PAL_VECES":
            case "PAL_QUITA":
            case "PAL_REPARTE":
            case "PAL_SOBRA":
                return "Operador Aritmético";

            case "PAL_SUPERA":
            case "PAL_BAJO":
            case "PAL_MINIMO":
            case "PAL_TOPE":
            case "PAL_CALCA":
            case "PAL_AJENO":
                return "Operador Relacional";

            case "PAL_VINCULO":
            case "PAL_OPCION":
            case "PAL_OPUESTO":
                return "Operador Lógico";

            case "PAL_SUBIR":
            case "PAL_BAJAR":
                return "Incremento/Decremento";

            case "CONTIENE":
            case "LISTO":
            case "HECHO":
            case "ABRE":
            case "CIERRA":
            case "SEPARA":
                return "Símbolo/Delimitador";

            case "NUMERO":
                return "Literal Numérico";

            case "PAL_VERDAD":
            case "PAL_MENTIRA":
                return "Literal Booleano";

            case "IDENTIFICADOR":
                return "Identificador";

            case "CADENA_INICIO":
            case "CADENA_CIERRA":
                return "Delimitador de Cadena";

            case "TEXTO_CADENA":
                return "Contenido de Cadena";

            case "COMENTARIO_LINEA":
            case "COMENTARIO_BLOQUE":
                return "Comentario";
                
            case "PAL_LIGHT":
            case "PAL_CERRADO":
            case "PAL_DEFENSE":
                return "Estructura Switch/Case";

            case "ENTONCES":
                return "Símbolo/Delimitador";

            case "INICIO_PONCHO":
            case "FIN_PONCHO":
                return "Delimitador de Arreglo";
                
                case "PAL_REGISTRO":
    return "Registro/Estructura";

            case "PAL_CAMPO":
                return "Acceso a Campo";

            case "PAL_REFERENCIA":
                return "Referencia";

            case "PAL_AUMENTA":
            case "PAL_REDUCE":
            case "PAL_ESCALA":
            case "PAL_DIVIDE":
                return "Asignación Compuesta";

            case "PAL_SALTO":
                return "Literal Especial";

            default:
                return "Otros";
        }
    }
     public static String obtenerEquivalenteCpp(String nombreToken, String lexema) {
        if (nombreToken == null) {
            return "No aplica";
        }

        switch (nombreToken) {
            case "PAL_REGISTRO":
                return "estructura de datos";
            case "PAL_CAMPO":
                return "acceso a campo";
            case "PAL_REFERENCIA":
                return "paso por referencia";
            case "PAL_AUMENTA":
                return "asignación con suma";
            case "PAL_REDUCE":
                return "asignación con resta";
            case "PAL_ESCALA":
                return "asignación con multiplicación";
            case "PAL_DIVIDE":
                return "asignación con división";
            case "PAL_SALTO":
                return "salto de línea";
            // ==========================
            // Tipos de datos
            // ==========================
            case "PAL_NUMERO":
                return "int";
            case "PAL_REAL":
                return "float";
            case "PAL_PRECISO":
                return "double";
            case "PAL_SIGNO":
                return "char";
            case "PAL_TEXTO":
                return "string";
            case "PAL_ESTADO":
                return "bool";
            case "PAL_VACIO":
                return "void";

            // ==========================
            // Asignación
            // ==========================
            case "PAL_ASIGNA":
                return "=";

            // ==========================
            // Entrada / Salida
            // ==========================
            case "PAL_PROYECTAR":
                return "cout / print";
            case "PAL_CAPTAR":
                return "cin / input";

            // ==========================
            // Operadores relacionales
            // ==========================
            case "PAL_SUPERA":
                return ">";
            case "PAL_BAJO":
                return "<";
            case "PAL_MINIMO":
                return ">=";
            case "PAL_TOPE":
                return "<=";
            case "PAL_CALCA":
                return "==";
            case "PAL_AJENO":
                return "!=";

            // ==========================
            // Operadores lógicos
            // ==========================
            case "PAL_VINCULO":
                return "&&";
            case "PAL_OPCION":
                return "||";
            case "PAL_OPUESTO":
                return "!";

            // ==========================
            // Condicionales
            // ==========================
            case "PAL_VALIDAR":
                return "if";
            case "PAL_ALTERNO":
                return "else";
            case "PAL_SIGUIENTE":
                return "else if";

            // ==========================
            // Ciclos
            // ==========================
            case "PAL_REPETIR":
                return "while";
            case "PAL_INICIAR":
                return "do";
            case "PAL_LOOP":
                return "for";

            // ==========================
            // Control de flujo
            // ==========================
            case "PAL_PARAR":
                return "break";
            case "PAL_SALTAR":
                return "continue";
            case "PAL_DAR":
                return "return";

            // ==========================
            // Operadores aritméticos
            // ==========================
            case "PAL_UNE":
                return "+";
            case "PAL_VECES":
                return "*";
            case "PAL_QUITA":
                return "-";
            case "PAL_REPARTE":
                return "/";
            case "PAL_SOBRA":
                return "%";

            // ==========================
            // Switch / Case
            // Según la gramática actual
            // ==========================
            case "PAL_LIGHT":
                return "switch";
            case "PAL_CERRADO":
                return "case";
            case "PAL_DEFENSE":
                return "default";
            case "ENTONCES":
                return ":";

            // ==========================
            // Arreglos
            // Según tu gramática actual
            // ==========================
            case "INICIO_PONCHO":
                return "[";
            case "FIN_PONCHO":
                return "]";

            // ==========================
            // Otros
            // ==========================
            case "PAL_RAIZ":
                return "main";
            case "PAL_VERDAD":
                return "true";
            case "PAL_MENTIRA":
                return "false";
            case "PAL_SUBIR":
                return "++";
            case "PAL_BAJAR":
                return "--";

            case "CONTIENE":
                return "{";
            case "LISTO":
                return "}";
            case "HECHO":
                return ";";
            case "ABRE":
                return "(";
            case "CIERRA":
                return ")";
            case "SEPARA":
                return ",";

            case "CADENA_INICIO":
                return "inicio de string con comilla doble";
            case "CADENA_CIERRA":
                return "fin de string con comilla doble";
            case "TEXTO_CADENA":
                return "contenido de string";

            case "COMENTARIO_LINEA":
                return "//";
            case "COMENTARIO_BLOQUE":
                return "/* ... */";

            case "NUMERO":
                return "literal numérico";

            case "IDENTIFICADOR":
                return "identificador / variable / función";

            default:
                return "No aplica";
        }
    }
}