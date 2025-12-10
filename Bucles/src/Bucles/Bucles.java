package Bucles;

import java.util.Scanner;

public class Bucles {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Tabla de numeros, escribe su numero");
		Integer n = sc.nextInt();
		Integer c = 0;
		while (true) {
			c+= 1;
			Integer m=n*c;
			System.out.print("\n" +n+ "*" +c+ "=" +m);
			if (12==c) {
				break;
			}
		}

	}

}
