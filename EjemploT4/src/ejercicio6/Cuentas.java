package ejercicio6;

public class Cuentas {
	
	private double saldo;
	private String dni;
	private String nombre;
	private String apellido;
	
	
	
	public Cuentas(double saldo, String dni, String nombre, String apellido ) {
		super();
		this.saldo = saldo;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	
	}
	
	



	public double calcularPago() {
		return getSaldo();
	}
	






	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
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





	@Override
	public String toString() {
		return "Cuentas [saldo=" + saldo + ", dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}





	

	


	


	
	
	
	
	

}
