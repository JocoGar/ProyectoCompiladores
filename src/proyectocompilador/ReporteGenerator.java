/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectocompilador;

/**
 *
 * @author 1jose
 */
import java.io.PrintWriter;
import java.util.ArrayList;

public class ReporteGenerator {
    public static void generarHTML(String nombre, String titulo, String encabezados, ArrayList<String> filas) {
        try (PrintWriter pw = new PrintWriter(nombre + ".html")) {
            pw.println("<html><head><meta charset='UTF-8'><title>" + titulo + "</title></head><body>");
            pw.println("<h1>" + titulo + "</h1><table border='1'><tr>" + encabezados + "</tr>");
            for (String fila : filas) pw.println(fila);
            pw.println("</table></body></html>");
        } catch (Exception e) { e.printStackTrace(); }
    }
}