package ejemplocompleto;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jugador j,j1,j2,j3;
		Equipo e,e1,e2,e3;
		GestionJugador gj;
		SortedMap<Jugador,Equipo> lista = new TreeMap <Jugador,Equipo>();
		
		j=new Jugador("Yousuff Sabaly",23,"ld",30,7000);
		j1=new Jugador("Luiz Felipe",19,"dfc",24,6992);
		j2=new Jugador("Rodrigo Riquelme",10,"mc",22,20000);
		j3=new Jugador("Jesus Navas",17,"banq",19,10000);	
		
		e=new Equipo(j,"Betis","verde y blanco","pellegrini",1999);
		e1=new Equipo(j1,"Betis","verde y blanco","pellegrini",1999);
		e2=new Equipo(j2,"Girona","Rojo y blanco","pellegrini",1999);
		e3=new Equipo(j3,"Sevilla","Rojo y blanco","pellegrini",1999);
		lista.put(j, e);
		lista.put(j1, e1);
		lista.put(j2, e2);
		lista.put(j3, e3);
		gj = new GestionJugador(lista);
		


		
		


		
		System.out.println("los muestra");
		for(Jugador k : lista.keySet()) {
			System.out.println(lista.get(k));
		}

	}

}
