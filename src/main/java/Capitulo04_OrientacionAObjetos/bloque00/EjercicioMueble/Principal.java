package Capitulo04_OrientacionAObjetos.bloque00.EjercicioMueble;

import java.util.Scanner;

import Capitulo04_OrientacionAObjetos.bloque00.EjercicioArticulosDeCompra.Articulo;

public class Principal {

	public static void main(String[] args) {

	int opcion;

	Scanner sc = new Scanner (System.in);
	
	do {
	
		 System.out.println("Eliga una opción: ");
		 opcion = sc.nextInt();

		switch (opcion) {
		case 1: 
			
		Articulo Mueble = new Articulo();
		Mueble.setCodigo(opcion);
		Mueble.setNombre(null);
		Mueble.setPrecio(opcion);;
		Mueble.toString();
		
		case 2:
		Articulo Silla = new Articulo();
		Silla.setCodigo(451641);
		Silla.setNombre("Lata de atún |Calvo|");
		Silla.setPrecio(1);
		Silla.toString();
		}
 	
		
	} while (opcion != 0);
	
	System.out.println("Saliendo del system... ");
		
		
	}
	
	void menu() {
		 System.out.println("\nMenú");
		 System.out.println("\n\t0- Salir");		 
		 System.out.println("\n\t1- Art. Comestible");		
		 System.out.println("\n\t2- Art. de Limpieza");
		 
		
		
		
	}

}
