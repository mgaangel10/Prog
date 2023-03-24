package ejercicio1;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int monenda=0, elecion=0,hasta=0,desde=0,contador=0,suma=0,mayor=0,menor=0,total=0,medespana=50;
		int []numMony;
		int [] sumsem;
		int semanas=0;//tamaño
		String nombre;
		
		Random num=new Random(System.nanoTime());
		
		System.out.println("Bienvenido");
		System.out.println("Dígame, ¿Cúantas semanas desea ahorrar? si pulsa 0 se cerrara el programa");
		semanas=Leer.datoInt();
		numMony=new int[semanas];
		sumsem=new int[semanas];
		do {
		
		
		System.out.println("-----------------\n"
						+ "  PLAN DE AHORRO \n"
						+ "-------------------\n"
						+ "pulse 1 ------------si deseas saber cuantas monedas tienes que ahorra cada semana\n"
						+ "pulse 2 ------------para mostrar las monedas de cada semana \n"
						+ "pulse 3 ------------para mostrar el total  que ahorrado en euros\n"
						+ "pulse 4 ------------para mostrar la semana que ahorrado mas\n"
						+ "pulse 5 ------------para ver la media\n"
						+ "pulse 6 ------------modificar la cantidad ahorrada en una semana\n"
						+ "pulse 7 ------------lo que una familia española debe ahorrar a la semana\n");
		elecion=Leer.datoInt();
		switch (elecion) {
		case 1:
			System.out.println("cuantas monedas podrias ahorra a la semana ");
			System.out.println("desde");
			desde=Leer.datoInt();
			System.out.println("hasta");
			hasta=Leer.datoInt();
			
			
			break;
		case 2:
			System.out.println("Estas son las monedas de cada semana");
			for (int i = 0; i < numMony.length; i++) {
				contador++;
				numMony[i]=num.nextInt(hasta-desde+1)+desde;
				System.out.println("semana "+contador+": "+numMony[i]+" monedas");
			}
			contador=0;
			break;
		case 3:
			System.out.println("El total de monedas ahorradas son");
			for (int i = 0; i < numMony.length; i++) {
				suma=numMony[i]+suma;
				contador++;
				System.out.println("semana "+contador+":"+suma);
				
			}
			
			
			break;
		case 4:
			System.out.println("La semana que mas has ahorrado es ");
			mayor=numMony[0];
			menor=numMony[0];
			for (int i = 0; i < numMony.length; i++) {
				if (menor>numMony[i]) {
					menor=numMony[i];
					
				}
				if (mayor<numMony[i]) {
					mayor=numMony[i];
					
				}
				
			}
			System.out.println("mayo:"+mayor);
			System.out.println("men:"+menor);
			break;
		case 5:
			
			total=suma/semanas;
			System.out.println("la media de ahorro semanal es de:"+total);
			break;
			
		case 6:
			
		case 7:
			System.out.println("");
			for (int i = 0; i < numMony.length; i++) {
				if (numMony[i]>medespana) {
					System.out.println(numMony);
					
				}
			}
		
			
		case 8:
			total=0;
			System.out.println("Contando que una familia española ahorra 50€\n a la semana usted a ahorrado un:");
			total=medespana*suma/100;
			System.out.println(total+"%");
		default: 
			System.out.println("no existe ese valor");
			break;
		}
		}while(semanas!=0);
		System.out.println("gracias por usarlo");
		

	}

}
