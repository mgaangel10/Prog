package ejercicio1;

public class Portatil {
	
	private double seguroPantalla;

	public Portatil(double seguroPantalla) {
		super();
		this.seguroPantalla = seguroPantalla;
	}

	public double getSeguroPantalla() {
		return seguroPantalla;
	}

	public void setSeguroPantalla(double seguroPantalla) {
		this.seguroPantalla = seguroPantalla;
	}

	@Override
	public String toString() {
		return "Portatil [seguroPantalla=" + seguroPantalla + "]";
	}
	
	
	
	

}
