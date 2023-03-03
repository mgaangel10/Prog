package ejercicio4_ticket;

import java.util.HashMap;
import java.util.Map;

import ejercicio4.Contacto;



public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map <Integer,LineaVenta> listado=new HashMap <Integer,LineaVenta>();
		int masuno=1;
		Integer idMap = masuno;
		listado.put(idMap, new LineaVenta(new Ropa(100,"nike",1,true,5),2));
		++masuno;
		
		
		
		
		
		
		
		
		
		
		

	}

}
