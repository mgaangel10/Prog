package ejemplolist;

public class Alumno {
	
	private String nombre;
	private int edad;
	private double notaMeida;
	
	public Alumno(String nombre, int edad, double notaMeida) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.notaMeida = notaMeida;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getNotaMeida() {
		return notaMeida;
	}
	public void setNotaMeida(double notaMeida) {
		this.notaMeida = notaMeida;
	}
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", edad=" + edad + ", notaMeida=" + notaMeida + "]";
	}
	
	
	

}
