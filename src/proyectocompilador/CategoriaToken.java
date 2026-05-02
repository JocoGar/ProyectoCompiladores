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

            default:
                return "Otros";
        }
    }
}