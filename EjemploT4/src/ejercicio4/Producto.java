package ejercicio4;

public class  Producto {
	
	private double precioUni;
	private String nombre;
	private int codigo;
	
	
	
	public Producto(double precioUni, String nombre, int codigo) {
		super();
		this.precioUni = precioUni;
		this.nombre = nombre;
		this.codigo = codigo;
	}
	
	public double calcularPrecio() {
		return getPrecioUni();
	}
	
	public double getPrecioUni() {
		return precioUni;
	}
	public void setPrecioUni(double precioUni) {
		this.precioUni = precioUni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	@Override
	public String toString() {
		return "Producto [precioUni=" + precioUni + ", nombre=" + nombre + ", codigo=" + codigo + "]";
	}
	
	
	
	

}
