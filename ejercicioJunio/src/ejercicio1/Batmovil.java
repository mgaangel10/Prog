package ejercicio1;

import java.time.LocalDate;

public class Batmovil extends Vehiculo{
	
	private int numRueda;

	public Batmovil(String matricula, double tamaño, int fechaFabricacion, int numRueda) {
		super(matricula, tamaño, fechaFabricacion);
		this.numRueda = numRueda;
	}
	
	public double cacularPrecio() {
		return super.cacularPrecio()*numRueda;
	}

	public int getNumRueda() {
		return numRueda;
	}

	public void setNumRueda(int numRueda) {
		this.numRueda = numRueda;
	}

	@Override
	public String toString() {
		return super.toString()+"Batmovil [numRueda=" + numRueda + "]";
	}
	
	

}
