package Capitulo03.bloque03;

import java.util.Scanner;

public class Ejercicio01_buclesfor {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int num = 0, suma = 0;
		float media = 0;
		//Pido números denro del bucle
		
		for (int i = 0; num != 0 ;i++) {
		 //Pido el número
		System.out.println("Introduzca un número: ");
		num = sc.nextInt();
		
		suma += num;
		
		if  (num!= 0) {
		media = suma/(float)(i + 1);
				
		}
		System.out.println("La media de dichos números son: "+ media);
		}
	}

}















































































