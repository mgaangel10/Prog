package ejemplo;

import java.util.Map;


public class Gestion {
	private Map<Jugador,Equipo> lista;

	public Gestion(Map<Jugador, Equipo> lista) {
		super();
		this.lista = lista;
	}
	
	public void agregar(Jugador j,Equipo e) {
		lista.put(j, e);
	}
	public void mostrar() {
		for(Jugador j:lista.keySet()) {
			System.out.println(lista.get(j));
		}
	}

	public Map<Jugador, Equipo> getLista() {
		return lista;
	}

	public void setLista(Map<Jugador, Equipo> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Gestion [lista=" + lista + "]";
	}
	
	
	

}
