package Capitulo04_OrientacionAObjetos.bloque00.EjercicioMinerales;

public class Oro extends Mineral{

	int brilloMineral;

	
	public Oro() {
		super();
		
	}

	public Oro(float durezaMineral, String colorMineral,int brilloMineral) {
		super(durezaMineral, colorMineral);
		this.brilloMineral = brilloMineral;
	}

	public int getBrillo() {
		return brilloMineral;
	}

	
	public String toString() {
		return "Oro [brilloMineral=" + brilloMineral + ", getDurezaMineral()=" + getDurezaMineral()
				+ ", getColorMineral()=" + getColorMineral() + "]";
	}
	
	
	
	
	
	
}
