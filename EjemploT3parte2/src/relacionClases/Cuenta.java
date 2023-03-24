package relacionClases;

public class Cuenta {
	private long numero;
	private Cliente c;
	private float saldo;
	private float interes;
	public Cuenta(long numero, Cliente c, float saldo, float interes) {
		
		this.numero = numero;
		this.c = c;
		this.saldo = saldo;
		this.interes = interes;
	}
	
	public float ingresarPension(int topeEdad) {
		//se pone c.imprimirsenior poruqe cliente es atributo de cuenta 
		//se podria tambien poner como parametro es decir en (cliente c)
		saldo=saldo+c.imprimirSenior(topeEdad);
		return saldo;
	}
	public float ingresarPensionV2    (int topeEdad) {
		
		saldo=saldo+c.imprimirSenior(topeEdad);
		return saldo;
	}
	
	
	
	
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public Cliente getC() {
		return c;
	}
	public void setC(Cliente c) {
		this.c = c;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public float getInteres() {
		return interes;
	}
	public void setInteres(float interes) {
		this.interes = interes;
	}
	@Override
	public String toString() {
		return "Cuenta [numero=" + numero + ", c=" + c + ", saldo=" + saldo + ", interes=" + interes + "]";
	}
	
	
	

}
