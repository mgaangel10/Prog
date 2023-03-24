package ejemplo1;

public class Empleado extends Trabajador{

	private double sueldo;
	private double impuesto;
	
	
	public Empleado(String nombre, String puesto, double sueldo, double impuesto) {
		super(nombre, puesto);
		this.sueldo = sueldo;
		this.impuesto = impuesto;
	}
	
	public double calcularPaga(int numHijos) {
		double divisor=100.0;
		return (sueldo-sueldo*impuesto/divisor)+super.calcularPaga(numHijos);
	}


	public double getSueldo() {
		return sueldo;
	}


	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	} 


	public double getImpuesto() {
		return impuesto;
	}


	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}


	@Override
	public String toString() {
		return super.toString()+ "Empleado [sueldo=" + sueldo + ", impuesto=" + impuesto + "]";
	}
	
	
	
}
