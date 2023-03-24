package ejercicio5;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] producto;
		int tam=0;
		int mayor=0, menor=0;
		int suma=0,elemento=0;
		int newval=0,tope=3;
		int hasta=0, desde=0;
		Random num= new Random (System.nanoTime());
		System.out.println("Bienvenido al programa");
		System.out.println("Dime cuantos productos tienes");
		tam=Leer.datoInt();
		producto=new int[tam];
		
		for (int i = 0; i < producto.length; i++) {
			System.out.println("Digame el precio de los productos");
			producto[i]=Leer.datoInt();
		}
		for (int i = 0; i < producto.length; i++) {
			System.out.println(producto[i]);
		}
		System.out.println("Vamos a generar aleatorios ");
		System.out.println("Diga el mayor");
		hasta=Leer.datoInt();
		System.out.println("Diga el menor");
		desde=Leer.datoInt();
		
		
				
				
				for (int i = 0; i <producto.length; i++) {
					producto[i]=num.nextInt(hasta-desde+1)+desde;
					System.out.println(producto[i]);
					suma=producto[i]+suma;
					
				}
				
				System.out.println("La suma es: "+suma);
				
				menor=producto[0];
				mayor=producto[0];
				
				for (int i = 0; i < producto.length; i++) {
					
					if(menor>producto[i]) {
						menor=producto[i];
					}
					
					if(mayor<producto[i]) {
						mayor=producto[i];
					}
					
				}
				suma=0;
				System.out.println(" El mayor "+mayor);
				System.out.println("El menor "+menor);
				
			System.out.println("que elemento queires cambiar");
			elemento=Leer.datoInt();
			
				System.out.println("que numero deseas guardar");
				producto[elemento-1]=Leer.datoInt();
			
			for (int i = 0; i < producto.length; i++) {
				System.out.println("el resultado del nuevo valor: "+producto[i]);
				suma=producto[i]+suma;
			}
			System.out.println("La suma es: "+suma);
			menor=producto[0];
			mayor=producto[0];
			
			for (int i = 0; i < producto.length; i++) {
				
				if(menor>producto[i]) {
					menor=producto[i];
				}
				
				if(mayor<producto[i]) {
					mayor=producto[i];
				}
				
			}
			System.out.println(" El mayor "+mayor);
			System.out.println("El menor "+menor);
			
		
	}

}
