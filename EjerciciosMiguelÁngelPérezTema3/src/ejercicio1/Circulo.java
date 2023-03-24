package ejercicio1;

public class Circulo {
	//atributos
	double radio;
	//constructores
	public Circulo() {
		
	}
	public Circulo(double radio) {
		this.radio=radio;
	}
	//metodos
	public double calcularArea (double r) {
		double exp=2;
		double resultado=0.0;
		resultado=Math.PI*Math.pow(r, exp);
		return resultado;
	}

}
