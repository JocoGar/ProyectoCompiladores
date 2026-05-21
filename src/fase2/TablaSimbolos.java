/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fase2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import proyectocompilador.ReporteGenerator;

public class TablaSimbolos {

    private static class Ambito {
        String nombre;
        int nivel;
        Ambito padre;
        Map<String, Simbolo> simbolos;

        Ambito(String nombre, int nivel, Ambito padre) {
            this.nombre = nombre;
            this.nivel = nivel;
            this.padre = padre;
            this.simbolos = new LinkedHashMap<>();
        }
    }

    private final List<Ambito> ambitos;
    private final List<Simbolo> simbolos;
    private Ambito actual;

    public TablaSimbolos() {
            Simbolo.reiniciarContadorIds();

        this.ambitos = new ArrayList<>();
        this.simbolos = new ArrayList<>();

        this.actual = new Ambito("global", 0, null);
        this.ambitos.add(actual);
    }

    public String getNombreAmbitoActual() {
        return actual.nombre;
    }

    public int getNivelAmbitoActual() {
        return actual.nivel;
    }

    public String getNombreAmbitoPadre() {
        return actual.padre == null ? "Ninguno" : actual.padre.nombre;
    }

    public void entrarAmbito(String nombre) {
        Ambito nuevo = new Ambito(nombre, actual.nivel + 1, actual);
        actual = nuevo;
        ambitos.add(nuevo);
    }

    public void salirAmbito() {
        if (actual.padre != null) {
            actual = actual.padre;
        }
    }

    public boolean declarar(Simbolo simbolo) {
        if (actual.simbolos.containsKey(simbolo.getNombre())) {
            return false;
        }

        actual.simbolos.put(simbolo.getNombre(), simbolo);
        simbolos.add(simbolo);
        return true;
    }

    public Simbolo buscar(String nombre) {
        Ambito temp = actual;

        while (temp != null) {
            if (temp.simbolos.containsKey(nombre)) {
                return temp.simbolos.get(nombre);
            }

            temp = temp.padre;
        }

        return null;
    }

    public Simbolo buscarGlobal(String nombre) {
        if (ambitos.isEmpty()) {
            return null;
        }

        Ambito global = ambitos.get(0);
        return global.simbolos.get(nombre);
    }

    public void registrarUso(String nombre) {
        Simbolo simbolo = buscar(nombre);

        if (simbolo != null) {
            simbolo.incrementarUso();
        }
    }

    public void registrarUsoGlobal(String nombre) {
        Simbolo simbolo = buscarGlobal(nombre);

        if (simbolo != null) {
            simbolo.incrementarUso();
        }
    }

    public void actualizarValor(String nombre, String valor) {
        Simbolo simbolo = buscar(nombre);

        if (simbolo != null) {
            simbolo.setValor(valor);
        }
    }

    public List<Simbolo> getSimbolos() {
        return simbolos;
    }

    public void generarReporteHTML() {
        ArrayList<String> filas = new ArrayList<>();

        for (Simbolo simbolo : simbolos) {
            filas.add(simbolo.toHtmlRow());
        }

        ReporteGenerator.generarHTML(
                "TablaSimbolos",
                "Tabla de Símbolos",
                "<th>ID</th>"
                + "<th>Nombre</th>"
                + "<th>Evento</th>"
                + "<th>Tipo</th>"
                + "<th>Rol</th>"
                + "<th>Ámbito</th>"
                + "<th>Clase Ámbito</th>"
                + "<th>Nivel</th>"
                + "<th>Línea</th>"
                + "<th>Columna</th>"
                + "<th>Última expresión asignada</th>"
                + "<th>Cantidad de usos</th>"
                + "<th>Tamaño arreglo</th>"
                + "<th>Cantidad parámetros</th>"
                + "<th>Tipos parámetros</th>",
                filas
        );
    }
}