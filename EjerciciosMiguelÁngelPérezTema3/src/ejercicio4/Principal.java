package ejercicio4;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase;
		int num=0;

		
		
		System.out.println("digame la frase");
		frase=Leer.dato();
		System.out.println("digame el numero de veces que se repite la frase");
		num=Leer.datoInt();
		Copiado cop1 =new Copiado();
		cop1.imprimir(frase, num);
				

		
		
		

	}

}
