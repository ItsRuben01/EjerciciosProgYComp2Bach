package Capitulo05_arrays.bloque02;

public class Ejercicio02_arrays {

	public static void main(String[] args) {
		int array [] = new int[10];
		int num[] = new int[10];
		// Inicializo valores del array
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * (100 - (-100)) + (-100));
		}
		
		// Imprimo en consola los valores del array
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		// Cambio de signo los valores pares
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				array[i] = -array[i];
			}
		}
		
		for (int i = 0, impar = 0, par = 0; i < array.length; i++) {
			
		if(array[i] % 2 == 0) {
		num[par] = array[i];	
		}	
		else {
		num[impar] = -array[i];
		}
		
		}
		// Imprimo en consola los valores del array
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.print(num[i] + " ");
		}
		
	}

}
