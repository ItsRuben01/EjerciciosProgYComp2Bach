package Capitulo01.bloque01;

import java.util.Scanner;

public class Ejemplo01_datos_de_usuario {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Porfavor, Introduzca un número →");
		int num = sc.nextInt();
		System.out.println("El número es →" +"  "+ num);

		System.out.println("Porfavor, Introduzca un número →");
		float num2 = sc.nextFloat();
        System.out.println("El número introducido es →" + num2);
        
        System.out.println("Porfavor, Introduzca un número →");
		double num3 = sc.nextDouble();
		System.out.println("El número introducido es →" + num3);
		
}
	 
	}
