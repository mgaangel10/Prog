package ejercicio1;

public class Ordenador {
	private double capDisco;
	private double frecuencia;
	private double precio;
	private String marca;
	
	public Ordenador(double capDisco, double frecuencia, double precio, String marca) {
		super();
		this.capDisco = capDisco;
		this.frecuencia = frecuencia;
		this.precio = precio;
		this.marca = marca;
	}
	
	
	public double getCapDisco() {
		return capDisco;
	}
	public void setCapDisco(double capDisco) {
		this.capDisco = capDisco;
	}
	public double getFrecuencia() {
		return frecuencia;
	}
	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	@Override
	public String toString() {
		return "Ordenador [capDisco=" + capDisco + ", frecuencia=" + frecuencia + ", precio=" + precio + ", marca="
				+ marca + "]";
	}
	
	

}
