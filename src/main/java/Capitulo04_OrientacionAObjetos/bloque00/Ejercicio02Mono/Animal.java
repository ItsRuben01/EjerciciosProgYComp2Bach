package Capitulo04_OrientacionAObjetos.bloque00.Ejercicio02Mono;

public class Animal {

	private String colorPelo;
	private int numPatas;
	public Animal() {
		super();
	}
	public Animal(String colorPelo, int numPatas) {
		super();
		this.colorPelo = colorPelo;
		this.numPatas = numPatas;
	}
	public String getColorPelo() {
		return colorPelo;
	}
	public void setColorPelo(String colorPelo) {
		this.colorPelo = colorPelo;
	}
	public int getNumPatas() {
		return numPatas;
	}
	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}
	@Override
	public String toString() {
		return "Animal [colorPelo=" + colorPelo + ", numPatas=" + numPatas + "]";
	}
	
	
	
	
	
	
}
