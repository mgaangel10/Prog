package ejercicio1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radio;
		double res=0.0;
		Circulo cir1, cir2, cir3;
		//forma1: cascaporra style
		 cir1=new Circulo(3.5);
		//forma2: leyendo por teclado
		System.out.println("Diga usted el radio");
		radio=Leer.datoDouble();
		 cir2=new Circulo(radio);
		 
		 cir3=new Circulo();
		 //como se llama a un metodo
		
		 res=cir3.calcularArea(2.2);
		 System.out.println("el resultado del area es"+res);
	}

}
