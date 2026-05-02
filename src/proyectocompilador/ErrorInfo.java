/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectocompilador;


public class ErrorInfo {

    private final String tipo;
    private final int linea;
    private final int columna;
    private final String lexema;
    private final String mensaje;

    public ErrorInfo(String tipo, int linea, int columna, String lexema, String mensaje) {
        this.tipo = tipo;
        this.linea = linea;
        this.columna = columna;
        this.lexema = lexema;
        this.mensaje = mensaje;
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

    public String toHtmlRow() {
        return "<tr>"
                + "<td>" + HtmlUtil.escaparHTML(tipo) + "</td>"
                + "<td>" + linea + "</td>"
                + "<td>" + columna + "</td>"
                + "<td>" + HtmlUtil.escaparHTML(lexema) + "</td>"
                + "<td>" + HtmlUtil.escaparHTML(mensaje) + "</td>"
                + "</tr>";
    }
}