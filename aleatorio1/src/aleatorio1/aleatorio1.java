package aleatorio1;
import java.util.Scanner;

public class aleatorio1 {

    public static void main(String[] args) {

        // Crear objeto Scanner para leer datos del usuario
        Scanner entrada = new Scanner(System.in);

        // Número fijo a adivinar (entre 1 y 100)
        int numeroSecreto = 57;

        int numeroUsuario;
        int intentos = 0;

        System.out.println("===");
        System.out.println("   JUEGO: ADIVINA EL NÚMERO");
        System.out.println("===");
        System.out.println("El número está entre 1 y 100.");
        System.out.println("¡Intenta adivinarlo!\n");

        // Estructura repetitiva 
        do {
            System.out.print("Ingrese su número: ");
            numeroUsuario = entrada.nextInt();
            intentos++;

            // Condicionales
            if (numeroUsuario > numeroSecreto) {
                System.out.println("El número ingresado es MAYOR al número secreto.\n");
            } else if (numeroUsuario < numeroSecreto) {
                System.out.println("El número ingresado es MENOR al número secreto.\n");
            } else {
                System.out.println("¡Correcto! Has adivinado el número.");
            }

        } while (numeroUsuario != numeroSecreto);

        // Mostrar total de intentos
        System.out.println("\nNúmero total de intentos: " + intentos);
        System.out.println("Gracias por jugar");

        // Cerrar Scanner
        entrada.close();
    }
}
