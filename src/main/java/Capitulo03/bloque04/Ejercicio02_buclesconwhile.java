package Capitulo03.bloque04;

import java.util.Scanner;

public class Ejercicio02_buclesconwhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num, i, lim1, lim2,slim;
		boolean numeroEsPrimo = true;
		
		System.out.println("Dame el 1º límite que desee: ");
		lim1 = sc.nextInt();
		System.out.println("Dame el 2º límite que desee: ");
		lim2= sc.nextInt();
		i = 2;
		
		while (lim1 < lim2) {
			if (lim2 % i == 0) {
				numeroEsPrimo = false;
			}
			i++;
		}
       
		if (numeroEsPrimo == true) {
			System.out.println("El número " + lim2 + " es primo");
		}
		else {
			System.out.println("El número " + lim2 + " es compuesto");
		}
	}

}














































































