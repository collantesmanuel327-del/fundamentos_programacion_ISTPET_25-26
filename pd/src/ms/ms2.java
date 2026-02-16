package ms;

import java.util.Scanner;

public class ms2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nombre;
        int edad = 0;
        String correo;

        // ======================================
        // VALIDACIÓN DE CAMPO OBLIGATORIO (NOMBRE)
        // ======================================
        do {
            System.out.print("Ingrese su nombre: ");
            nombre = sc.nextLine();

            if (nombre.trim().isEmpty()) {
                System.out.println("Error: El nombre es obligatorio.");
            }

        } while (nombre.trim().isEmpty());

        // ======================================
        // VALIDACIÓN DE TIPO DE DATO Y RANGO (EDAD)
        // ======================================
        boolean edadValida = false;

        while (!edadValida) {
            System.out.print("Ingrese su edad: ");

            try {
                edad = Integer.parseInt(sc.nextLine());

                if (edad >= 0 && edad <= 120) {
                    edadValida = true;
                } else {
                    System.out.println("Error: La edad debe estar entre 0 y 120 años.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un número válido.");
            }
        }

        // ======================================
        // VALIDACIÓN DE FORMATO (CORREO)
        // ======================================
        do {
            System.out.print("Ingrese su correo electrónico: ");
            correo = sc.nextLine();

            if (!correo.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
                System.out.println("Error: Formato de correo inválido.");
            }

        } while (!correo.matches("^[A-Za-z0-9+_.-]+@(.+)$"));

        // ======================================
        // MENSAJE FINAL
        // ======================================
        System.out.println("\nDatos ingresados correctamente:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Correo: " + correo);

        sc.close();
    }
}
