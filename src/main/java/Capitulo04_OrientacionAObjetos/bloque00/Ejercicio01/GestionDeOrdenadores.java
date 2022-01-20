
package Capitulo04_OrientacionAObjetos.bloque00.Ejercicio01;

import javax.swing.ImageIcon;

public class GestionDeOrdenadores {

	public static void main(String[] args) {
		Ordenador prueba1 = new Ordenador();
		prueba1.setAlturaCm(5);
		prueba1.setAnchuraCm(20);
		prueba1.setColor("Azul");
		prueba1.setEsPortatil(false);
		prueba1.setMarca("Asus");
		System.out.println(prueba1.toString());
		
		Ordenador prueba2 = new Ordenador();
		prueba2.setAlturaCm(4);
		prueba2.setAnchuraCm(25);
		prueba2.setColor("Blanco");
		prueba2.setEsPortatil(true);
		prueba2.setMarca("Lenovo");
		System.out.println(prueba2.toString());
		
	}

}