package Capitulo04_OrientacionAObjetos.bloque00.Ejercicio02Perro;

public class Perro {

private String colorPelo;
private int numeroDePatas;
private int alturaOrejasCm;
public Perro() {
	super();
}
public Perro(String colorPelo, int numeroDePatas, int alturaOrejasCm) {
	super();
	this.colorPelo = colorPelo;
	this.numeroDePatas = numeroDePatas;
	this.alturaOrejasCm = alturaOrejasCm;
}

public String getColorPelo() {
	return colorPelo;
}

public void setColorPelo(String colorPelo) {
	this.colorPelo = colorPelo;
}

public int getNumeroDePatas() {
	return numeroDePatas;
}

public void setNumeroDePatas(int numeroDePatas) {
	this.numeroDePatas = numeroDePatas;
}

public int getAlturaOrejasCm() {
	return alturaOrejasCm;
}

public void setAlturaOrejasCm(int alturaOrejasCm) {
	this.alturaOrejasCm = alturaOrejasCm;
}

@Override
public String toString() {
	return "Perro [colorPelo=" + colorPelo + ", numeroDePatas=" + numeroDePatas + ", alturaOrejasCm=" + alturaOrejasCm
			+ "]";
}
	
	
	
	



}
