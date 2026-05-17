package proyectocompilador;

import java.util.LinkedHashMap;
import java.util.Map;

public class EquivalenciaLenguaje {

    private static final Map<String, String> equivalencias = new LinkedHashMap<>();

    static {
        // Tipos de datos
        equivalencias.put("num", "int");
        equivalencias.put("real", "float");
        equivalencias.put("preciso", "double");
        equivalencias.put("signo", "char");
        equivalencias.put("text", "string");
        equivalencias.put("estado", "bool");
        equivalencias.put("empty", "void");

        // Asignación
        equivalencias.put("asigna", "=");

        // Entrada / salida
        equivalencias.put("proyectar", "cout / print");
        equivalencias.put("captar", "cin / input");

        // Operadores aritméticos
        equivalencias.put("une", "+");
        equivalencias.put("veces", "*");
        equivalencias.put("quita", "-");
        equivalencias.put("reparte", "/");
        equivalencias.put("sobra", "%");

        // Operadores relacionales
        equivalencias.put("supera", ">");
        equivalencias.put("bajo", "<");
        equivalencias.put("minimo", ">=");
        equivalencias.put("tope", "<=");
        equivalencias.put("calca", "==");
        equivalencias.put("ajeno", "!=");

        // Operadores lógicos
        equivalencias.put("vinculo", "&&");
        equivalencias.put("opcion", "||");
        equivalencias.put("opuesto", "!");

        // Condicionales
        equivalencias.put("validar", "if");
        equivalencias.put("alterno", "else");
        equivalencias.put("siguiente", "else if");

        // Ciclos
        equivalencias.put("repetir", "while");
        equivalencias.put("iniciar", "do");
        equivalencias.put("loop", "for");

        // Switch / case según tu gramática real
        equivalencias.put("light", "switch");
        equivalencias.put("cerrado", "case");
        equivalencias.put("defense", "default");
        equivalencias.put("entonces", ":");

        // Control de flujo
        equivalencias.put("parar", "break");
        equivalencias.put("saltar", "continue");
        equivalencias.put("dar", "return");

        // Booleanos
        equivalencias.put("verdad", "true");
        equivalencias.put("mentira", "false");

        // Incremento / decremento
        equivalencias.put("subir", "++");
        equivalencias.put("bajar", "--");
        
        // Registros / estructuras
        equivalencias.put("registro", "estructura de datos");
        equivalencias.put("campo", "acceso a campo");
        equivalencias.put("referencia", "paso por referencia");

        // Asignaciones compuestas
        equivalencias.put("aumenta", "asignación con suma");
        equivalencias.put("reduce", "asignación con resta");
        equivalencias.put("escala", "asignación con multiplicación");
        equivalencias.put("divide", "asignación con división");

        // Literal especial
        equivalencias.put("salto", "salto de línea");

        // Delimitadores
        equivalencias.put("contiene", "{");
        equivalencias.put("listo", "}");
        equivalencias.put("hecho", ";");
        equivalencias.put("abre", "(");
        equivalencias.put("cierra", ")");
        equivalencias.put("separa", ",");

        // Arreglos según tu gramática real
        equivalencias.put("inicio_poncho", "[");
        equivalencias.put("fin_poncho", "]");

        // Cadenas y comentarios
        equivalencias.put("cadena", "\"");
        equivalencias.put("fin_cadena", "\"");
        equivalencias.put("nota", "//");
        equivalencias.put("apunte", "/*");
        equivalencias.put("fin_apunte", "*/");

        // Main
        equivalencias.put("raiz", "main");
    }

    public static String obtener(String palabra) {
        if (palabra == null || palabra.trim().isEmpty()) {
            return "";
        }

        String limpia = palabra.trim();

        if (equivalencias.containsKey(limpia)) {
            return limpia + " → " + equivalencias.get(limpia);
        }

        return "";
    }

    public static String obtenerDesdeTexto(String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            return "";
        }

        StringBuilder resultado = new StringBuilder();

        for (Map.Entry<String, String> entrada : equivalencias.entrySet()) {
            String palabra = entrada.getKey();

            if (texto.contains(palabra)) {
                if (resultado.length() > 0) {
                    resultado.append(", ");
                }

                resultado.append(palabra)
                        .append(" → ")
                        .append(entrada.getValue());
            }
        }

        return resultado.toString();
    }

    public static String agregarEquivalenciaAlMensaje(String mensaje) {
        String equivalencia = obtenerDesdeTexto(mensaje);

        if (equivalencia.isEmpty()) {
            return mensaje;
        }

        return mensaje + " (Equivalencia C++: " + equivalencia + ")";
    }

    public static String tipoDatoACpp(String tipo) {
        if (tipo == null) {
            return "";
        }

        switch (tipo) {
            case "NUM":
                return "int";
            case "REAL":
                return "float";
            case "PRECISO":
                return "double";
            case "SIGNO":
                return "char";
            case "TEXTO":
                return "string";
            case "ESTADO":
                return "bool";
            case "VACIO":
                return "void";
                case "REGISTRO":
    return "struct";
            default:
                return "";
        }
    }

    public static String rolACpp(String rol) {
        if (rol == null) {
            return "";
        }

        switch (rol.toLowerCase()) {
            case "variable":
                return "variable";
            case "arreglo":
                return "array";
            case "función":
                return "function";
            case "parametro":
            case "parámetro":
                return "parameter";
            default:
                return rol;
        }
    }
}