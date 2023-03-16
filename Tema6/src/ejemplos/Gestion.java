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
	public void headMap(Integer i,Equipo e) {
		System.out.println(lista.headMap(i));
	}
	public void subMap(Integer i,Equipo e) {
		System.out.println(lista.subMap(i, i));
	}
	public void tailMap(Integer i) {
		System.out.println(lista.tailMap(i));
		
	}
	public void setLista(SortedMap<Integer, Equipo> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Gestion [lista=" + lista + "]";
	}
	
	
	
}
