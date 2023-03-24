package ejerciciorepaso;

public class Cliente implements Comparable<Cliente>{
	
	private double saldo;
	private String nombre;
	private String dni;
	public int edad;
	
	
	public Cliente(double saldo, String nombre, String dni, int edad) {
		super();
		this.saldo = saldo;
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
	}

	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
		return "Cliente [saldo=" + saldo + ", nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + "]";
	}


	@Override
	public int compareTo(Cliente o) {
		// TODO Auto-generated method stub
		return -(o.getNombre().toLowerCase().compareTo(this.getNombre().toLowerCase()));
	}


	
	
	
	
	
	

}
