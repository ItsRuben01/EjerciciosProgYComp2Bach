package Capitulo01.bloque01;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in); // Lee el teclado
	
			System.out.println("Introduzca un número:");
			int numEntero = sc.nextInt();
			System.out.println("El número es → " + numEntero);
			
			System.out.println("Introduzca un número flotante:");
			float numFloat = sc.nextFloat();
			System.out.println("El número es →  " + numFloat);
			
			System.out.println("Introduzca un número doble:");
			double numDouble = sc.nextDouble();
			System.out.println("El número es →  " + numDouble);


	}

}
