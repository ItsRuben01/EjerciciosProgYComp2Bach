package Capitulo04_OrientacionAObjetos.bloque00.EjercicioMinerales;

public class Sal extends Mineral{

	int disolucionMineral;

	public Sal() {
		super();
	}

	public Sal(float durezaMineral, String colorMineral,int disolucionMineral) {
		super(durezaMineral, colorMineral);
		this.disolucionMineral = disolucionMineral;
	}

	public int getDisolucionMineral() {
		return disolucionMineral;
	}

	public void setDisolucionMineral(int disolucionMineral) {
		this.disolucionMineral = disolucionMineral;
	}

	@Override
	public String toString() {
		return "Sal [disolucionMineral=" + disolucionMineral + ", getDurezaMineral()=" + getDurezaMineral()
				+ ", getColorMineral()=" + getColorMineral() + "]";
	}

	
}
