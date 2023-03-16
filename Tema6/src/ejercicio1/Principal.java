package ejercicio1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numMayor=0;
		int numMenor=0;
		int op=0;
		Calculadora c;
		System.out.println("dime el numero mayor");
		numMayor=Leer.datoInt();
		System.out.println("dime el numero menor");
		numMenor=Leer.datoInt();
		c= new Calculadora(numMayor,numMenor);
		
		do {
			try {
				
			
			System.out.println("menu");
			System.out.println("1--sumar");
			System.out.println("2--restar");
			System.out.println("3--multiplicar");
			System.out.println("4--dividir");
			op=Leer.datoInt();
			switch (op) {
			case 1:
				
				System.out.println(c.sumar());
				break;
			case 2:
				
				System.out.println(c.restar());
				break;
			case 3:
				
				System.out.println(c.multiplicar());
				break;
			case 4:
				System.out.println(c.dividir());
				break;

			default:
				System.out.println("esa opcion no existe");
				break;
			}
			}
			
			catch(NumberFormatException a){
				System.err.println("has introducido una letra");
			}
			
			catch(ArithmeticException e) {
				System.err.println("estas diviendo por cero");
			}
			
			catch(Exception x) {
				System.err.println("ha surgido un error");
			}
			
			
		} while (op!=0);

	}

}
