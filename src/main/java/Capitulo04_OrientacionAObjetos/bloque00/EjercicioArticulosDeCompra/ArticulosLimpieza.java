package Capitulo04_OrientacionAObjetos.bloque00.EjercicioArticulosDeCompra;

public class ArticulosLimpieza extends Articulo{

	
private String FechaCad;

public ArticulosLimpieza(String fechaCad,int codigo, float precio, String nombre) {
	super(codigo, precio, nombre);
	this.FechaCad = fechaCad;
	
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
