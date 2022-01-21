package Capitulo04_OrientacionAObjetos.bloque00.Ejercicio01;

public class Ordenador {
	private int alturaCm;
	private int anchuraCm;
	private String color;
	private boolean esPortatil;
	private String marca;
	
	public Ordenador () {
		
	}
	

	public Ordenador(int alturaCm, int anchuraCm, String color, boolean esPortatil, String marca) {
		this.alturaCm = alturaCm;
		this.alturaCm = anchuraCm;
		this.color = color;
		this.esPortatil = esPortatil;
		this.marca = marca;
		System.out.println("Se acaba de construir un objeto");
		
	}

	public String toString() {
		return "Las propiedades del ordenador son alturaCm: " + alturaCm + ", anchuraCm: " + anchuraCm + 
				", color: " + color + ", esPortatil: " + esPortatil + ", marca: "+ marca;
	}
	
	public void setAlturaCm (int alturaCm) {
		this.alturaCm = alturaCm;
	}
	public int getAlturaCm () {
		return alturaCm;
	}
	
	
	public void setAnchuraCm (int anchuraCm) {
		this.anchuraCm = anchuraCm;
	}
	public int getAnchuraCm () {
		return anchuraCm;
	}
	
	
	public void setColor (String color) {
		this.color = color;
	}
	public String getColor () {
		return color;
	}
	
	
	public void setEsPortatil (boolean esPortatil) {
		this.esPortatil = esPortatil;
	}
	public boolean getEsPortatil () {
		return esPortatil;
	}
	
	
	public void setMarca (String marca) {
		this.marca = marca;
	}
	public String getMarca () {
		return marca;
	}

	
}