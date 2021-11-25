package Capitulo03.bloque04;

import java.util.Scanner;

public class Ejercicio04_buclesconwhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num, i;
		boolean numeroEsPrimo = true;
		
		System.out.println("Dame el número: ");
		num = sc.nextInt();
		
		i = 2;
		while (i < num) {
			if (num % i == 0) {
				numeroEsPrimo = false;
			}
			i++;
		}

		// Cuando acabe el bucle for, tendre una variable booleana que me
		// indicará si el número es primo o no lo es
		if (numeroEsPrimo == true) {
			System.out.println("El número " + num + " es primo");
		}
		else {
			System.out.println("El número " + num + " es compuesto");
		}
	}

}














































































