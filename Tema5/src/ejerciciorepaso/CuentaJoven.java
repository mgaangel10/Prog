package ejerciciorepaso;

public class CuentaJoven extends Cuenta{
	
	private int regalo;
	private boolean ingresar;
	
	
	
	public CuentaJoven(Cliente c, int regalo, boolean ingresar) {
		super(c);
		this.regalo = regalo;
		this.ingresar = ingresar;
	}



	public double calcularSueldo() {
		if (ingresar=true) {
			return super.calcularSaldo()+regalo;
		} else {
			return super.calcularSaldo();
		}
	}



	public int getRegalo() {
		return regalo;
	}



	public void setRegalo(int regalo) {
		this.regalo = regalo;
	}



	public boolean isIngresar() {
		return ingresar;
	}



	public void setIngresar(boolean ingresar) {
		this.ingresar = ingresar;
	}



	@Override
	public String toString() {
		return super.toString()+"CuentaJoven [regalo=" + regalo + ", ingresar=" + ingresar + "]";
	}
	
	

}
