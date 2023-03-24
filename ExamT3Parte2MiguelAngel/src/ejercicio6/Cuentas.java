package ejercicio6;

public class Cuentas {
	
	private double saldo;
	private String dni;
	private String nombre;
	private String apellido;
	private double transfer;
	private double ingresar;
	private double retirar;
	
	
	public Cuentas(double saldo, String dni, String nombre, String apellido ,double transfer,double ingresar,double retirar) {
		super();
		this.saldo = saldo;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.transfer = transfer;
		this.ingresar=ingresar;
		this.retirar=retirar;
	}
	
	
	public double getIngresar() {
		return ingresar;
	}


	public void setIngresar(double ingresar) {
		this.ingresar = ingresar;
	}


	public double getRetirar() {
		return retirar;
	}


	public void setRetirar(double retirar) {
		this.retirar = retirar;
	}


	public double calcularPago() {
		return getSaldo();
	}
	


	public double getTransfer() {
		return transfer;
	}



	public void setTransfer(double transfer) {
		this.transfer = transfer;
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
		return "Cuentas [saldo=" + saldo + ", dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", transfer=" + transfer + ", ingresar=" + ingresar + ", retirar=" + retirar + "]";
	}



	


	
	
	
	
	

}
