package ejemploPolimorfismo;

public class Cuadrado extends Figura {
	private double lado;

	public Cuadrado() {
		super();
	}

	public Cuadrado(String color,String nombre,double lado) {
		super(color,nombre);
		this.lado = lado;
	}
	
	public double calcularArea() {
		return lado*lado;
	}
	
	public double calcularPerimetro() {
		return lado*4;
	}

	public double getLado() {
		return lado;
	}
	
	public void mostrarLados() {
		System.out.println("solo estoy en la clase circulo porque los demas no tienen lados,en concreto");
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return super.toString()+"Circulo [lado=" + lado + "]";
	}
	

}
