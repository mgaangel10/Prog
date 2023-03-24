package ejercicio3;

public class Furgonetas extends Vehiculos{
	
	private double tara;

	public Furgonetas(double impuesto, double cilindrada, double potencia, double categoria, double tara) {
		super(impuesto, cilindrada, potencia, categoria);
		this.tara = tara;
	}

	public double getTara() {
		return tara;
	}

	public void setTara(double tara) {
		this.tara = tara;
	}

	@Override
	public String toString() {
		return super.toString()+"Furgonetas [tara=" + tara + "]";
	}
	
	//reescribir metodo de la clase vehiculo
	
	
	
	
	
	
	
	
	

}
