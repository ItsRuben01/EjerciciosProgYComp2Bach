package Capitulo03.bloque02;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio03_buclesfor {

	public static void main(String[] args) {
Scanner sc = new Scanner (System.in);

float ec1,ec2;
int valor = 2;
System.out.println("Introduzca las repeticiones que quiera hacer: ");
int rep = sc.nextInt();

	for (int i = 0; i < rep; i++) {
	System.out.println("Introduzca el número que quiere: ");
	float num1 = sc.nextFloat();
	
	ec1 = (num1 % valor);
	ec2 = (num1 / valor);
	
	System.out.println("El número es: ");
	if (ec1 == 0) {

		System.out.println("PAR => " + ec1);
	}
	else {
	
		if (ec2 > 0) {
	    System.out.println("IMPAR => " + ec2);
		}
	}
	}
	}

}
