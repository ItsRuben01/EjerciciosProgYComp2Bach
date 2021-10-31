package Capitulo01.bloque01;

import java.util.Scanner;

public class ejercicio09_condicionales {

	public static void main(String[] args) {
	
  
    float num1;
    float ec1, ec2;
    float valor = 2;
    
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Introduzca un número: ");
	num1 = sc.nextFloat();
    
	ec1 = (num1 % valor);
	ec2 = (num1 / valor);
	
	System.out.println("El número es: ");
	if (ec1 == 0) {

		System.out.println("PAR => " + ec1);
	}
	else {
	
		if (ec2 > 0) {
	    System.out.println("IMPAR => " + ec2);
		}
	}
	}
	
		
	}

