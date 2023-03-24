package ejercicio6;

public class CuentaJoven extends Cuentas {
	
	private int masEuro;
	
	private boolean ingreso;

	
	
	public CuentaJoven(double saldo, String dni, String nombre, String apellido, double transfer, double ingresar,
			double retirar, int masEuro, boolean ingreso) {
		super(saldo, dni, nombre, apellido, transfer, ingresar, retirar);
		this.masEuro = masEuro;
		this.ingreso = ingreso;
	}





	public double calcularPago() {
		double totla=0.0,total1=0.0;
		if (ingreso=true) {
			 totla=super.getIngresar()+masEuro;
			 return total1= totla +super.calcularPago();
		} else {
			return super.calcularPago();
		}
	}
	

	


	public boolean isIngreso() {
		return ingreso;
	}


	public void setIngreso(boolean ingreso) {
		this.ingreso = ingreso;
	}


	public int getMasEuro() {
		return masEuro;
	}

	public void setMasEuro(int masEuro) {
		this.masEuro = masEuro;
	}





	@Override
	public String toString() {
		return "CuentaJoven [masEuro=" + masEuro + ", ingreso=" + ingreso + "]";
	}


	
	
	
	

}
