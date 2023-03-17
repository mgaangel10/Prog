package ejemplos;

import java.util.List;

public class Equipo {
	
	private List<Jugador> list;
	private String nombre;
	
	public Equipo(List<Jugador> list, String nombre) {
		super();
		this.list = list;
		this.nombre = nombre;
	}
	public List<Jugador> getList() {
		return list;
	}
	public void setList(List<Jugador> list) {
		this.list = list;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Equipo [list=" + list + ", nombre=" + nombre + "]";
	}
	

	
	
	
	

}
