package Capitulo03.bloque02;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio03_buclesfor {

	public static void main(String[] args) {
Scanner sc = new Scanner (System.in);

float ec;
int valor = 2;
System.out.println("Introduzca las repeticiones que quiera hacer: ");
int rep = sc.nextInt();

	for (int i = 0; i < rep; i++) {
	System.out.println("Introduzca el número que quiere: ");
	float num = sc.nextFloat();
	ec = num * rep;
	
	System.out.println("Los múltiplos de dicho número son: ");
	if (ec < 100) {

		System.out.println("Los múltiplos son: " + ec);
	}
	else {
	
		if (ec > 100) {
	    System.out.println("NO hay más múltiplos de estos números ");
		}
	}
	}
	}

}
