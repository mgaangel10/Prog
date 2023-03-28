package ejercicio4;

import java.util.List;

public class Aeropuerto {
	private List<Vuelos> lista;
	
	

	public Aeropuerto(List<Vuelos> lista) {
		super();
		this.lista = lista;
	}
	
	public void mostrar() {
		lista.stream()
		.forEach(System.out::println);
	}
	public void concatenar() {
		
	}

	public List<Vuelos> getLista() {
		return lista;
	}

	public void setLista(List<Vuelos> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Aeropuerto [lista=" + lista + "]";
	}
	
	
	

}
