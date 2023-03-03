package ejercicio2;

public class Socio {
	private int numSo;
	private String nombre;
	private String apellido;
	private double pago;
	public Socio(int numSo, String nombre, String apellido, double pago) {
		super();
		this.numSo = numSo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.pago = pago;
	}
	public int getNumSo() {
		return numSo;
	}
	public void setNumSo(int numSo) {
		this.numSo = numSo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public double getPago() {
		return pago;
	}
	public void setPago(double pago) {
		this.pago = pago;
	}
	@Override
	public String toString() {
		return "Socio [numSo=" + numSo + ", nombre=" + nombre + ", apellido=" + apellido + ", pago=" + pago + "]";
	}
	

}
