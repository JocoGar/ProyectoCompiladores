/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectocompilador.TablaSimbolos;

import java.util.HashMap;
import java.util.ArrayList;

public class TablaSimbolos {
    
    private HashMap<String, Simbolo> tabla = new HashMap<>();

    public boolean agregarSimbolo(String nombre, String tipo, String ambito, int linea, int columna) {
        if (tabla.containsKey(nombre)) {
            return false; 
        }
        
        Simbolo nuevoSimbolo = new Simbolo(nombre, tipo, ambito, linea, columna);
        tabla.put(nombre, nuevoSimbolo);
        return true;
    }

    public Simbolo buscarSimbolo(String nombre) {
        return tabla.get(nombre);
    }

    public ArrayList<String> obtenerFilasHTML() {
        ArrayList<String> filas = new ArrayList<>();
        for (Simbolo s : tabla.values()) {
            filas.add(
                "<tr>" +
                "<td>" + s.getNombre() + "</td>" +
                "<td>" + s.getTipo() + "</td>" +
                "<td>" + s.getAmbito() + "</td>" +
                "<td>" + s.getLinea() + "</td>" +
                "<td>" + s.getColumna() + "</td>" +
                "</tr>"
            );
        }
        return filas;
    }
}