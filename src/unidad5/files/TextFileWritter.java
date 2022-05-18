package unidad5.files;

import java.io.*;

/**
 * @author Denisse
 */
public class TextFileWritter {
    public static void main(String[] args) {
        FileWriter fichero = null;
        PrintWriter pw;
        try {
            // Si deseamos agregar información al final del archivo,
            // se agrega un 2do parámetro a FileWriter en true,
            fichero = new FileWriter(System.getenv("HOME") + "/Documents/Fichero.txt");
            pw = new PrintWriter(fichero);
            for (int i = 0; i < 10; i++) {
                pw.println("Linea " + i + "-" + i);
            }
        } catch (Exception e) {
            System.out.println("Mensaje de error:" + e.getMessage());
        } finally {
            try {
                if (fichero != null) {
                    fichero.close();
                }
            } catch (Exception e2) {
                System.out.println("Error al cerrar el fichero.");
            }
        }
    }
}