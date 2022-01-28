package Capitulo04_OrientacionAObjetos.bloque00.EjercicioArticulosDeCompra;

public class Articulo {

int codigo;
float precio;
String Nombre;

public Articulo() {
	
	super();
	
}

public Articulo(int codigo, float precio, String nombre) {
	super();
	this.codigo = codigo;
	this.precio = precio;
	Nombre = nombre;
}

public int getCodigo() {
	return codigo;
}

public void setCodigo(int codigo) {
	this.codigo = codigo;
}

public float getPrecio() {
	return precio;
}

public void setPrecio(float precio) {
	this.precio = precio;
}

public String getNombre() {
	return Nombre;
}

public void setNombre(String nombre) {
	Nombre = nombre;

}

@Override
public String toString() {
	return "Articulo [codigo=" + codigo + ", precio=" + precio + ", Nombre=" + Nombre + "]";
}


}
