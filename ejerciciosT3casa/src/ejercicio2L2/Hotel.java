package ejercicio2L2;

import java.util.Arrays;

public class Hotel {
	private Habitacion lista[];

	public Hotel(Habitacion[] lista) {
		super();
		this.lista = lista;
	}
	//METODO ADD
	public void add(Habitacion h,int posicion) {
		lista[posicion]=h;
	}
	//impirmir
	public void imprimirTodo() {
		for (int i = 0; i < lista.length; i++) {
			System.out.println((i+1)+". "+lista[i]);
		}
	}
	//metodos
	

	public Habitacion[] getLista() {
		return lista;
	}

	public void setLista(Habitacion[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Hotel [lista=" + Arrays.toString(lista) + "]";
	}
	
	

}
