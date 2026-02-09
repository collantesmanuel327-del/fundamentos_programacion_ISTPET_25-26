package MN;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EJEMPL {
    public static void main(String[] args) {
        try {
            BufferedWriter escritor = new BufferedWriter(new FileWriter("datos.txt"));
            escritor.write("Hola, este es un archivo de texto.");
            escritor.newLine();
            escritor.write("Ejemplo de escritura de archivos en Java.");
            escritor.close();
            System.out.println("Archivo escrito correctamente.");
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo.");
        }
    }
}
