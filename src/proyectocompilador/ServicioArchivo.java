package proyectocompilador;

import java.awt.Desktop;
import java.io.File;
import java.nio.file.Files;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ServicioArchivo {

    public String leerArchivoSiExiste(String ruta) {
        try {
            File archivo = new File(ruta);

            if (!archivo.exists()) {
                return "";
            }

            return new String(Files.readAllBytes(archivo.toPath()));

        } catch (Exception e) {
            System.err.println("Error al leer archivo: " + e.getMessage());
            return "";
        }
    }

    public String seleccionarYLeerArchivo(JFrame ventanaPadre) {
        JFileChooser selector = new JFileChooser();

        selector.setDialogTitle("Seleccionar archivo de entrada");
        selector.setFileSelectionMode(JFileChooser.FILES_ONLY);

        FileNameExtensionFilter filtro = new FileNameExtensionFilter(
                "Archivos de texto (*.txt)", "txt"
        );

        selector.setFileFilter(filtro);

        int resultado = selector.showOpenDialog(ventanaPadre);

        if (resultado == JFileChooser.APPROVE_OPTION) {
            File archivoSeleccionado = selector.getSelectedFile();

            try {
                return new String(Files.readAllBytes(archivoSeleccionado.toPath()));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(
                        ventanaPadre,
                        "No se pudo leer el archivo seleccionado.\nDetalle: " + e.getMessage(),
                        "Error al cargar archivo",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        }

        return "";
    }

    public void abrirArchivoHTML(String ruta, JFrame ventanaPadre) {
        try {
            File archivo = new File(ruta);

            if (!archivo.exists()) {
                JOptionPane.showMessageDialog(
                        ventanaPadre,
                        "El archivo no existe todavía:\n" + archivo.getAbsolutePath()
                        + "\n\nPrimero debes compilar para generar el reporte.",
                        "Archivo no encontrado",
                        JOptionPane.WARNING_MESSAGE
                );
                return;
            }

            if (!Desktop.isDesktopSupported()) {
                JOptionPane.showMessageDialog(
                        ventanaPadre,
                        "Tu sistema no permite abrir archivos automáticamente.",
                        "Acción no soportada",
                        JOptionPane.WARNING_MESSAGE
                );
                return;
            }

            Desktop.getDesktop().open(archivo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    ventanaPadre,
                    "No se pudo abrir el archivo HTML.\nDetalle: " + e.getMessage(),
                    "Error al abrir HTML",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
}