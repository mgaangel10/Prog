package ejercicio2L2;

public class Habitacion {
	private double precio;
	private boolean extra;
	private String nombre;
	private double dias;
	public Habitacion(double precio, boolean extra, String nombre, double dias) {
		super();
		this.precio = precio;
		this.extra = extra;
		this.nombre = nombre;
		this.dias = dias;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public boolean isExtra() {
		return extra;
	}
	public void setExtra(boolean extra) {
		this.extra = extra;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getDias() {
		return dias;
	}
	public void setDias(double dias) {
		this.dias = dias;
	}
	@Override
	public String toString() {
		return "Habitacion [precio=" + precio + ", extra=" + extra + ", nombre=" + nombre + ", dias=" + dias + "]";
	}
	
	

}
