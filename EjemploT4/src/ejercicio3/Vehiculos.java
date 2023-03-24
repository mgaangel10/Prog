package ejercicio3;

public abstract class Vehiculos {
	private double impuesto;
	private double cilindrada;
	private double potencia;
	private double categoria;
	
	public Vehiculos(double impuesto, double cilindrada, double potencia, double categoria) {
		super();
		this.impuesto = impuesto;
		this.cilindrada = cilindrada;
		this.potencia = potencia;
		this.categoria = categoria;
	}

	public double getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}

	public double getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public double getCategoria() {
		return categoria;
	}

	public void setCategoria(double categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Vehiculos [impuesto=" + impuesto + ", cilindrada=" + cilindrada + ", potencia=" + potencia
				+ ", categoria=" + categoria + "]";
	}
	
	public double calcularCantidadFija(int op1,double por ) {
		
		switch (op1) {
		case 1:
			categoria=100;
			
			break;
		case 2:
			categoria=150;
			break;
		case 3:
			categoria=200;
			break;
		case 4:
			categoria=250;
			break;

		default:
			break;
		}
		return categoria;
	}
	
	
	
	

}
