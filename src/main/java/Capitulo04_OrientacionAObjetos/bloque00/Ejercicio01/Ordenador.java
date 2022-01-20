package Capitulo04_OrientacionAObjetos.bloque00.Ejercicio01;

public class Ordenador {
	private int alturaCm;
	private int anchuraCm;
	private String color;
	private boolean esPortatil;
	private String marca;
	
	public Ordenador () {
		
	}
	

	public Ordenador(int newAlturaCm, int newAnchuraCm, String newColor, boolean newEsPortatil, String newMarca) {
		alturaCm = newAlturaCm;
		anchuraCm = newAnchuraCm;
		color = newColor;
		esPortatil = newEsPortatil;
		marca = newMarca;
		System.out.println("Se acaba de construir un objeto");
		
	}

	public String toString() {
		return "Las propiedades del ordenador son alturaCm: " + alturaCm + ", anchuraCm: " + anchuraCm + 
				", color: " + color + ", esPortatil: " + esPortatil + ", marca: "+ marca;
	}
	
	public void setAlturaCm (int newAlturaCm) {
		alturaCm = newAlturaCm;
	}
	public int getAlturaCm () {
		return alturaCm;
	}
	
	
	public void setAnchuraCm (int newAnchuraCm) {
		anchuraCm = newAnchuraCm;
	}
	public int getAnchuraCm () {
		return anchuraCm;
	}
	
	
	public void setColor (String newColor) {
		color = newColor;
	}
	public String getColor () {
		return color;
	}
	
	
	public void setEsPortatil (boolean newEsPortatil) {
		esPortatil = newEsPortatil;
	}
	public boolean getEsPortatil () {
		return esPortatil;
	}
	
	
	public void setMarca (String newMarca) {
		marca = newMarca;
	}
	public String getMarca () {
		return marca;
	}

	
}