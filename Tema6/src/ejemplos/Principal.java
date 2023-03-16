package ejemplos;

import java.util.SortedMap;
import java.util.TreeMap;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortedMap<Integer,Equipo>lista=new TreeMap<>();
		Gestion g;
		Integer i;
		//añadimos elementos en el sortedMap
		Jugador j = new Jugador ("Andy Cook",35,"mc","ingles");
		Jugador j1= new Jugador("Lionel Messi",36,"dc","argentino");
		Jugador j2= new Jugador("Magico gonzalez",60,"dc","salvadoreño");
		Equipo e = new Equipo (j,"Bradford city");
		Equipo e1 = new Equipo (j1,"Psg");
		Equipo e2 = new Equipo (j,"Cadiz fc");
		lista.put(1, e);
		lista.put(2, e1);
		lista.put(3, e2);
		
		g= new Gestion (lista);
		System.out.println("los muestra");
		for(Integer k: lista.keySet()) {
			System.out.println(k+". "+lista.get(k));
		}
		System.out.println("headMap");
		g.headMap(2, e1);
		System.out.println("subMap");
		g.subMap(2, e1);
		System.out.println("tailMap");
		g.tailMap(2);
		

	}

}
