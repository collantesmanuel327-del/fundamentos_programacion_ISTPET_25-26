package aleatorio;

import java.util.Scanner;

public class aleatorio {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)) {
			int c = 0;
			int r = (int) (Math.random()*100+1);
			while (true) {
				c=c+1;
				System.out.print("Ingrese el numero generado: ");
				Integer n= sc.nextInt();
				if(n<r) {
					System.out.print("Es menor al generado: ");
				}
				if (n>r) {
					System.out.print("Es mayor al generado:");
				}
				if (n==r) {
					System.out.print("Correcto: ");
					break;
				}
				if (c==10) {
					System.out.println("Que pena: ");
					break;
				}
			}
			System.out.println("\nLas veces que lo intento fueron: " + c);
		}

	}

}
