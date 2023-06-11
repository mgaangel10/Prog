package ejercicio1;

import java.time.LocalDate;

public class PatinVolador extends Vehiculo{
	
	private double caballos;

	public PatinVolador(String matricula, double tamaño, int fechaFabricacion, double caballos) {
		super(matricula, tamaño, fechaFabricacion);
		this.caballos = caballos;
	}
	
	public double cacularPrecio() {
		return super.cacularPrecio()*caballos;
	}

	public double getCaballos() {
		return caballos;
	}

	public void setCaballos(double caballos) {
		this.caballos = caballos;
	}

	@Override
	public String toString() {
		return super.toString()+"PatinVolador [caballos=" + caballos + "]";
	}
	

}
