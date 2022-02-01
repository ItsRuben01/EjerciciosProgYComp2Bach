package Capitulo04_OrientacionAObjetos.bloque00.EjercicioMueble;

public class Mueble {

protected String Mueblecolor;
protected String tipoMadera;

/**
 *  Constructores
 */

public Mueble() {
	super();
	
}
public Mueble(String mueblecolor, String tipoMadera) {
	super();
	Mueblecolor = mueblecolor;
	this.tipoMadera = tipoMadera;
}

/**
 *  ToString
 */

@Override
public String toString() {
	return "Mueble [Mueblecolor=" + Mueblecolor + ", tipoMadera=" + tipoMadera + "]";
}

/**
 *  Getters y setters
 * @return
 */

public String getMueblecolor() {
	return Mueblecolor;
}

public void setMueblecolor(String mueblecolor) {
	Mueblecolor = mueblecolor;
}

public String getTipoMadera() {
	return tipoMadera;
}

public void setTipoMadera(String tipoMadera) {
	this.tipoMadera = tipoMadera;
}



}
