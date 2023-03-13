package primeraexcepcion;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=10;
		int d=4;
		double total;
		
			do {
				
				try {
			
			System.out.println("numerador");
		num=Leer.datoInt();
		
		System.out.println("denominador");
		d=Leer.datoInt();
			total=num/d;
		System.out.println(total);
		}
		catch(ArithmeticException e) {
				
				System.err.println("has metido un letra ");
			}
		
		catch(Exception e) {
			System.err.println("esta dividiendo por ceroo");
			
		}
			} while (d==0);
		
		
		
			
				
		
		
		
		
	}

}
