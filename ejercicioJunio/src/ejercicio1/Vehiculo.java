package ejercicio1;

import java.time.LocalDate;

public abstract class Vehiculo {
	
	private String matricula;
	private double tamaño;
	private int fechaFabricacion;
	
	public Vehiculo(String matricula, double tamaño, int fechaFabricacion) {
		super();
		this.matricula = matricula;
		this.tamaño = tamaño;
		this.fechaFabricacion = fechaFabricacion;
	}
	
	public double cacularPrecio() {
		double total=0.0;
		if (fechaFabricacion<10) {
			return total=tamaño*3;
		} else {
			return total=tamaño*2;
		}
	}
	
	

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	public int getFechaFabricacion() {
		return fechaFabricacion;
	}

	public void setFechaFabricacion(int fechaFabricacion) {
		this.fechaFabricacion = fechaFabricacion;
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", tamaño=" + tamaño + ", fechaFabricacion=" + fechaFabricacion
				+ "]";
	}
	
	
	
	
}
