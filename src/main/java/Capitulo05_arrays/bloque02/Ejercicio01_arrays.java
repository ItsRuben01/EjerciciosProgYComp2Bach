package Capitulo05_arrays.bloque02;

public class Ejercicio01_arrays {

	public static void main(String[] args) {
		int array[] = new int[10];

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

		// Imprimo en consola los valores del array
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
	}

}
