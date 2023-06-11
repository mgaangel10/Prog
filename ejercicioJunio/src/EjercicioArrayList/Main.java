package EjercicioArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String posicion="central";
		ArrayList<Jugador> list =  new ArrayList<Jugador>();
		String nombre;
		String nuevoNombre;
		Equipo e = new Equipo(list);
		Jugador j,j2,j3,j4;
		 ArrayList<Jugador> jugadoresPosicion = new ArrayList<>();
		j=new Jugador("messi","delantero",10);
		j2=new Jugador("gerard","central",3);
		j3=new Jugador("sergio","medio",20);
		j4=new Jugador("jordi","central",18);
		e.addJugador(j);
		e.addJugador(j2);
		e.addJugador(j3);
		e.addJugador(j4);
		
		System.out.println("ver jugadores");
		e.listarJugadores();
		System.out.println("buscar por nombre");
		nombre=s.next();
		e.imprimirBuscado(nombre);
		System.out.println("ordenar por posicion");
		Collections.sort(list,new OrdenarNumero());
		for(Jugador jugador:list) {
			System.out.println(jugador);
		}
		System.out.println("buscar por posicion");
		
		e.buscarPosicion(posicion);
	
		System.out.println("editar nombre");
		nuevoNombre=s.next();
		e.EditarNombre(nuevoNombre, j4);
		e.listarJugadores();
		
		

	}

}
