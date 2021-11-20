package Capitulo03.bloque03;

import java.util.Scanner;

public class Ejercicio02_buclesfor {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int cN, num = 0, mayor = 0, menor = 0;
		float media = 0;
		
		System.out.println("Porfavor, introduzca los números que desee: ");
		cN = sc.nextInt();
		
		for (int i = 0; i<cN ;i++) {
		
		System.out.println("Introduzca un número: ");
		num = sc.nextInt();
		
		if  (num != 0) {
		mayor = num;
		menor = num;
		}
		else {
			if (num > mayor) {
				mayor = num;
			}
	
			if (num < menor) {
				menor = num;
			}	
		}
	}
	System.out.println("El número mayor es: "+ mayor + " y " + "El menor es: " + menor);

}

}















































































