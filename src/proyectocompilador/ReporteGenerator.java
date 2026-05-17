package proyectocompilador;

import java.io.PrintWriter;
import java.util.ArrayList;

public class ReporteGenerator {

    public static void generarHTML(String nombre, String titulo, String encabezados, ArrayList<String> filas) {
        try (PrintWriter pw = new PrintWriter(nombre + ".html", "UTF-8")) {

            pw.println("<!DOCTYPE html>");
            pw.println("<html>");
            pw.println("<head>");
            pw.println("<meta charset='UTF-8'>");
            pw.println("<title>" + HtmlUtil.escaparHTML(titulo) + "</title>");
            pw.println("<style>");
            pw.println("body { font-family: Arial, sans-serif; margin: 30px; }");
            pw.println("h1 { color: #2e5984; }");
            pw.println("table { border-collapse: collapse; width: 100%; }");
            pw.println("th { background-color: #c0392b; color: white; padding: 8px; }");
            pw.println("td { border: 1px solid #999; padding: 8px; }");
            pw.println("tr:nth-child(even) { background-color: #f2f2f2; }");
            pw.println("</style>");
            pw.println("</head>");
            pw.println("<body>");
            pw.println("<h1>" + HtmlUtil.escaparHTML(titulo) + "</h1>");
            pw.println("<table>");
            pw.println("<tr>" + encabezados + "</tr>");

            for (String fila : filas) {
                pw.println(fila);
            }

            pw.println("</table>");
            pw.println("</body>");
            pw.println("</html>");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}