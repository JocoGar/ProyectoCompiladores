/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase2;

import proyectocompilador.EquivalenciaLenguaje;
import java.util.ArrayList;
import java.util.List;
import proyectocompilador.HtmlUtil;

public class Simbolo {

    private static int contadorIds = 1;

        public static void reiniciarContadorIds() {
        contadorIds = 1;
    }
    
    private final int id;
    private final String nombre;
    private final TipoDato tipo;
    private final String rol;
    private final String ambito;
    private final int nivelAmbito;
    private final int linea;
    private final int columna;

    private String evento;
    private String valor;
    private int cantidadUsos;
    private int tamanioArreglo;
    private final List<TipoDato> parametros;

    public Simbolo(String nombre, TipoDato tipo, String rol, String ambito, int nivelAmbito, int linea, int columna) {
        this.id = contadorIds++;
        this.nombre = nombre;
        this.tipo = tipo;
        this.rol = rol;
        this.ambito = ambito;
        this.nivelAmbito = nivelAmbito;
        this.linea = linea;
        this.columna = columna;
        this.evento = "Declaración de " + rol;
        this.valor = "";
        this.cantidadUsos = 0;
        this.tamanioArreglo = 0;
        this.parametros = new ArrayList<>();
    }

    public int getId() {
        return id;
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

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public int getCantidadUsos() {
        return cantidadUsos;
    }

    public void incrementarUso() {
        this.cantidadUsos++;
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

    public String categoriaAmbito() {
        return nivelAmbito == 0 ? "Global" : "Local";
    }

public String toHtmlRow() {
    String tipoConEquivalencia = tipo.toString();

    String tipoCpp = EquivalenciaLenguaje.tipoDatoACpp(tipo.toString());

    if (!tipoCpp.isEmpty()) {
        tipoConEquivalencia += " (" + tipoCpp + ")";
    }

    String valorConEquivalencia = valor;

    String equivalenciaValor = EquivalenciaLenguaje.obtenerDesdeTexto(valor);

    if (!valorConEquivalencia.isEmpty() && !equivalenciaValor.isEmpty()) {
        valorConEquivalencia += " (" + equivalenciaValor + ")";
    }

    String parametrosConEquivalencia = parametrosTextoConCpp();

    return "<tr>"
            + "<td>" + id + "</td>"
            + "<td>" + HtmlUtil.escaparHTML(nombre) + "</td>"
            + "<td>" + HtmlUtil.escaparHTML(evento) + "</td>"
            + "<td>" + HtmlUtil.escaparHTML(tipoConEquivalencia) + "</td>"
            + "<td>" + HtmlUtil.escaparHTML(rol) + "</td>"
            + "<td>" + HtmlUtil.escaparHTML(ambito) + "</td>"
            + "<td>" + HtmlUtil.escaparHTML(categoriaAmbito()) + "</td>"
            + "<td>" + nivelAmbito + "</td>"
            + "<td>" + linea + "</td>"
            + "<td>" + columna + "</td>"
            + "<td>" + HtmlUtil.escaparHTML(valorConEquivalencia) + "</td>"
            + "<td>" + cantidadUsos + "</td>"
            + "<td>" + tamanioArreglo + "</td>"
            + "<td>" + parametros.size() + "</td>"
            + "<td>" + HtmlUtil.escaparHTML(parametrosConEquivalencia) + "</td>"
            + "</tr>";
}
public String parametrosTextoConCpp() {
    if (parametros.isEmpty()) {
        return "";
    }

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < parametros.size(); i++) {
        if (i > 0) {
            sb.append(", ");
        }

        TipoDato tipoParametro = parametros.get(i);
        String tipoCpp = EquivalenciaLenguaje.tipoDatoACpp(tipoParametro.toString());

        sb.append(tipoParametro);

        if (!tipoCpp.isEmpty()) {
            sb.append(" (").append(tipoCpp).append(")");
        }
    }

    return sb.toString();
}
}