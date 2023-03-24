package ejercicio8;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre;
		int tam=5;
		int []  num=new int[tam];
		Sorteo s1=new Sorteo(num);
		s1.generarale();
		s1.imprimir();
		

	}

}
