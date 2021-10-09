package Capitulo01.bloque01;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in); 
	
			System.out.println("Introduzca un número:");
			int numEntero = sc.nextInt();
			
			
			System.out.println("Introduzca un número flotante:");
			float numFloat = sc.nextFloat();
			
			
			System.out.println("Introduzca un número doble:");
			double numDouble = sc.nextDouble();
			
			double suma = (numEntero + numFloat + numDouble)/3;
			System.out.println("La media de los tres números es → " + suma);
			

	}

}
 