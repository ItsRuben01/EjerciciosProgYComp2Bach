package Capitulo05_arrays.bloque02;

import java.util.Scanner;

public class Ejercicio04_arrays {

	public static void main(String[] args) {
		int array[] = new int[] {1,2,3,4,5};
		int aux;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * (100 - (-100)) + (-100));
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		for (int i = array.length-2;i<=0; i--) {
		
		array[i] = array[i];
		
		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

} // TERMINAR CORREGIDO 
