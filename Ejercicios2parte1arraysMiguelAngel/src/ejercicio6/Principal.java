package ejercicio6;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] producto;
		double [] pagos;
		int contador=0;
		int num=0;
		int tam=0;
		System.out.println("Hola bienvenido al programa para ");
		System.out.println("diga cuantos productos quieres almacenar");
		tam=Leer.datoInt();
		producto= new String[tam];
		pagos=new double[tam];
		
		do {
		
		for (int i =0 ; i < producto.length; i++) {
			contador++;
			System.out.println("dime el nombres de los productos");
			producto[i]=Leer.dato();
			
			}
		for (int i = 0; i < pagos.length; i++) {
			
			System.out.println("dime el precio del producto '"+producto[i]+"'");
			pagos[i]=Leer.datoDouble();  
			
		}
		
		for (int i = 0; i < pagos.length; i++) {
			System.out.print("nombre de los productos: \t "+producto[i]+"\n");
			
			
			
			
		}
	
		
		for (int i = 0; i < pagos.length; i++) {
			System.out.printf("precio de los productos: %.2f \t",pagos[i],"\n");
		}
		System.out.println("\n");
		}while(tam!=0);
		System.out.println("gracias");
		// hayq ue poner numero de productos y nombre de los meses
		
		
	}

}
