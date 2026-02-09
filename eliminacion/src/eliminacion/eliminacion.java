package eliminacion;

import java.util.Scanner;

public class eliminacion {

    // Tamaño máximo del arreglo
    static final int MAX_CLIENTES = 5;

    // Arreglos para almacenar la información
    static String[] nombres = new String[MAX_CLIENTES];
    static String[] cedulas = new String[MAX_CLIENTES];
    static String[] correos = new String[MAX_CLIENTES];

    // Contador de clientes
    static int totalClientes = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n SISTEMA DE GESTIÓN DE CLIENTES ");
            System.out.println("1. Agregar cliente");
            System.out.println("2. Listar clientes");
            System.out.println("3. Buscar cliente");
            System.out.println("4. Editar cliente");
            System.out.println("5. Eliminar cliente");
            System.out.println("6. Salir");
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
                    buscarClienteMenu(scanner);
                    break;
                case 4:
                    editarCliente(scanner);
                    break;
                case 5:
                    eliminarCliente(scanner);
                    break;
                case 6:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 6);

        scanner.close();
    }

    // Agregar cliente
    public static void agregarCliente(Scanner scanner) {
        if (totalClientes >= MAX_CLIENTES) {
            System.out.println("No se pueden registrar más clientes. Arreglo lleno.");
            return;
        }

        System.out.print("Ingrese nombre: ");
        nombres[totalClientes] = scanner.nextLine();

        System.out.print("Ingrese cédula: ");
        cedulas[totalClientes] = scanner.nextLine();

        System.out.print("Ingrese correo electrónico: ");
        correos[totalClientes] = scanner.nextLine();

        totalClientes++;
        System.out.println("Cliente registrado correctamente.");
    }

    // Listar clientes
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

    // Buscar cliente (retorna posición)
    public static int buscarCliente(String dato) {
        for (int i = 0; i < totalClientes; i++) {
            if (nombres[i].equalsIgnoreCase(dato) ||
                cedulas[i].equalsIgnoreCase(dato)) {
                return i;
            }
        }
        return -1;
    }

    // Buscar cliente desde menú
    public static void buscarClienteMenu(Scanner scanner) {
        System.out.print("Ingrese nombre o cédula a buscar: ");
        String dato = scanner.nextLine();

        int pos = buscarCliente(dato);

        if (pos == -1) {
            System.out.println("Cliente no encontrado.");
        } else {
            System.out.println("Cliente encontrado:");
            System.out.println("Nombre: " + nombres[pos]);
            System.out.println("Cédula: " + cedulas[pos]);
            System.out.println("Correo: " + correos[pos]);
        }
    }

    // Editar cliente
    public static void editarCliente(Scanner scanner) {
        System.out.print("Ingrese nombre o cédula del cliente a editar: ");
        String dato = scanner.nextLine();

        int pos = buscarCliente(dato);

        if (pos == -1) {
            System.out.println("Cliente no encontrado.");
            return;
        }

        System.out.print("Nuevo nombre: ");
        nombres[pos] = scanner.nextLine();

        System.out.print("Nueva cédula: ");
        cedulas[pos] = scanner.nextLine();

        System.out.print("Nuevo correo: ");
        correos[pos] = scanner.nextLine();

        System.out.println("Datos actualizados correctamente.");
    }

    // Eliminar cliente
    public static void eliminarCliente(Scanner scanner) {
        System.out.print("Ingrese nombre o cédula del cliente a eliminar: ");
        String dato = scanner.nextLine();

        int pos = buscarCliente(dato);

        if (pos == -1) {
            System.out.println("Cliente no encontrado.");
            return;
        }

        // Reorganizar arreglos
        for (int i = pos; i < totalClientes - 1; i++) {
            nombres[i] = nombres[i + 1];
            cedulas[i] = cedulas[i + 1];
            correos[i] = correos[i + 1];
        }

        totalClientes--;
        System.out.println("Cliente eliminado con éxito.");
    }
}
