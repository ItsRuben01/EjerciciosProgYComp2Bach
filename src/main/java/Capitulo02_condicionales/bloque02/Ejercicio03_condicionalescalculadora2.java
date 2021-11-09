package Capitulo02_condicionales.bloque02;

import java.util.Scanner;

public class Ejercicio03_condicionalescalculadora2 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int opcion;
	double num1,num2,num1e,num2e,hp;
	
	System.out.println("Menú = ");
    System.out.println("1-. Hipotenusa de un triángulo");
    System.out.println("2-. Superficie de un círculo");
    System.out.println("3-. Perímetro de un círculo");
    System.out.println("4-. Área de un rectángulo");
    System.out.println("5-. Área de un triángulo");
    System.out.println("0-. Salir");

    System.out.println("Eliga una opción = ");
    opcion = sc.nextInt();

    switch (opcion) {
    case 0:
    	System.out.println("Saliendo de la aplicación... ↻");
    	break;
    	
    case 1: 
    	System.out.println("Seleccione el 1º cateto que desea : ");	
        num1 = sc.nextFloat();
        
        System.out.println("Seleccione el 2º cateto que desea : ");	
        num2 = sc.nextFloat();
         
        num1e = Math.pow(num1, 2);
        num2e = Math.pow(num1, 2);
        hp = Math.sqrt(num1e + num2e); // hipotenusa
        
    	System.out.println("La hipotenusa es: " + hp);
    	break;
    	
    case 2:
    	System.out.println("Seleccione el radio que desea : ");	
    	num1 = sc.nextFloat();
    
    	System.out.println("El área del círculo es: " + (Math.pow(num1, 2)* Math.PI) ); // Fórmula = R^2*PI
    	
    	break;
    	
    case 3: 
    	System.out.println("Seleccione el radio que desea : ");	
        num1 = sc.nextFloat();
      
    	System.out.println("El perímetro del círculo es: " + (2 * num1 * Math.PI)); // Fórmula = 2*PI*R
    	break;
    	
    case 4:
    	System.out.println("Seleccione la base que desea : ");	
        num1 = sc.nextFloat();
        
        System.out.println("Seleccione la altura que desea : ");	
        num2 = sc.nextFloat();
        
    	System.out.println("El área de un rectángulo es: " +(num1 * num2)); 	 	
    	
    	break;
    case 5:
    	System.out.println("Seleccione la base que desea : ");	
        num1 = sc.nextFloat();
        
        System.out.println("Seleccione la altura que desea : ");	
        num2 = sc.nextFloat();
        
    	System.out.println("El área de un triángulo es: "+ ((num1 * num2)/2));
	
    	break;
    default :
    	System.out.println("Opción incorrecta" + opcion);
    }	
	}
		
	
}
