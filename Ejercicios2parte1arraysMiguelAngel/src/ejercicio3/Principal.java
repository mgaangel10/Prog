package ejercicio3;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tam=8, creos=0;double suma=0;
		double[]num;
		num=new double[tam];
		double media;
		System.out.println("Binvenido al programa donde vamos a calcular la nota media de un alumno ");
		do {
		for (int i = 0; i < num.length; i++) {
			System.out.println("Diga una nota");
			num[i]=Leer.datoDouble();
		}
		for (int i = 0; i < num.length; i++) {
			suma=suma+num[i];
			
		}
		for (int i = 0; i < num.length; i++) {
			if(num[i]==0) {
				creos++;
			}
			
		}
		media=suma/tam;
		System.out.println("La media de los num "+media);
		System.out.println("Y el total has introducido"+creos);
		}while(tam!=0);
	}

}
