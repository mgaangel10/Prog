package ejercicio7;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre;
		int tope=0;
		int total=0;
		double suma=0.0;
		double media=0.0;
		String []carrera;
		double [] time;
		
		System.out.println("Dime tu nombre");
		nombre=Leer.dato(); 
		System.out.println("Cuantas carreras has hecho");
		tope=Leer.datoInt();
		carrera=new String[tope];
		time=new double[tope];
		for (int i = 0; i < carrera.length; i++) {
			System.out.println("Indiqueme el nombre de la carrera");
			carrera[i]=Leer.dato();
			System.out.println("Indiqueme el tiempo de esa carrera");
			time[i]=Leer.datoInt();
			
		}
		for (int i = 0; i < time.length; i++) {
			System.out.printf("Nombre: "+carrera[i]+"\t");
		}
		System.out.println("\n");
		for (int i = 0; i < time.length; i++) {
			System.out.print("Tiempo: "+time[i]+"\t");
		}
		for (int i = 0; i < time.length; i++) {
			suma=suma+time[i];
			
		}
		System.out.println("\n");
		media=suma/tope;
		System.out.printf("La media es: %.2f",media,"min");
		
		
		
		
		

	}

}
