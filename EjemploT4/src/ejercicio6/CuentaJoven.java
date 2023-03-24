package ejercicio6;

public class CuentaJoven extends Cuentas {
	
	private int masEuro;
	private double ingresar;
	

	
	
	public CuentaJoven(double saldo, String dni, String nombre, String apellido, int masEuro, double ingresar) {
		super(saldo, dni, nombre, apellido);
		this.masEuro = masEuro;
		this.ingresar = ingresar;
	}





	public double calcularPago() {
		double totla=0.0,total1=0.0;
		if (ingresar>0) {
			 totla=ingresar+masEuro;
			 return total1= totla +super.calcularPago();
		} else {
			return super.calcularPago();
		}
	}
	

	


	


	public int getMasEuro() {
		return masEuro;
	}

	public void setMasEuro(int masEuro) {
		this.masEuro = masEuro;
	}





	public double getIngresar() {
		return ingresar;
	}





	public void setIngresar(double ingresar) {
		this.ingresar = ingresar;
	}





	@Override
	public String toString() {
		return super.toString()+"CuentaJoven [masEuro=" + masEuro + ", ingresar=" + ingresar + "]";
	}
	
	





	


	
	
	
	

}
