package ejemploentorno;

public abstract class Trabajador {
	private String nombre;
	private String apellidos;
	private double sueldo;
	private String dni;
	private int edad;
	
	
	


	public Trabajador(String nombre, String apellidos, double sueldo, String dni, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sueldo = sueldo;
		this.dni = dni;
		this.edad = edad;
	}


	public abstract double calcularSueldo();
	
	
	


	public double getSueldo() {
		return sueldo;
	}


	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}





	

	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", apellidos=" + apellidos + ", sueldo=" + sueldo + ", dni=" + dni
				+ ", edad=" + edad + "]";
	}


	
	
	
	

}
