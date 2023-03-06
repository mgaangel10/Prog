package ejerciciorepaso;

public class CuentaCorriente extends Cuenta{
	
	private double manten;
	private double puntos;
	
	
	public CuentaCorriente(Cliente c, double manten, double puntos) {
		super(c);
		this.manten = manten;
		this.puntos = puntos;
	}


	public double calcularSueldo() {
		double total=0.0;
		total=super.calcularSaldo()-manten;
		puntos++;
		return total;
	}


	public double getManten() {
		return manten;
	}


	public void setManten(double manten) {
		this.manten = manten;
	}


	public double getPuntos() {
		return puntos;
	}


	public void setPuntos(double puntos) {
		this.puntos = puntos;
	}


	@Override
	public String toString() {
		return super.toString()+"CuentaCorriente [manten=" + manten + ", puntos=" + puntos + "]";
	}
	
	
	
	
	

}
