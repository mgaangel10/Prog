package ejemplo;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double radio=0.0,respuesta=0.0,result=0.0;
		Circulo c1=new Circulo();
		
		Circulo c2;
		System.out.println("diga radio");
		radio=Leer.datoDouble();
		c2=new Circulo(radio);
		//llamada a calcular area
		System.out.println("diga radio");
		respuesta=Leer.datoDouble();
		result=c2.calcularArea(respuesta);
		System.out.println("respuesta"+result);
		//para mostrar de otra manera la respuesta
		System.out.println("respuesta"+c2.calcularArea(respuesta));
	}

}
