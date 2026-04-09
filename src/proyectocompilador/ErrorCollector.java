/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectocompilador;

/**
 *
 * @author 1jose
 */
import org.antlr.v4.runtime.*;
import java.util.ArrayList;

public class ErrorCollector extends BaseErrorListener {
    public ArrayList<String> errores = new ArrayList<>();
    public ArrayList<Object[]> erroresPuros=new ArrayList<>();
    
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                            int line, int charPositionInLine, String msg, RecognitionException e) {

        String tipoError = (recognizer instanceof Lexer) ? "Léxico" : "Sintáctico";
        String lexema = "";

        if (offendingSymbol instanceof Token) {
            lexema = ((Token) offendingSymbol).getText();
        }

        errores.add(
            "<tr>" +
            "<td>" + tipoError + "</td>" +
            "<td>" + line + "</td>" +
            "<td>" + charPositionInLine + "</td>" +
            "<td>" + escaparHTML(lexema) + "</td>" +
            "<td>" + escaparHTML(msg) + "</td>" +
            "</tr>"
        );
        //[INICIO][9/4/2026][Rodrigo Juárez][creacion de la lista llamada "erroresPuros" para que sea más fácil llenar el jtable del Formulario "VistaPrincipal"]
        erroresPuros.add(new Object[]{tipoError, line, charPositionInLine, lexema, msg});
        //[FINAL][9/4/2026][Rodrigo Juárez][creacion de la lista llamada "erroresPuros" para que sea más fácil llenar el jtable del Formulario "VistaPrincipal"]
    }

    private String escaparHTML(String texto) {
        if (texto == null) return "";
        return texto
                .replace("&", "&amp;")
                .replace("<", "&lt;")
                .replace(">", "&gt;")
                .replace("\"", "&quot;")
                .replace("'", "&#39;");
    }
}