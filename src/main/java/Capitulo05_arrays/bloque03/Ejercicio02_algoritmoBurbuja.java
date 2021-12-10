package Capitulo05_arrays.bloque03;

import java.util.Iterator;

public class Ejercicio02_algoritmoBurbuja {

	public static void main(String[] args) {
		int array[] = new int[10];
		int auxiliar, auxiliar2,auxiliar3,i;
		
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
		auxiliar2 = j;
		array[auxiliar] = array[j];
		array[auxiliar2]  = array[i];
		array[auxiliar]= array[auxiliar2];
		}
		
		System.out.print("2º Array: ");
		for (j = 0; j< array.length; i++) {
			System.out.print(array[j] + " ");
		}
		System.out.println();
		}
}

}
