package Capitulo04_OrientacionAObjetos.bloque00.Ejercicio02Mono;

public class Mono {

private String colorPelo;
private int alturaCm;
private int NumPatas;
public Mono() {
	super();
}
public Mono(String colorPelo, int alturaCm, int numPatas) {
	super();
	this.colorPelo = colorPelo;
	this.alturaCm = alturaCm;
	NumPatas = numPatas;
}
public String getColorPelo() {
	return colorPelo;
}
public void setColorPelo(String colorPelo) {
	this.colorPelo = colorPelo;
}
public int getAlturaCm() {
	return alturaCm;
}
public void setAlturaCm(int alturaCm) {
	this.alturaCm = alturaCm;
}
public int getNumPatas() {
	return NumPatas;
}
public void setNumPatas(int numPatas) {
	NumPatas = numPatas;
}
@Override
public String toString() {
	return "Mono [colorPelo=" + colorPelo + ", alturaCm=" + alturaCm + ", NumPatas=" + NumPatas + "]";
}


}
