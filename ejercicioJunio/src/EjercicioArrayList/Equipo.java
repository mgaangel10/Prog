package EjercicioArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Equipo {
	private  List<Jugador> list;

	public Equipo(List<Jugador> list) {
		super();
		this.list = list;
	}
	
	public void addJugador(Jugador j) {
		list.add(j);
	}
	public void listarJugadores() {
		Iterator<Jugador> it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next().toString());
		}
	}
	public void eliminarJugador(Jugador j) {
		list.remove(j);
	}
	public  void buscarPosicion (String posicion) {
		for(Jugador jugador:list) {
			if (jugador.getPosicion().equalsIgnoreCase("central")) {
				System.out.println(jugador);
			}
		}
	}
	
	public Jugador FindByNombre(String nombre) {
		Iterator<Jugador> it = list.iterator();
		Jugador j;
		while(it.hasNext()) {
			j=it.next();
			if (j.getNombre().equalsIgnoreCase(nombre)) {
				return j;
			}
		}
		return null;
	}
	public void imprimirBuscado(String nombre) {
		System.out.println(FindByNombre(nombre));
	}
	
	public void EditarNombre(String nombre,Jugador j) {
		j.setNombre(nombre);
		
	}
	
	public void OrdenarPorPosicion() {
		
		Collections.sort(list, (j1, j2) -> Integer.compare(j1.getNumCamiseta(), j2.getNumCamiseta()));
	}
	
	
	

	public List<Jugador> getList() {
		return list;
	}

	public void setList(List<Jugador> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Equipo [list=" + list + "]";
	}
	
	

}
