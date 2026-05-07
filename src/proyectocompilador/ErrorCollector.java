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

        return "El símbolo '" + lexema + "' no pertenece al lenguaje definido.";
    }

private String construirErrorSintactico(String lexema, String msg) {
    if (lexema == null || lexema.trim().isEmpty()) {
        lexema = "No identificado";
    }

    if (msg == null) {
        return "La estructura de la instrucción no es válida.";
    }

    if (msg.contains("CADENA_CIERRA")) {
        if ("EOF".equals(lexema)) {
            return "El programa terminó inesperadamente. Falta 'fin_cadena' para cerrar la cadena de texto.";
        }

        return "El cierre de cadena '" + lexema + "' no es válido. Debe escribirse exactamente como 'fin_cadena'.";
    }

    if ("EOF".equals(lexema)) {
        return "El programa terminó inesperadamente. Puede faltar 'listo', 'hecho', 'cierra' o 'fin_cadena'.";
    }

    if (msg.contains("CADENA_CIERRE_MAL")) {
        return "El cierre de cadena '" + lexema + "' está mal escrito. Debe usarse 'fin_cadena'.";
    }

    if (msg.contains("missing")) {
        return construirErrorElementoFaltante(msg);
    }

    if (msg.contains("mismatched input")) {
        return "La palabra o símbolo '" + lexema + "' no aparece en una posición válida según la gramática del lenguaje.";
    }

    if (msg.contains("extraneous input")) {
        return "El elemento '" + lexema + "' está de más o fue colocado en una posición incorrecta.";
    }

    if (msg.contains("no viable alternative")) {
        return "La instrucción cercana a '" + lexema + "' no coincide con ninguna estructura válida del lenguaje.";
    }

    return "Error sintáctico cerca de '" + lexema + "'. Revisa el orden y la estructura de la instrucción.";
}

    private String construirErrorElementoFaltante(String msg) {
        if (msg.contains("CADENA_CIERRA")) {
    return "Falta la palabra 'fin_cadena' para cerrar la cadena de texto.";
}
        if (msg.contains("HECHO")) {
            return "Falta la palabra 'hecho' al final de la instrucción.";
        }

        if (msg.contains("CIERRA")) {
            return "Falta la palabra 'cierra' para cerrar los paréntesis.";
        }

        if (msg.contains("ABRE")) {
            return "Falta la palabra 'abre' para abrir los paréntesis.";
        }

        if (msg.contains("LISTO")) {
            return "Falta la palabra 'listo' para cerrar el bloque.";
        }

        if (msg.contains("CONTIENE")) {
            return "Falta la palabra 'contiene' para iniciar el bloque.";
        }

        if (msg.contains("IDENTIFICADOR")) {
            return "Falta un identificador válido, como el nombre de una variable o función.";
        }

        if (msg.contains("NUMERO")) {
            return "Falta un valor numérico.";
        }

        return "Falta un elemento obligatorio en la instrucción.";
    }
}