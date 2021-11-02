package Capitulo01.bloque01;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in); // Lee el teclado
	
			System.out.println("Introduzca un número:");
			int numEntero = sc.nextInt();
			
			System.out.println("Introduzca un número flotante:");
			float numFloat = sc.nextFloat();
			
			System.out.println("Introduzca un número doble:");
			double numDouble = sc.nextDouble();
	
			System.out.println(
			  "El número es → " + numEntero      
			+ "      El número es → " + numFloat     
		    + "      El número es → " + numDouble);
	 
  
	}

}
