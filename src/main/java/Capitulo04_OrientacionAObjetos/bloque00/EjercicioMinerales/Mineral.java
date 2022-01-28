package Capitulo04_OrientacionAObjetos.bloque00.EjercicioMinerales;

public class Mineral {

	private float DurezaMineral;
	private String colorMineral;
	
	
	
	public Mineral() {
		super();
	}

	public Mineral(float durezaMineral, String colorMineral) {
		super();
		DurezaMineral = durezaMineral;
		this.colorMineral = colorMineral;
	}

	public float getDurezaMineral() {
		return DurezaMineral;
	}

	public void setDurezaMineral(float durezaMineral) {
		DurezaMineral = durezaMineral;
	}

	public String getColorMineral() {
		return colorMineral;
	}

	public void setColorMineral(String colorMineral) {
		this.colorMineral = colorMineral;
	}

	@Override
	public String toString() {
		return "Mineral [DurezaMineral=" + DurezaMineral + ", colorMineral=" + colorMineral + "]";
	}
	
	
	
	
	
	
}
