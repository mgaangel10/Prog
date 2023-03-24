package ejemploPolimorfismo;

public class Circulo extends Figura {
	
	private double radio;

	public Circulo() {
		super();
	}

	public Circulo(String color,String nombre,double radio) {
		super(color,nombre);
		this.radio = radio;
	}
	
	public double calcularPerimetro() {
		return 2*Math.PI*radio;
	}
	
	public double calcularArea() {
		return Math.PI*Math.pow(radio, 2);
	}
	
	public void mostrarRadianes() {
		System.out.println("");
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return super.toString()+"Circulo [radio=" + radio + "]";
	}
	
	

	
	
	

	
	
	
	
	

}
