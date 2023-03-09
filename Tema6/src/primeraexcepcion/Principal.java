package primeraexcepcion;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=10;
		int d=4;
		double total;
		
			System.out.println("numerador");
		num=Leer.datoInt();
		do {
		System.out.println("denominador");
		d=Leer.datoInt();
		if (d==0) {
			System.out.println("introduzca uotro num distinto de cero");
		}
		} while (d==0);
		
		
		total=num/d;
		System.out.println(total);
	}

}
