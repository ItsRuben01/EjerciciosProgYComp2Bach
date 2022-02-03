package Capitulo04_OrientacionAObjetos.bloque00.EjercicioArticulosDeCompra;

public class ArticulosComestibles extends Articulo {

private String FechaCad;

public ArticulosComestibles(String fechaCad,int codigo, float precio, String nombre) {
	super(codigo, precio, nombre);
	this.FechaCad = fechaCad;
	
}

public ArticulosComestibles() {
}

public String getFechaCad() {
	return FechaCad;
}

public void setFechaCad(String fechaCad) {
	FechaCad = fechaCad;
}

@Override
public String toString() {
	return "ArticulosLimpieza [FechaCad=" + FechaCad + ", codigo=" + codigo + ", precio=" + precio + ", Nombre="
			+ Nombre + "]";
}



}
