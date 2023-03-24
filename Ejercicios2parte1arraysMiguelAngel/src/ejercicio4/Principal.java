package ejercicio4;

import java.util.Iterator;
import java.util.Random;

import utilidades.Leer;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam=10;
		int elemt=0;
		
	
		int [] aleatorio;
		int hasta=0;
		int desde=0;
		aleatorio=new int[tam];
		Random num= new Random (System.nanoTime());
		System.out.println("Bienvenido al programa en el que vamos a \ngenerar numeros aleatorios");
		do {
		System.out.println("Diga un numero (menor)");
		desde=Leer.datoInt();
		System.out.println("Diga otro numero (mayor)");
		hasta=Leer.datoInt();
		for (int i = 0; i < aleatorio.length; i++) {
			aleatorio[i]=num.nextInt(hasta-desde+1)+desde;
			System.out.println(aleatorio[i]);
			
		}
		System.out.println("Indique el elemento que deseas guardar");
		elemt=Leer.datoInt();
		System.out.println("El numero que has guardado es: "+aleatorio[elemt-1]);
		}while(desde>=0);
		
		
	}

}
