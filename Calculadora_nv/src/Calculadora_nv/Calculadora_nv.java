package Calculadora_nv;
import java.util.Scanner;

public class Calculadora_nv {

	public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
		System.out.print("Escriba la opcion ");
		System.out.print("\nIngrese 1er numero ");
		Integer n1 = sc.nextInt();
		System.out.print("Ingrese 2do numero ");
		Integer n2 = sc.nextInt();
		System.out.print("Ingrese la opcion ");
		Integer op = sc.nextInt();
		switch (op) {
		case 1:
			Integer sum = n1 + n2;
			System.out.print("la sum es:" + sum);
			break;
		case 2:
			Integer rest = n1 - n2;
			System.out.print("la rest es:" + rest);
			
			break;
		case 3:
			Integer mult = n1 * n2;
			System.out.print("la mult es: " + mult);
			break;
		case 4:
			Integer division = n1 / n2;
			System.out.print("la division es" + division);
		
		
			
		}
	}
  
  }
}

