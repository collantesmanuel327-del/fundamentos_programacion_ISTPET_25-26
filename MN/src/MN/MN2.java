package MN;

import java.util.Scanner;

public class MN2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Diccionario básico
        String[] diccionario = {
            "hola", "como", "estas", "tu"
        };

        System.out.println("Escribe una oración:");
        String oracion = sc.nextLine();

        String[] palabras = oracion.toLowerCase().split(" ");
        boolean error = false;

        for (String palabra : palabras) {
            palabra = palabra.replaceAll("[^a-záéíóúñ]", "");

            if (!existeEnDiccionario(palabra, diccionario)) {
                System.out.println("❌ Palabra incorrecta: " + palabra);
                error = true;
            }
        }

        if (!error) {
            System.out.println("✅ Correcto: (" + oracion + ")");
        } else {
            System.out.println("❌ Incorrecto: (" + oracion + ")");
        }

        sc.close();
    }

    // Método para verificar si la palabra es correcta
    public static boolean existeEnDiccionario(String palabra, String[] diccionario) {
        for (String correcta : diccionario) {
            if (palabra.equals(correcta)) {
                return true;
            }
        }
        return false;
    }
}

