package Capitulo04_OrientacionAObjetos.bloque00.EjercicioMueble;

import java.util.Scanner;

import Capitulo04_OrientacionAObjetos.bloque00.EjercicioArticulosDeCompra.Articulo;

public class Principal {

	public static void main(String[] args) {

	int opcion;
	Scanner sc = new Scanner (System.in);
	
	/**
	 * 	Inicio Do y While
	 */
	
	do {
	
		opcion = menu();
		 System.out.println("Eliga una opción: ");
		 opcion = sc.nextInt();

		switch (opcion) {
		case 1: 
			
		Armario armario = new Armario();
		
		System.out.println("Introduzca el color del mueble: ");
		armario.setMueblecolor(sc.next());
		
		System.out.println("Introduzca el tipo de madera del mueble: ");
		armario.setTipoMadera(sc.next());
		
		System.out.println("Introduzca el número de Puertas del mueble: ");
		armario.setNumeroPuertas(sc.nextInt());
		
		System.out.println("Nuevo Armario creado: " + armario.toString());
		
		break;
		case 2:
			
		Silla Silla = new Silla();
		System.out.println("Introduzca el color de la silla: ");
		Silla.setTipoMadera(sc.next());
		
		System.out.println("Introduzca el tipo de madera de la silla: ");
		Silla.setTipoMadera(sc.next());
		
		System.out.println("Introduzca el numero de patas de la silla: ");
		Silla.setNumeroPatas(sc.nextInt());
		
		System.out.println("Nueva silla creada" + Silla.toString());
		
		break;
		
		}
 	
		
	} while (opcion != 0);
	
	System.out.println("Saliendo del system... ");
		
	/**
	 *  Menú de la consola
	 * 	
	 */
	}
	
	public static int menu() {
		int opcion;
		Scanner sc = new Scanner(System.in);
		
		String Menu = "\n\n\tMENÚ" +
				"\n0.- Salir" + 
				"\n1.- Crear Armario" + 
				"\n2.- Crear Silla";
		
		System.out.println(Menu);
		opcion = sc.nextInt();
		return opcion;	
	}

}
