package Clientes;
import java.util.Scanner;

public class Clientes {

    // Tamaño máximo del arreglo
    static final int MAX_CLIENTES = 5;

    // Arreglos para almacenar la información
    static String[] nombres = new String[MAX_CLIENTES];
    static String[] cedulas = new String[MAX_CLIENTES];
    static String[] correos = new String[MAX_CLIENTES];

    // Contador de clientes registrados
    static int totalClientes = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n SISTEMA DE GESTIÓN DE CLIENTES ");
            System.out.println("1. Registrar cliente");
            System.out.println("2. Listar clientes");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    agregarCliente(scanner);
                    break;
                case 2:
                    listarClientes();
                    break;
                case 3:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 3);

        scanner.close();
    }

    // Método para agregar clientes
    public static void agregarCliente(Scanner scanner) {
        if (totalClientes >= MAX_CLIENTES) {
            System.out.println("No se pueden registrar más clientes. El arreglo está lleno.");
            return;
        }

        System.out.print("Ingrese el nombre del cliente: ");
        nombres[totalClientes] = scanner.nextLine();

        System.out.print("Ingrese la cédula del cliente: ");
        cedulas[totalClientes] = scanner.nextLine();

        System.out.print("Ingrese el correo electrónico del cliente: ");
        correos[totalClientes] = scanner.nextLine();

        totalClientes++;
        System.out.println("Cliente registrado correctamente.");
    }

    // Método para listar clientes
    public static void listarClientes() {
        if (totalClientes == 0) {
            System.out.println("No hay clientes registrados.");
            return;
        }

        System.out.println("\n--- LISTA DE CLIENTES ---");
        for (int i = 0; i < totalClientes; i++) {
            System.out.println("Cliente #" + (i + 1));
            System.out.println("Nombre: " + nombres[i]);
            System.out.println("Cédula: " + cedulas[i]);
            System.out.println("Correo: " + correos[i]);
            System.out.println("------------------------");
        }
    }
}
