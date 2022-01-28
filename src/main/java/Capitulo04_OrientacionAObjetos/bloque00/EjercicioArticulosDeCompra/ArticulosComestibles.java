package Capitulo04_OrientacionAObjetos.bloque00.EjercicioArticulosDeCompra;

public class ArticulosComestibles extends Articulo {

	
private boolean EsElArticuloIgnifugo;

public ArticulosComestibles(boolean esElArticuloIgnifugo, int codigo, float precio, String nombre) {
	super(codigo,precio,nombre);
	this.EsElArticuloIgnifugo = esElArticuloIgnifugo;
}

public boolean isEsElArticuloIgnifugo() {
	return EsElArticuloIgnifugo;
}

public void setEsElArticuloIgnifugo(boolean esElArticuloIgnifugo) {
	EsElArticuloIgnifugo = esElArticuloIgnifugo;
}

@Override
public String toString() {
	return "ArticulosComestibles [EsElArticuloIgnifugo=" + EsElArticuloIgnifugo + ", codigo=" + codigo + ", precio="
			+ precio + ", Nombre=" + Nombre + "]";
}


}
