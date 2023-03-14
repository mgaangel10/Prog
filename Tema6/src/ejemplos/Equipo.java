package ejemplos;

public class Equipo {
	
	private Jugador j;
	private String nombre;
	public Equipo(Jugador j, String nombre) {
		super();
		this.j = j;
		this.nombre = nombre;
	}
	public Jugador getJ() {
		return j;
	}
	public void setJ(Jugador j) {
		this.j = j;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Equipo [j=" + j + ", nombre=" + nombre + "]";
	}

	
	
	
	

}
