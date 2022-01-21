package Capitulo04_OrientacionAObjetos.bloque00.Ejercicio02Perro;

public class Principal {

	public static void main(String[] args) {

	Perro Rudolf = new Perro();
	Rudolf.setColorPelo("Blanco");
	Rudolf.setNumeroDePatas(4);
	Rudolf.setAlturaOrejasCm(8);
	System.out.println(Rudolf.toString());	
	
	Perro Chuxo = new Perro("Marrón", 4 , 5);
	System.out.println(Chuxo.toString());
	

	}

}
