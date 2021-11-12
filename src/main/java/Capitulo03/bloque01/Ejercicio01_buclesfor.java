package Capitulo03.bloque01;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio01_buclesfor {

	public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
int suma = 0;

	for (int i = 0; i < 4; i++) {
	System.out.println("Introduzca su  número ");
	int num1 = sc.nextInt();
	
	if (suma > 10) {
    suma = suma + num1;	
	System.out.println("La suma es → " + suma);	

	}
	}
	}

}
