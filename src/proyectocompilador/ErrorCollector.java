package proyectocompilador;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;

public class ErrorCollector extends BaseErrorListener {

    private final List<ErrorInfo> erroresInfo = new ArrayList<>();

@Override
public void syntaxError(
        Recognizer<?, ?> recognizer,
        Object offendingSymbol,
        int line,
        int charPositionInLine,
        String msg,
        RecognitionException e
) {
    String tipo = obtenerTipoError(recognizer);
    String lexema = obtenerLexema(offendingSymbol, msg);
    String mensaje = construirMensajePersonalizado(tipo, lexema, msg);

String equivalencia = construirEquivalenciaError(lexema, msg);

if (!equivalencia.isEmpty()) {
    mensaje = mensaje + " Equivalencia en C++: " + equivalencia + ".";
}

    erroresInfo.add(new ErrorInfo(
            tipo,
            line,
            charPositionInLine,
            lexema,
            mensaje
    ));
}

    public List<ErrorInfo> getErroresInfo() {
        return erroresInfo;
    }

    public boolean tieneErrores() {
        return !erroresInfo.isEmpty();
    }

    private String obtenerTipoError(Recognizer<?, ?> recognizer) {
        if (recognizer instanceof Lexer) {
            return "Léxico";
        }

        if (recognizer instanceof Parser) {
            return "Sintáctico";
        }

        return "Desconocido";
    }

    private String obtenerLexema(Object offendingSymbol, String msg) {
        if (offendingSymbol instanceof Token) {
            Token token = (Token) offendingSymbol;

            if (token.getType() == Token.EOF) {
                return "EOF";
            }

            if (token.getText() != null && !token.getText().trim().isEmpty()) {
                return token.getText();
            }
        }

        String lexemaDesdeMensaje = extraerLexemaDesdeMensaje(msg);

        if (!lexemaDesdeMensaje.isEmpty()) {
            return lexemaDesdeMensaje;
        }

        return "No identificado";
    }

    private String extraerLexemaDesdeMensaje(String msg) {
        if (msg == null) {
            return "";
        }

        Pattern patron = Pattern.compile("token recognition error at: '(.+?)'");
        Matcher matcher = patron.matcher(msg);

        if (matcher.find()) {
            return matcher.group(1);
        }

        Pattern patronInput = Pattern.compile("(mismatched input|extraneous input) '(.+?)'");
        Matcher matcherInput = patronInput.matcher(msg);

        if (matcherInput.find()) {
            return matcherInput.group(2);
        }

        return "";
    }

