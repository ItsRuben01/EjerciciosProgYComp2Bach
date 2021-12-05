package Capitulo05_arrays.bloque03;

import java.util.Iterator;

public class Ejercicio02_algoritmoBurbuja {

	public static void main(String[] args) {
		int array[] = new int[10];
		int auxiliar, auxiliar2,auxiliar3,i;
		boolean SeIntercambian;
		
		for (i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);
		}

		System.out.print("1º Array: ");
		for (i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		// Bucle de ordenación
		auxiliar = i;
		for (int j = 1; j < (array.length-1); j++) {
		if (j < auxiliar) {
		auxiliar = j;
		auxiliar2  = i;
		i = auxiliar;
		auxiliar = auxiliar2;
		}
		}
		
		System.out.print("2º Array: ");
		for (i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
	}

}
