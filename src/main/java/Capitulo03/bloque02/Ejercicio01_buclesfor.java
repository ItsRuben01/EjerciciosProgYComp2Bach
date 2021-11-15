 package Capitulo03.bloque02;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio01_buclesfor {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);

int media = 0, num,cN;

System.out.println("Introduzca la cantidad de números que desee: ");
	cN = sc.nextInt();

	for (int i = 0; i < cN; i++) {
	System.out.println("Introduzca el número que quiere: ");
	num = sc.nextInt();
	if (num > 0) {
		media = num/cN;
	}
	}		
	System.out.println("La media de dichos números son: " + media);
	}

}
