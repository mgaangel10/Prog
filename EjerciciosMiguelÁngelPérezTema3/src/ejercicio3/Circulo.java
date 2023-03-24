package ejercicio3;

public class Circulo {
	
	double altura;
	double radio;
	public Circulo () {
		
	}
	public Circulo(double altura,double radio) {
		this.radio=radio;
		this.altura=radio;
	}
	public double calacularVolumen() {
		double exp=2;
		double resultado=0.0;
		resultado=Math.PI*Math.pow(radio, exp)*altura;
		return resultado;
	}

}
