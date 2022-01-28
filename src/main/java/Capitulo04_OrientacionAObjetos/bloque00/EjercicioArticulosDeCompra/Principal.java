package Capitulo04_OrientacionAObjetos.bloque00.EjercicioArticulosDeCompra;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

	int opcion;
	Scanner sc = new Scanner (System.in);
	
	do {
	
		 System.out.println("Eliga una opción: ");
		 opcion = sc.nextInt();

		switch (opcion) {
		case 1: 
		Articulo Limp = new Articulo();
		Limp.setCodigo(344636);
		Limp.setNombre("Fairy");
		Limp.setPrecio(2);
		Limp.toString();
		case 2:
		Articulo Comes = new Articulo();
		Comes.setCodigo(451641);
		Comes.setNombre("Lata de atún |Calvo|");
		Comes.setPrecio(1);
		Comes.toString();
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
