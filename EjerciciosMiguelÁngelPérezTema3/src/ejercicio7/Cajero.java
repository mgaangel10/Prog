package ejercicio7;

public class Cajero {
	//atributos
	private double saldo;
	private String nombre;
	
	public Cajero() {
		
	}
	public Cajero(double saldo,String nombre) {
		this.saldo=saldo;
		this.nombre=nombre;
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
	public double ingresarSaldo(double ingresar) {
		
		saldo+=ingresar;
		return saldo;
	}
	public boolean comprobrarSaldo(double retirada) {
		saldo-=retirada;
		if(saldo<retirada) {
			return false;
		}else {
			return true;
		}
	}
	public void retirarSaldo(boolean comp) {
		
		if(comp) {
			System.out.println(saldo);
		}else {
			System.out.println("insufciente");
		}
	}
	public double dolarAmericano() {
		saldo=saldo*2;
		return saldo;
	}
	public double verSaldo(double ingresar) {
		return ingresar;
		
	}
	
	
	

}
