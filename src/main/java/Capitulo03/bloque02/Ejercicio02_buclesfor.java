package Capitulo03.bloque02;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio02_buclesfor {

	public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
int suma = 0;

System.out.println("Introduzca las repeticiones que quiera hacer: ");
int rep = sc.nextInt();

	for (int i = 0; i < rep; i++) {
	System.out.println("Introduzca el número que quiere: ");
	int num1 = sc.nextInt();
	if (suma > 10) {
    suma = suma + num1;		
	}
	}
	System.out.println("La suma vale: " + suma);
	}

}
