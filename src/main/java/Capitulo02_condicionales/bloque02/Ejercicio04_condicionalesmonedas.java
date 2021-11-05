package Capitulo02_condicionales.bloque02;

import java.util.Scanner;

public class Ejercicio04_condicionalesmonedas {

	public static void main(String[] args) {
		
// OPCIONES
int opcion,opcion1;
// MONEDAS
int mT = 2000;
int m100 = 100;
int m50 = 50;
int m25 = 25;
int m5 = 5;
int m1 = 1;

//PRODUCTOS
int pan = 375;
int agua = 250;
int fruta = 200;
int carne = 125;

Scanner sc = new Scanner(System.in);

System.out.println(" Menú de compra: ");
System.out.println("1-. Pan");
System.out.println("2-. Botella de agua");
System.out.println("3-. Fruta variada");
System.out.println("4-. Carne");

System.out.println("MONEDAS = " + mT);

System.out.println("Que es lo que desea comprar: ");
opcion = sc.nextInt();

switch (opcion) {
case 1:
	System.out.println("Usted va a comprar ◆ PAN ◆ son " + pan + " monedas");	
	System.out.println("¿Desea pagar? 1 = SI 2 = NO");
	opcion1 = sc.nextInt();

if (opcion1 == 2) {
System.out.println("Volviendo al menú...");	
}
else {
System.out.println("Pagando...");	
System.out.println("Usted ha pagado = " + mT);
System.out.println("Su vuelta de dinero es = " + ( mT - pan)); 

}
	break;
case 2:
	System.out.println("Usted va a comprar una ◆ BOTELLA DE AGUA ◆ son "+ agua + " monedas");	
	System.out.println("¿Desea pagar?");

	break;
case 3:
	System.out.println("Usted va a comprar ◆ FRUTA VARIADA ◆ son "+ fruta + " monedas");	
	System.out.println("¿Desea pagar?");

	break;
case 4:
	System.out.println("Usted va a comprar ◆ CARNE ◆ son "+ carne + " monedas");	
	System.out.println("¿Desea pagar?");
	break;

default:
	System.out.println("OPCIÓN INCORRECTA EN EL MENÚ" + opcion);
}
		
	}

}
