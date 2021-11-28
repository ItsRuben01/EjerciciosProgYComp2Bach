package Capitulo05_arrays.bloque01;

import java.util.Arrays;

public class Ejercicio02_arrays {

	public static void main(String[] args) {
		
		int array[] = new int[5];
		int primero = 0, ultimo = 0;
		int i;
		
		for (i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);
		
		for (i = 0; i < array.length-i-1; i++) {
			ultimo = array[0];
			
			System.out.print(array[i] + " ");
			if (array[i+1] > array[i]) {
			
			primero = array[i+1];	
		    ultimo = array[i];
			}
		}
		
		}
	
	 System.out.print("\nEn orden inverso es: " + primero + ultimo);
		
	}

}
