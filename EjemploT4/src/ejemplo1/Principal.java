package ejemplo1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=0,tope=8,tam=3,numHijos=0;
		double desc=15.50;
		Trabajador t=new Trabajador("Ángel","Jefe de depàrtamento");
		Consultor c=new Consultor("Rafa","junior",20,100);
		Empleado e=new Empleado("Luismi","Master and commander",2000,15);
		
		System.out.println("Diga el numero de hijos");
		numHijos=Leer.datoInt();
		
		System.out.println("paga con trabajador "+t.calcularPaga(numHijos));
		System.out.println("paga con consultor "+c.calcularPaga(numHijos));
		System.out.println("paga con empelado "+e.calcularPaga(numHijos));
		
		
		
		
		
	}

}
