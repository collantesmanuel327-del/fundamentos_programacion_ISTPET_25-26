package ecuaciones;

import java.util.Scanner;

public class SistemaEcuacionesInteractivo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("RESOLUCION DE UN SISTEMA DE ECUACIONES CON DOS INCOGNITAS");
        System.out.println("Forma general:");
        System.out.println("a1*x + b1*y = c1");
        System.out.println("a2*x + b2*y = c2");
        System.out.println("Coloque las incognitas");

        // Ingreso de datos
        System.out.print("Ingrese a1: ");
        double a1 = sc.nextDouble();

        System.out.print("Ingrese b1: ");
        double b1 = sc.nextDouble();

        System.out.print("Ingrese c1: ");
        double c1 = sc.nextDouble();

        System.out.print("Ingrese a2: ");
        double a2 = sc.nextDouble();

        System.out.print("Ingrese b2: ");
        double b2 = sc.nextDouble();

        System.out.print("Ingrese c2: ");
        double c2 = sc.nextDouble();

        // Calculo del determinante
        double determinante = (a1 * b2) - (a2 * b1);

        if (determinante != 0) {
            double x = ((c1 * b2) - (c2 * b1)) / determinante;
            double y = ((a1 * c2) - (a2 * c1)) / determinante;

            System.out.println("\nRESULTADO:");
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        } else {
            System.out.println("\nEl sistema no tiene solucion unica.");
            System.out.println("Puede tener infinitas soluciones o no tener solucion.");
        }

        sc.close();
    }


        }
    

