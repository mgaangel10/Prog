package ejercicio3;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radio=0.0, resultado=0.0,altura=0.0;
		Circulo c1;
		c1=new Circulo(radio,altura);
		System.out.println("radio");
		radio=Leer.datoDouble();
		System.out.println("altura");
		altura=Leer.datoDouble();
		c1=new Circulo(radio,altura);
		resultado=c1.calacularVolumen();
		System.out.println("respuesta"+resultado);

	}

}
