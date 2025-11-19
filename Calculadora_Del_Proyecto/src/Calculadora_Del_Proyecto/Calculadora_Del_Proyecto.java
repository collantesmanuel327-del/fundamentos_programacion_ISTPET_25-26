package Calculadora_Del_Proyecto;

import java.util.ArrayList;

public class Calculadora_Del_Proyecto {

	public static void main(String[] args) {
		ArrayList<Double> numeros = new ArrayList<Double>();
		numeros.add(5.0);
		numeros.add(10.0);
		numeros.add(15.0);
		numeros.add(20.0);
		numeros.add(25.0);
		
		double suma = 0;
		for (double numero : numeros) {
			suma += numero;
			
			
		}
		
		
		double promedio = suma/ numeros.size();
		
		System.out.println("Promedio:" + promedio);

	}

}
