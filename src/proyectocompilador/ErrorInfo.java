package proyectocompilador;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ErrorInfo {

    private final String tipo;
    private final int linea;
    private final int columna;
    private final String lexema;
    private final String mensaje;
    private final String equivalenciaCpp;

    public ErrorInfo(String tipo, int linea, int columna, String lexema, String mensaje) {
        this.tipo = tipo;
        this.linea = linea;
        this.columna = columna;
        this.lexema = lexema == null ? "" : lexema;
        this.mensaje = mensaje == null ? "" : mensaje;
        this.equivalenciaCpp = construirEquivalencia(this.lexema, this.mensaje);
    }

    private String construirEquivalencia(String lexema, String mensaje) {
        String equivalenciaLexema = EquivalenciaLenguaje.obtener(lexema);

        String palabraEntreComillas = extraerPrimeraPalabraEntreComillas(mensaje);
        String equivalenciaPalabraMensaje = EquivalenciaLenguaje.obtener(palabraEntreComillas);

        if (!equivalenciaLexema.isEmpty() && !equivalenciaPalabraMensaje.isEmpty()) {
            if (equivalenciaLexema.equals(equivalenciaPalabraMensaje)) {
                return equivalenciaLexema;
            }

            return equivalenciaLexema + ", " + equivalenciaPalabraMensaje;
        }

        if (!equivalenciaPalabraMensaje.isEmpty()) {
            return equivalenciaPalabraMensaje;
        }

        if (!equivalenciaLexema.isEmpty()) {
            return equivalenciaLexema;
        }

        return "Sin equivalencia directa";
    }

    private String extraerPrimeraPalabraEntreComillas(String texto) {
        if (texto == null) {
            return "";
        }

        Pattern patron = Pattern.compile("'([^']+)'");
        Matcher matcher = patron.matcher(texto);

        if (matcher.find()) {
            return matcher.group(1);
        }

        return "";
    }

    public String getTipo() {
        return tipo;
    }

    public int getLinea() {
        return linea;
    }

    public int getColumna() {
        return columna;
    }

    public String getLexema() {
        return lexema;
    }

    public String getMensaje() {
        return mensaje;
    }

    public String getEquivalenciaCpp() {
        return equivalenciaCpp;
    }

    public String toHtmlRow() {
        return "<tr>"
                + "<td>" + HtmlUtil.escaparHTML(tipo) + "</td>"
                + "<td>" + linea + "</td>"
                + "<td>" + columna + "</td>"
                + "<td>" + HtmlUtil.escaparHTML(lexema) + "</td>"
                + "<td>" + HtmlUtil.escaparHTML(mensaje) + "</td>"
                + "<td>" + HtmlUtil.escaparHTML(equivalenciaCpp) + "</td>"
                + "</tr>";
    }
}