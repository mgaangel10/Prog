package ejemplos;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;
/**
 * <p> hola que tal</p>
 * shshsh<code>APP</code>
 * @author Admin
 *
 */

public class Principal {
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortedMap<Integer,Equipo>lista=new TreeMap<>();
		List<Jugador> list= new ArrayList<Jugador>();
		List<Jugador>list2= new ArrayList<Jugador>();
		List<Jugador>list3= new ArrayList<Jugador>();
		Gestion g;
		Integer i;
		
		//añadimos elementos en el sortedMap
		Jugador j = new Jugador ("Andy Cook",35,"mc","ingles");
		Jugador j2= new Jugador("Magico gonzalez",60,"dc","salvadoreño");
		Jugador j1= new Jugador("Lionel Messi",36,"dc","argentino");
		list.add(j);
		list.add(j1);
		list.add(j2);
		Jugador j3 = new Jugador ("Fernando claro",19,"mco","pelirrojo");
		Jugador j4= new Jugador("Rodri marina",18,"dc","español");
		Jugador j5= new Jugador("Kameni",40,"por","nose");
		list2.add(j3);
		list2.add(j4);
		list2.add(j5);
		Jugador j6 = new Jugador ("Cristiano Ronaldo",34,"ed","Portuges");
		Jugador j7= new Jugador("Pedri",20,"mc","español");
		Jugador j8= new Jugador("Gavi",18,"mc","español");
		list3.add(j6);
		list3.add(j7);
		list3.add(j8);
		
		Equipo e = new Equipo (list,"Bradford city");
		Equipo e1 = new Equipo (list2,"Psg");
		Equipo e2 = new Equipo (list3,"Cadiz fc");
		lista.put(1, e);
		lista.put(2, e1);
		lista.put(3, e2);
		
		g= new Gestion (lista);
		System.out.println("los muestra");
		for(Integer k: lista.keySet()) {
			System.out.println(k+". "+lista.get(k));
		}
		System.out.println("ordenar alfabeticamente");
		
		lista.putAll(g.getLista());
		for(Equipo eq:lista.values()) {
			System.out.println(eq.getList());
		}
		
		
		System.out.println("headMap");
		g.headMap(2, e1);
		System.out.println("subMap");
		g.subMap(2, e1);
		System.out.println("tailMap");
		g.tailMap(2);
		System.out.println("size :");
		g.size();
		System.out.println("contains : ");
		g.containts(1);
		System.out.println("lastkey :");
		g.lastKey();
		System.out.println("entryset :");
		g.entrySet();
		System.out.println("values :");
		g.values();
		
		

	}

}
