package ejemplolist;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Alumno a = new Alumno ("Miguel",34,4.9);
		
		List <Alumno> listado=new ArrayList <Alumno> ();
		List <String> lista2=new ArrayList<String> ();
		listado.add(new Alumno("angel",33,2.3));
		System.out.println(listado);
		//agregar elementos
		listado.add(0, a);
		System.out.println(listado);
		//ver el tamaño de la lista
		System.out.println("el tamaño de lista es de ");
		System.out.println(listado.size());
		//ver elemento get 
		System.out.println("ver indice");
		System.out.println(listado.get(1));
		//las colecciones tinen que ser de objetos
		lista2.add("hola");
		System.out.println(lista2);
		
		List <Integer> lista3= new ArrayList <Integer>();
		lista3.add(1);
		System.out.println(lista3);
		lista2.remove(0);
		System.out.println(lista2);
		

	}

}
