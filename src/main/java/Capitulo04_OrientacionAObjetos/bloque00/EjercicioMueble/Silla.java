package Capitulo04_OrientacionAObjetos.bloque00.EjercicioMueble;

public class Silla extends Mueble{

private int numeroPatas;


public Silla() {
	super();
	
}

public Silla(int numeroPatas, String MuebleColor, String tipoMadera) {
	super(MuebleColor, tipoMadera);
	this.numeroPatas = numeroPatas;
}


@Override
public String toString() {
	return "Silla [Mueblecolor=" + Mueblecolor + ", tipoMadera=" + tipoMadera + ", numeroPatas=" + numeroPatas + "]";
}

public int getNumeroPatas() {
	return numeroPatas;
}

public void setNumeroPatas(int numeroPatas) {
	this.numeroPatas = numeroPatas;
}


	
}
