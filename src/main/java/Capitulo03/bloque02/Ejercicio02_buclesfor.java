package Capitulo03.bloque02;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio02_buclesfor {

	public static void main(String[] args) {
Scanner sc = new Scanner (System.in);

int media = 0, num1,num2,cN;

System.out.println("Introduzca la cantidad de números que desee: ");
	cN = sc.nextInt();

	for (int i = 0; i < cN; i++) {
	System.out.println("Introduzca el número que quiere: ");
	num1 = sc.nextInt();
	System.out.println("Introduzca el número que quiere: ");
	num2 = sc.nextInt();
	
	if (num1 < num2 ) {
		System.out.println("El número más grande es =>" + num2 );	
	}
	else {
		if (num1 > num2) {
		System.out.println("El número más grande es =>" + num1);
	}	
		else {
		System.out.println("Los dos números son iguales => " + num1 + " y " + num2);
	     }
	}
	}		
	}

}







