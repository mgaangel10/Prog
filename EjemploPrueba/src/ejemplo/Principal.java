package ejemplo;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
/**
 * 
 * @author Admin
 * @version 1.2
 * @since 1.0
 *
 */

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TODO instancia de Map
		Map<Jugador,Equipo> lista = new HashMap<Jugador,Equipo>();
		Gestion g;
		Jugador j;
		Equipo e;
		
		j= new Jugador("hola",19,"ld",19);
		
		e=new Equipo(j,"betis",2);
		g=new Gestion (lista);
		
		g.agregar(j, e);
		
		System.out.println("muestra");
		g.mostrar();
		

	}

}
