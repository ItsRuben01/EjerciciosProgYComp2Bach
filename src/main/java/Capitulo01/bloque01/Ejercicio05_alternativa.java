package Capitulo01.bloque01;

import java.util.Scanner;

public class Ejercicio05_alternativa {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in); 
    
	System.out.println("Introduzca 2 números a continuación");
	
	System.out.println("Introduzca el primer número:");
    double primero = sc.nextDouble();
    
    System.out.println("Introduzca el segundo número:");
    double segundo = sc.nextDouble();
    
    System.out.println("Las variables sin modificar son → " + primero +" ¦¦ " + segundo); // Antes del cambio
    
    double auxiliar = 5; // variable escondida
    double auxiliar2 = -3; // 2 variable escondida
    
    double mod = auxiliar + primero;
    double mod2 = auxiliar2 + segundo;
    
    System.out.println("Las variables modificadas son → " + mod + " ¦¦ " + mod2); 
    
    
    
    
    
	}

}
