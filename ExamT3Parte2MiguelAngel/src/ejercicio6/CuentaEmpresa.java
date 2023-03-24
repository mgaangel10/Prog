package ejercicio6;

public class CuentaEmpresa extends Cuentas {
	
	private int unEuro;
	private boolean efectivo;
	
	
	
	
	public CuentaEmpresa(double saldo, String dni, String nombre, String apellido, double transfer, double ingresar,
			double retirar, int unEuro, boolean efectivo) {
		super(saldo, dni, nombre, apellido, transfer, ingresar, retirar);
		this.unEuro = unEuro;
		this.efectivo = efectivo;
	}



	public double calcularPago() {
		double total=0.0;
		if(efectivo=true) {
			return total=super.calcularPago()-unEuro;
		}else {
			return super.calcularPago();
		}
	}
	
	

	public boolean isEfectivo() {
		return efectivo;
	}



	public void setEfectivo(boolean efectivo) {
		this.efectivo = efectivo;
	}



	public int getUnEuro() {
		return unEuro;
	}

	public void setUnEuro(int unEuro) {
		this.unEuro = unEuro;
	}

	@Override
	public String toString() {
		return super.toString()+"CuentaEmpresa [unEuro=" + unEuro + "]";
	}
	
	
	
	

}
