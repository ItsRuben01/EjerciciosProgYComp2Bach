package Capitulo04_OrientacionAObjetos.bloque00.EjercicioMueble;

public class Armario extends Mueble{

private int numeroPuertas;

public Armario() {
	super();
}

public Armario(int numeroPuertas, String MuebleColor, String tipoMadera) {
	super(MuebleColor, tipoMadera);
	
	this.numeroPuertas = numeroPuertas;
}

@Override
public String toString() {
	return "Armario [Mueblecolor=" + Mueblecolor + ", tipoMadera=" + tipoMadera + ", numeroPuertas=" + numeroPuertas
			+ "]";
}

public int getNumeroPuertas() {
	return numeroPuertas;
}

public void setNumeroPuertas(int numeroPuertas) {
	this.numeroPuertas = numeroPuertas;
}	


	
	
	
	
}
