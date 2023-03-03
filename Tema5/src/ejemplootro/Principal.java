package ejemplootro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <String> listanom = new ArrayList <String> ();
		 listanom.add("juan perez");
		 listanom.add("juan perez 2");
		 listanom.add("juan perez 3");
		 listanom.add("alberto");
		 String cadenaBuscar="alberto";
		 System.out.println("la cadena que buscamos es "+cadenaBuscar);
		 
		 Iterator<String> it = listanom.iterator();
		 
		 String tmpAnalizando;
		 
		 while (it.hasNext()) {//Utilizamos el método hasNext de los objetos tipo Iterator
			 tmpAnalizando = it.next();//Utilizamos el método next de los objetos tipo Iterator
			 System.out.println ("Analizando elemento... " + tmpAnalizando);
			 if (tmpAnalizando.contains(cadenaBuscar)) {
			 System.out.println ("Cadena encontrada!!!");
			 } else { 
				 
			 }//else vacío. No hay acciones a ejecutar.
			 }
		 

	}

}
