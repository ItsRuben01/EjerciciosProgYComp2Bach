package Capitulo03.bloque01;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio03_buclesfor {

	public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
int suma = 0, contadorp = 0, contadorn = 0;

System.out.println("Introduzca las repeticiones que quiera hacer: ");
int rep = sc.nextInt();

	for (int i = 0; i < rep; i++) {
	System.out.println("Introduzca el número que quiere: ");
	int num1 = sc.nextInt();
	
	if (suma > 0) {
	    contadorp++;
	    
		}	
	if (suma < 0) {
		contadorn++;
		    
		}
	}
	System.out.println("Los número positivos son: " + contadorp );
	System.out.println("Los número negativos son: " + contadorn );
	}

}
