package calcu_factorial;

import java.util.Scanner;

public class calcu_factorial {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Calculadora factorial: ");
			System.out.print("\nIngrese un numero: ");
			Integer n= sc.nextInt();
			int f= 1;
			//f empieza_con 1 y se_ira_multiplicando_por_las_cantidades_de_incremento
			//de_la_variable i, ademas_de_que n debe_ser_igual_o_mayor_a 0
			if (0<=n) {
				for (int i=1; i<=n; i++) {
					f=f*i;
				}
				System.out.print("La respuesta de la factorizacion es:" + f);
			}else {
				System.out.print("No se podra factorizar los numeros negativos:");
			}
		}

	}

}
