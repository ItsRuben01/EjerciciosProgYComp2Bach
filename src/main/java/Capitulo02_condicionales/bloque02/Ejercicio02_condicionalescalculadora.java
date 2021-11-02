package Capitulo02_condicionales.bloque02;

import java.util.Scanner;

public class Ejercicio02_condicionalescalculadora {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int opcion;
	float num1, num2;
	
	System.out.println("Menú = ");
    System.out.println("1-. Raíces");
    System.out.println("2-. Potencias");
    System.out.println("3-. Módulo de división");
    
    System.out.println("Eliga una opción = ");
    opcion = sc.nextInt();

    if (4 < opcion) {
    
    System.out.println("Opción incorrecta");	
    
	}
    
    else {
		
    System.out.println("Seleccione el 1º número que desea : ");	
    num1 = sc.nextFloat();
    
    System.out.println("Seleccione el 2º número que desea : ");	
    num2 = sc.nextFloat();
    
    switch (opcion) {
    
    case 1: 
    	System.out.println("La raíz es: " + Math.pow(num1, 1/num2));
    	break;
    case 2: 
    	System.out.println("La potencia es: " + Math.pow(num1, num2) );
    	break;
    case 3: 
    	System.out.println("El módulo de división es: " + num1 % num2);
    	break;
    }	
	}
		
			
	}

}
