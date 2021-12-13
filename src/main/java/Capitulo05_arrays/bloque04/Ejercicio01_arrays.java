package Capitulo05_arrays.bloque04;

import java.util.Iterator;

public class Ejercicio01_arrays {
	
//	Crea una clase con un método “main” que cree un array de 150 posiciones y rellene el array con valores al azar entre 0 y 100
// Calcula el valor medio de todos los elementos del array. Calcula el porcentaje de todos los números del array que están debajo del valor medio.
	
	public static void main(String[] args) {
		int array[] = new int [150];
		int i;
		float media = 0, arrayTotal = 0, Porcentaje;
		
		for (i = 0; i < array.length; i++) {
		array[i] = (int) Math.round(Math.random() * 100);
		}
		
		for (i = 0; i < array.length; i++) {
			arrayTotal = arrayTotal + array[i];
		}
		
		for (i = 0; i < array.length; i++) {
			media = (arrayTotal /(float)150);
		}
		
		Porcentaje = (float) ((media*100)/ array.length);
		
		System.out.println("La media es : " + media);
		System.out.println("El porcentaje es : " + Porcentaje + "%");
}
}
