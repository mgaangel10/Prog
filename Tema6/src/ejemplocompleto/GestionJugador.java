package ejemplocompleto;

import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;

public class GestionJugador {
	
	private Map<Jugador,Equipo> lista;

	public GestionJugador(Map<Jugador, Equipo> lista) {
		super();
		this.lista = lista;
	}
	
	public Equipo agregar(Jugador j,Equipo e) {
		
		lista.put(j, e);
		return e;
	}
	
	public void mostrar() {
		for (Jugador j:lista.keySet()) {
			System.out.println(lista.get(j));
		}
	}
	
	public double cacularSueldoAnual(Jugador j) {
		double total=0.0;
		int meses=12;
		
		return total=meses*j.getSalario();
		}
	public Jugador findyByNombre(String nombre) {
		Iterator<Jugador> list = lista.keySet().iterator();
		Jugador j;
		while (list.hasNext()) {
			j=list.next();
			if (j.getNombre().equalsIgnoreCase(nombre)) {
				return j;
				}
			
		}
		return null;
	}
	
	
	

	public Map<Jugador, Equipo> getLista() {
		return lista;
	}

	public void setLista(Map<Jugador, Equipo> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "GestionJugador [lista=" + lista + "]";
	}
	
	

}
