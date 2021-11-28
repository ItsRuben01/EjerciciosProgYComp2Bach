package Capitulo05_arrays.bloque01;

public class Ejercicio01_arrays {

	public static void main(String[] args) {
		
		int array[] = new int[150];
		int suma = 0,media = 0,mayor = 0,menor = 0;
	
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		for (int i = 0; i < array.length; i++) {
			suma = suma + array[i];
		}
		
		for (int i = 0; i < array.length; i++) {
			media = (suma / 150);
		}
		
		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				mayor = array[i];
				menor = array[i];
			}
			else {
				if (array[i] > mayor) {
					mayor = array[i];
				}	
				if (array[i] < menor) {
					menor = array[i];
				}
			}
			
		}
		
		System.out.println("\nLa suma es : " + suma);
		System.out.println("La media es : " + media);
		System.out.println("El mayor es : " + mayor);
		System.out.println("El menor es : " + menor);

	}

}
