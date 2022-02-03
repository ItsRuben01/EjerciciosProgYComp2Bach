package Capitulo04_OrientacionAObjetos.bloque00.EjercicioArticulosDeCompra;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		
		// Bucle que se ejecuta hasta que lo decida el usuario
		do {
			opcion = menu();
			
			switch (opcion) {
			case 1: // Se va a introducir un artículo comestible
				ArticulosComestibles ArticulosComestibles = new ArticulosComestibles();
				
				System.out.println("Introduzca el código del artículo: ");
				ArticulosComestibles.setCodigo(sc.nextInt());
				
				System.out.println("Introduzca el nombre del artículo: ");
				ArticulosComestibles.setNombre(sc.next());
				
				System.out.println("Introduzca el precio del artículo: ");
				ArticulosComestibles.setPrecio(sc.nextFloat());
				
				System.out.println("Introduzca la fecha de caducidad del artículo: ");
				ArticulosComestibles.setFechaCad(sc.next());
				
				System.out.println("Artículo comestible creado " + ArticulosComestibles.toString());
				
			case 2: // Se va a introducir un artículo de limpieza
				ArticulosLimpieza ArticulosLimpieza = new ArticulosLimpieza();
				
				System.out.println("Introduzca el código del artículo: ");
				ArticulosLimpieza.setCodigo(sc.nextInt());
				
				System.out.println("Introduzca el nombre del artículo: ");
				ArticulosLimpieza.setNombre(sc.next());
				
				System.out.println("Introduzca el precio del artículo: ");
				ArticulosLimpieza.setPrecio(sc.nextFloat());
				
				System.out.println("Introduzca si el artículo es ingífugo: ");
				ArticulosLimpieza.setEsElArticuloIgnifugo(sc.nextBoolean());
				
				System.out.println("Artículo de limpieza creado " + ArticulosLimpieza.toString());
				
			}
			
		} while (opcion != 0);
	}

	
	/**
	 * 
	 * @return
	 */
	public static int menu () {
		int opcion;
		Scanner sc = new Scanner(System.in);
		
		String textoMenu = "\n\n\tMENÚ" +
				"\n0.- Salir" + 
				"\n1.- Crear artículo comestible" + 
				"\n2.- Crear artículo de limpieza";
		
		System.out.println(textoMenu);
		opcion = sc.nextInt();
		return opcion;		
	}
}