package arrayobjetos;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nVs=0, seguir, tam=100;
		String modelo;
		int op=0;
		boolean cRuedas;
		//lista[] zolo es el  ombre de una variable ne forma de array
		Vehiculo lista[] =new Vehiculo[tam];
		String aux;
		double potencia=0.0;
		double newPotencia=0.0;
		do {
			System.out.println("modelo");
			modelo=Leer.dato();
			System.out.println("potencia");
			 potencia=Leer.datoDouble();
			lista[nVs]=new Vehiculo (modelo, potencia);
			nVs++;
			
			
			System.out.println("terminar:0 seguir:1");
			seguir=Leer.datoInt();
		}while(seguir!=0 && nVs<lista.length);
		System.out.println("cmbiar la potencia de cual coche ");
		op=Leer.datoInt();
		System.out.println("que potencia");
		newPotencia=Leer.datoDouble();
		lista[op-1].setPrecio(newPotencia);
		for(int i=0; i<nVs; i++) {
			System.out.println(lista[i]);
		}
		System.out.println("has terminado");
		
	}

}
