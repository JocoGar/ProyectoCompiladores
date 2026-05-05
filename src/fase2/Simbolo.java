/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase2;

import java.util.ArrayList;
import java.util.List;
import proyectocompilador.HtmlUtil;

public class Simbolo {

    private final String nombre;
    private final TipoDato tipo;
    private final String rol;
    private final String ambito;
    private final int nivelAmbito;
    private final int linea;
    private final int columna;
    private int tamanioArreglo;
    private final List<TipoDato> parametros;

    public Simbolo(String nombre, TipoDato tipo, String rol, String ambito, int nivelAmbito, int linea, int columna) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.rol = rol;
        this.ambito = ambito;
        this.nivelAmbito = nivelAmbito;
        this.linea = linea;
        this.columna = columna;
        this.tamanioArreglo = 0;
        this.parametros = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public TipoDato getTipo() {
        return tipo;
    }

    public String getRol() {
        return rol;
    }

    public String getAmbito() {
        return ambito;
    }

    public int getNivelAmbito() {
        return nivelAmbito;
    }

    public int getLinea() {
        return linea;
    }

    public int getColumna() {
        return columna;
    }

    public int getTamanioArreglo() {
        return tamanioArreglo;
    }

    public void setTamanioArreglo(int tamanioArreglo) {
        this.tamanioArreglo = tamanioArreglo;
    }

    public List<TipoDato> getParametros() {
        return parametros;
    }

    public void agregarParametro(TipoDato tipo) {
        parametros.add(tipo);
    }

    public String parametrosTexto() {
        if (parametros.isEmpty()) {
            return "";
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < parametros.size(); i++) {
            if (i > 0) {
                sb.append(", ");
            }

            sb.append(parametros.get(i));
        }

        return sb.toString();
    }

    public String toHtmlRow() {
        return "<tr>"
                + "<td>" + HtmlUtil.escaparHTML(nombre) + "</td>"
                + "<td>" + HtmlUtil.escaparHTML(tipo.toString()) + "</td>"
                + "<td>" + HtmlUtil.escaparHTML(rol) + "</td>"
                + "<td>" + HtmlUtil.escaparHTML(ambito) + "</td>"
                + "<td>" + (nivelAmbito == 0 ? "Global" : "Local") + "</td>"
                + "<td>" + nivelAmbito + "</td>"
                + "<td>" + linea + "</td>"
                + "<td>" + columna + "</td>"
                + "<td>" + tamanioArreglo + "</td>"
                + "<td>" + HtmlUtil.escaparHTML(parametrosTexto()) + "</td>"
                + "</tr>";
    }
}