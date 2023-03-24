package ejercicio3otravez;

public class Movil {
	
	private String marca;
	private String modelo;
	private double precio;
	private boolean activo;
	public Movil(String marca, String modelo, double precio, boolean activo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.activo = activo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	@Override
	public String toString() {
		return "Movil [marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", activo=" + activo + "]";
	}
	
	
	
	
	

}
