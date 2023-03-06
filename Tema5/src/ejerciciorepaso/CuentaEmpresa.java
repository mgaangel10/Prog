package ejerciciorepaso;

public class CuentaEmpresa extends Cuenta{
	
	private int cobra;
	private boolean sacarDinero;
	
	
	

		public CuentaEmpresa(Cliente c, int cobra, boolean sacarDinero) {
		super(c);
		this.cobra = cobra;
		this.sacarDinero = sacarDinero;
	}




		public double calcularSueldo() {
		if (sacarDinero=true) {
			return super.calcularSaldo()-cobra;
		} else {
			return super.calcularSaldo();
		}
	}




		public int getCobra() {
			return cobra;
		}




		public void setCobra(int cobra) {
			this.cobra = cobra;
		}




		public boolean isSacarDinero() {
			return sacarDinero;
		}




		public void setSacarDinero(boolean sacarDinero) {
			this.sacarDinero = sacarDinero;
		}




		@Override
		public String toString() {
			return super.toString()+"CuentaEmpresa [cobra=" + cobra + ", sacarDinero=" + sacarDinero + "]";
		}
		
		

	
	
	
	
	
	
}
