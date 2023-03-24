package ejerciciosarray1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] nombres;
		int tam=0;
		System.out.println("Binevenido al programa para mostrar nombres");
		do {
		System.out.println("Indique el número de nombres ");
		tam=Leer.datoInt();
		nombres= new String [tam];
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Diga un nombre");
			nombres[i]=Leer.dato();
			}
		for (int i = 0; i < nombres.length; i++) {
			System.out.print("\t"+nombres[i]);
			
		}
		}while(tam!=0);

	}

}
