package Capitulo01.bloque02;

import java.util.Scanner;

public class ejercicio07_condicionales {

	public static void main(String[] args) {
	
    int numero1, numero2;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Introduzca un número: ");
	numero1 = sc.nextInt();
	
	System.out.println("Introduzca un segundo número: ");
	numero2 = sc.nextInt();
	if (numero1 < numero2 ) {
		System.out.println("El número más grande es =>" + numero2 );
		
	}
	
	else {
		if(numero1 > numero2);
		System.out.println("El número más grande es =>" + numero1);
			
	}
	
		
	}

}
