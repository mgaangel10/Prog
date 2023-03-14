package ejemplos;

import java.util.SortedMap;

public class Gestion {

	private SortedMap<Integer,Equipo> lista;

	public Gestion(SortedMap<Integer, Equipo> lista) {
		super();
		this.lista = lista;
	}

	public SortedMap<Integer, Equipo> getLista() {
		return lista;
	}

	public void setLista(SortedMap<Integer, Equipo> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Gestion [lista=" + lista + "]";
	}
	
	
	
}
