package ejemplos;

import java.util.SortedMap;
import java.util.TreeMap;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortedMap<Integer,Equipo>lista=new TreeMap<>();
		Gestion g;
		//añadimos elementos en el sortedMap
		Jugador j = new Jugador ("angel",1);
		Equipo e = new Equipo (j,"betis");
		lista.put(1, e);
		
		g= new Gestion (lista);
		System.out.println("los muestra");
		for(Integer k: lista.keySet()) {
			System.out.println(k+". "+lista.get(k));
		}
		

	}

}
