package Capitulo05_arrays.bloque02;

import java.util.Scanner;

public class Ejercicio03_arrays {

	public static void main(String[] args) {
		int array[] = new int[10];
		int ec = 0;
		int num;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * (100 - (-100)) + (-100));
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		System.out.println("Digame el número por el que quiere multiplicar: ");
		num = sc.nextInt();
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.print((num * array[i]) + " ");
		}
	}

}
