package Capitulo05_arrays.bloque03;

import java.util.Iterator;

public class Ejercicio01_algoritmoBurbuja {

	public static void main(String[] args) {
		int array[] = new int[10];
		int auxiliar;
		boolean SeIntercambian;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);
		}

		System.out.print("1º Array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
	
		do {
			SeIntercambian = false;
			for (int i = 0; i < (array.length-1); i++) {
				if (array[i + 1] < array[i]) {
					auxiliar = array[i];
					array[i] = array[i+1];
					array[i+1] = auxiliar;
					SeIntercambian = true;
				}
			}
		} while (SeIntercambian == true);
	
		System.out.print("2º Array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
	}

}
