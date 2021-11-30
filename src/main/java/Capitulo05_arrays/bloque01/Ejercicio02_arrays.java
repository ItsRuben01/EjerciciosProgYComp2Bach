package Capitulo05_arrays.bloque01;

import java.util.Arrays;

public class Ejercicio02_arrays {

	public static void main(String[] args) {
		
		int array[] = new int[5];
		int primero = 0, ultimo = 0;
		int i;
		
		for (i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);
		
		for (i = 0; i<array.length; i++) {
			
			System.out.print("\nEn orden es: " + array[i] + " ");
		}
		for (i = array.length-1 ; i >= 0; i--) {
			
			System.out.print("\nEn orden inverso es: " + array[i] + " ");
		}
		}
	}
}
	


