package ejercicio5;

public class Gerente extends Empleado {
	
	private int impuesto;

	public Gerente(String nombre, String aplleido, double sueldoBase, int numEmp, int impuesto) {
		super(nombre, aplleido, sueldoBase, numEmp);
		this.impuesto = impuesto;
	}
	
	public double calcularSueldo() {
		return super.calcularSueldo()-impuesto;
	}

	public int getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(int impuesto) {
		this.impuesto = impuesto;
	}

	@Override
	public String toString() {
		return super.toString()+"Gerente [impuesto=" + impuesto + "]";
	}
	
	

}
