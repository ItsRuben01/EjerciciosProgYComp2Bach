package Capitulo02_condicionales.bloque01;

import java.util.Scanner;

public class Ejercicio02_condicionales {

	public static void main(String[] args) {
	
    int numero1, numero2;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Introduzca un número: ");
	numero1 = sc.nextInt();
	
	System.out.println("Introduzca un segundo número: ");
	numero2 = sc.nextInt();
	if (numero1 > numero2 ) {
		System.out.println("El número más pequeño es =>" + numero2 );
		
	}
	
	else {
		if(numero1 < numero2);
		System.out.println("El número más pequeño es =>" + numero1);
			
	}
	
		
	}

}
