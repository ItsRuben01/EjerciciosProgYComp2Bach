package Capitulo04_OrientacionAObjetos.bloque00.EjercicioMinerales;

public class Cuarzo extends Mineral{

	int cristalizacionMineral;

	public Cuarzo() {
		super();
	}

	public Cuarzo(float durezaMineral, String colorMineral, int cristalizacionMineral) {
		super(durezaMineral, colorMineral);
		this.cristalizacionMineral = cristalizacionMineral;

	}

	public int getCristalizacionMineral() {
		return cristalizacionMineral;
	}

	public void setCristalizacionMineral(int cristalizacionMineral) {
		this.cristalizacionMineral = cristalizacionMineral;
	}

	@Override
	public String toString() {
		return "Cuarzo [cristalizacionMineral=" + cristalizacionMineral + ", getDurezaMineral()=" + getDurezaMineral()
				+ ", getColorMineral()=" + getColorMineral() + "]";
	}

	
}
