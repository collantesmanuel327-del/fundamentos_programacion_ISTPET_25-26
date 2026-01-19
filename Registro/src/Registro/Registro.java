package Registro;

import java.util.Scanner;

public class Registro {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Ingrese su nombre: ");
			String nombre = sc.next();
			System.out.print("Ingrese el apellido: ");
			String apellido = sc.next();
			System.out.print("Ingrese su cedula: ");
			Integer id =sc.nextInt();
			System.out.print("Ingrese su correo electronico: ");
			String correo = sc.next();
			System.out.print("Ingrese su contraseña: ");
			String pasword1 = sc.next();
			System.out.print("Confirme su contraseña: ") ;
			String pasword2 = sc.next();
			//comparar_datos_tipo stings_para_verificar_si son_iguales o no
			if(pasword1.equals(pasword2)) {
				System.out.print("\nSus datos son:");
				System.out.print("\nNombre y apellido:" +nombre+" "+apellido);
				System.out.print("\nSu cedula es:" +id);
				System.out.print("\nSu correo electronico es:" +correo);
				System.out.print("\nRegistro exitoso");
			}else{
				System.out.print("las contraseñas no son iguales");
			}
		}
		
		
		

	}

}