    private String construirMensajePersonalizado(String tipo, String lexema, String msg) {
        if ("Léxico".equals(tipo)) {
            return construirErrorLexico(lexema);
        }

        if ("Sintáctico".equals(tipo)) {
            return construirErrorSintactico(lexema, msg);
        }

        return "Se encontró un error no identificado durante el análisis.";
    }

private String construirErrorLexico(String lexema) {
    if (lexema == null || lexema.trim().isEmpty() || "No identificado".equals(lexema)) {
        return "Se encontró un símbolo no válido en el código fuente.";
    }

    String sugerencia = sugerirPalabraDelLenguaje(lexema);

    if (!sugerencia.isEmpty()) {
        return "El símbolo '" + lexema + "' no pertenece al lenguaje definido. "
                + "En este lenguaje debes usar '" + sugerencia + "' en lugar de '" + lexema + "'. "
                + "Equivalencia C++: " + sugerencia + " → " + lexema + ".";
    }

    return "El símbolo '" + lexema + "' no pertenece al lenguaje definido. "
            + "Verifica si intentaste usar directamente un símbolo de C++ en lugar de la palabra reservada del lenguaje.";
}

private String construirErrorSintactico(String lexema, String msg) {
    if (lexema == null || lexema.trim().isEmpty()) {
        lexema = "No identificado";
    }

    if (msg == null) {
        return "La estructura de la instrucción no es válida.";
    }

    String msgLower = msg.toLowerCase();

    if (msg.contains("CADENA_CIERRA") || obtenerElementoFaltante(msg).equals("fin_cadena")) {
        if ("EOF".equals(lexema)) {
            return "El programa terminó inesperadamente. Falta 'fin_cadena' para cerrar la cadena de texto.";
        }

        return "El cierre de cadena '" + lexema + "' no es válido. Debe escribirse exactamente como 'fin_cadena'.";
    }

    if ("EOF".equals(lexema)) {
        return "El programa terminó inesperadamente. Puede faltar 'listo', 'hecho', 'cierra' o 'fin_cadena'.";
    }

    if (msgLower.contains("missing")) {
        return construirErrorElementoFaltante(msg);
    }

    if (msgLower.contains("mismatched input")) {
        if (esperaba(msg, "hecho")) {
            return "La palabra o símbolo '" + lexema + "' no es válida en esta posición. Se esperaba 'hecho' para finalizar la instrucción.";
        }

        if (esperaba(msg, "cierra")) {
            return "La palabra o símbolo '" + lexema + "' no es válida en esta posición. Se esperaba 'cierra' para cerrar los paréntesis.";
        }

        if (esperaba(msg, "listo")) {
            return "La palabra o símbolo '" + lexema + "' no es válida en esta posición. Se esperaba 'listo' para cerrar el bloque.";
        }

if (esperaba(msg, "verdad") || esperaba(msg, "mentira") || esperaba(msg, "cadena")
        || esperaba(msg, "NUMERO") || esperaba(msg, "IDENTIFICADOR")) {
    return "La palabra o símbolo '" + lexema + "' no es válida en esta posición. Se esperaba una expresión válida.";
}

if (esperaba(msg, "IDENTIFICADOR")) {
    return "La palabra o símbolo '" + lexema + "' no es válida en esta posición. Se esperaba un identificador válido.";
}

if (esperaba(msg, "NUMERO")) {
    return "La palabra o símbolo '" + lexema + "' no es válida en esta posición. Se esperaba un número.";
}

        return "La palabra o símbolo '" + lexema + "' no aparece en una posición válida según la gramática del lenguaje.";
    }

    if (msgLower.contains("extraneous input")) {
        return "El elemento '" + lexema + "' está de más o fue colocado en una posición incorrecta.";
    }

    if (msgLower.contains("no viable alternative")) {
        return "La instrucción cercana a '" + lexema + "' no coincide con ninguna estructura válida del lenguaje.";
    }

    return "Error sintáctico cerca de '" + lexema + "'. Revisa el orden y la estructura de la instrucción.";
}

private String construirErrorElementoFaltante(String msg) {
    String faltante = obtenerElementoFaltante(msg);

    if (faltante.equals("fin_cadena")) {
        return "Falta la palabra 'fin_cadena' para cerrar la cadena de texto.";
    }

    if (faltante.equals("hecho")) {
        return "Falta la palabra 'hecho' al final de la instrucción.";
    }

    if (faltante.equals("cierra")) {
        return "Falta la palabra 'cierra' para cerrar los paréntesis.";
    }

    if (faltante.equals("abre")) {
        return "Falta la palabra 'abre' para abrir los paréntesis.";
    }

    if (faltante.equals("listo")) {
        return "Falta la palabra 'listo' para cerrar el bloque.";
    }

    if (faltante.equals("contiene")) {
        return "Falta la palabra 'contiene' para iniciar el bloque.";
    }

    if (faltante.equals("IDENTIFICADOR")) {
        return "Falta un identificador válido, como el nombre de una variable o función.";
    }

    if (faltante.equals("NUMERO")) {
        return "Falta un valor numérico.";
    }

    return "Falta un elemento obligatorio en la instrucción.";
}
private String obtenerElementoFaltante(String msg) {
    if (msg == null) {
        return "";
    }

    Pattern patronLiteral = Pattern.compile("missing '(.+?)'");
    Matcher matcherLiteral = patronLiteral.matcher(msg);

    if (matcherLiteral.find()) {
        return matcherLiteral.group(1);
    }

    Pattern patronToken = Pattern.compile("missing ([A-Z_]+)");
    Matcher matcherToken = patronToken.matcher(msg);

    if (matcherToken.find()) {
        return matcherToken.group(1);
    }

    return "";
}
private boolean esperaba(String msg, String esperado) {
    if (msg == null || esperado == null) {
        return false;
    }

    String marcador = "expecting";
    int indice = msg.toLowerCase().indexOf(marcador);

    if (indice == -1) {
        return false;
    }

    String parteEsperada = msg.substring(indice).toLowerCase();
    String esperadoLower = esperado.toLowerCase();

    return parteEsperada.contains("'" + esperadoLower + "'")
            || parteEsperada.contains(esperadoLower);
}

private String sugerirPalabraDelLenguaje(String simboloCpp) {
    if (simboloCpp == null) {
        return "";
    }

    switch (simboloCpp) {
        case "+":
            return "une";
        case "-":
            return "quita";
        case "*":
            return "veces";
        case "/":
            return "reparte";
        case "%":
            return "sobra";
        case "=":
            return "asigna";
        case ">":
            return "supera";
        case "<":
            return "bajo";
        case ">=":
            return "minimo";
        case "<=":
            return "tope";
        case "==":
            return "calca";
        case "!=":
            return "ajeno";
        case "&&":
            return "vinculo";
        case "||":
            return "opcion";
        case "!":
            return "opuesto";
        case "++":
            return "subir";
        case "--":
            return "bajar";
        case "{":
            return "contiene";
        case "}":
            return "listo";
        case ";":
            return "hecho";
        case "(":
            return "abre";
        case ")":
            return "cierra";
        case ",":
            return "separa";
        case "[":
            return "inicio_poncho";
        case "]":
            return "fin_poncho";
        case ":":
            return "entonces";
        case "\"":
            return "cadena / fin_cadena";
            case ".":
            return "campo";
        case "+=":
            return "aumenta";
        case "-=":
            return "reduce";
        case "*=":
            return "escala";
        case "/=":
            return "divide";
        case "&":
            return "referencia";
        default:
            return "";
    }
}
private String construirEquivalenciaError(String lexema, String msgOriginalAntlr) {
    String faltante = obtenerElementoFaltante(msgOriginalAntlr);

    if (faltante != null && !faltante.trim().isEmpty()) {
        String equivalenciaFaltante = EquivalenciaLenguaje.obtener(faltante);

        if (!equivalenciaFaltante.isEmpty()) {
            return equivalenciaFaltante;
        }
    }

    String equivalenciaLexema = EquivalenciaLenguaje.obtener(lexema);

    if (!equivalenciaLexema.isEmpty()) {
        return equivalenciaLexema;
    }

    return "";
}
}