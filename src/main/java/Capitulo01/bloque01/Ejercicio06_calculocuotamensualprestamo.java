package Capitulo01.bloque01;

import java.util.Scanner;

public class Ejercicio06_calculocuotamensualprestamo {
	
	public static void main(String[] args) {

	int meses;
	
	float capital ,euribor , diferencial;
	float aux;
	float interesanual;
	float interesmensual;
	float cuotamensual;
	Scanner sc = new Scanner(System.in);

	
	
	System.out.println("Introduzca el capital");
    capital = sc.nextFloat();
    
    System.out.println("Este es el capital" + capital);
	
    System.out.println("Introduzca los meses");
    meses = sc.nextInt();
    
    System.out.println("Esto son los meses" + meses);
	
    System.out.println("Introduzca el euribor");
    euribor = sc.nextFloat();
    
    System.out.println("Este es el euribor" + euribor);
	
    System.out.println("Introduzca el diferencial");
    diferencial = sc.nextFloat();
    
    System.out.println("Este es el diferencial" + diferencial);
    
	// Comenzamos los cálculos
    
    interesanual = euribor + diferencial ;
	interesmensual = interesanual / 12 /100;
    aux = (float)Math.pow( 1 + interesmensual, meses);
  
    cuotamensual = capital *(interesmensual * aux)/(aux - 1 );
    System.out.println("Debes de pagar " + cuotamensual + "€");
    
}

	}