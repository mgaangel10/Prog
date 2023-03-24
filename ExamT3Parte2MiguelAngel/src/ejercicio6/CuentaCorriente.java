package ejercicio6;

public class CuentaCorriente extends Cuentas {
	
	private double mantenimiento;
	private double puntos;
	
	
	
	
	public CuentaCorriente(double saldo, String dni, String nombre, String apellido, double transfer, double ingresar,
			double retirar, double mantenimiento, double puntos) {
		super(saldo, dni, nombre, apellido, transfer, ingresar, retirar);
		this.mantenimiento = mantenimiento;
		this.puntos = puntos;
	}

	public double calcularPago(Cuentas c) {
		double total=0.0;
		total= mantenimiento - super.calcularPago();
		
		puntos+=10;
		return total ;
	}
	
	public double getMantenimiento() {
		return mantenimiento;
	}
	public void setMantenimiento(double mantenimiento) {
		this.mantenimiento = mantenimiento;
	}
	public double getPuntos() {
		return puntos;
	}
	public void setPuntos(double puntos) {
		this.puntos = puntos;
	}
	@Override
	public String toString() {
		return super.toString()+"CuentaCorriente [mantenimiento=" + mantenimiento + ", puntos=" + puntos + "]";
	}
	
	
	
		

}
