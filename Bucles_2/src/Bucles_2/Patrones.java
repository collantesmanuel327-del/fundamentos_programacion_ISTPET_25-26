package Bucles_2;

import java.util.Scanner;

public class Patrones {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        int n;

        do {
            System.out.println("\nMENU DE PATRONES");
            System.out.println("1. Triángulo rectángulo creciente");
            System.out.println("2. Triángulo rectángulo decreciente");
            System.out.println("3. Pirámide centrada");
            System.out.println("4. Rombo completo");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingrese el tamaño (1 a 20): ");
                n = sc.nextInt();

                if (n <= 0 || n > 20) {
                    System.out.println("Tamaño inválido");
                } else {
                    switch (opcion) {
                        case 1: trianguloCreciente(n); break;
                        case 2: trianguloDecreciente(n); break;
                        case 3: piramide(n); break;
                        case 4: rombo(n); break;
                    }
                }
            }
        } while (opcion != 0);
    }

    static void trianguloCreciente(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void trianguloDecreciente(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void piramide(int n) {
        for (int i = 1; i <= n; i++) {
            for (int e = n - i; e > 0; e--) {
                System.out.print(" ");
            }
            for (int a = 1; a <= (2 * i - 1); a++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void rombo(int n) {
        for (int i = 1; i <= n; i++) {
            for (int e = n - i; e > 0; e--) {
                System.out.print(" ");
            }
            for (int a = 1; a <= (2 * i - 1); a++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int e = n - i; e > 0; e--) {
                System.out.print(" ");
            }
            for (int a = 1; a <= (2 * i - 1); a++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
