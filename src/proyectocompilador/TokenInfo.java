/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectocompilador;

public class TokenInfo {

    private String lexema;
    private String token;
    private String categoria;
    private int linea;
    private int columna;

    public TokenInfo(String lexema, String token, String categoria, int linea, int columna) {
        this.lexema = lexema;
        this.token = token;
        this.categoria = categoria;
        this.linea = linea;
        this.columna = columna;
    }

    public String getLexema() {
        return lexema;
    }

    public String getToken() {
        return token;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getLinea() {
        return linea;
    }

    public int getColumna() {
        return columna;
    }

    public String toHtmlRow() {
        String equivalenteCpp = CategoriaToken.obtenerEquivalenteCpp(token, lexema);

        return "<tr>"
                + "<td>" + HtmlUtil.escaparHTML(lexema) + "</td>"
                + "<td>" + HtmlUtil.escaparHTML(token) + "</td>"
                + "<td>" + HtmlUtil.escaparHTML(categoria) + "</td>"
                + "<td>" + HtmlUtil.escaparHTML(equivalenteCpp) + "</td>"
                + "<td>" + linea + "</td>"
                + "<td>" + columna + "</td>"
                + "</tr>";
    }
}