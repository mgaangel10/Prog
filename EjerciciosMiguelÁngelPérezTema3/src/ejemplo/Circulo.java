package ejemplo;

public class Circulo {
	double radio;
	public Circulo() {
		
	}
	public Circulo(double radio) {
		this.radio=radio;
	}
	public double calcularArea (double cosa) {
		double exp=2;
		double result=0.0;
		result=Math.PI*Math.pow(cosa, exp);
		return result;
	}

}
