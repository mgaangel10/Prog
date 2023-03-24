package ejemplo;

public class Equipo {
	
	private Jugador j;
	private String nombre;
	private int copas;
	public Equipo(Jugador j, String nombre, int copas) {
		super();
		this.j = j;
		this.nombre = nombre;
		this.copas = copas;
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
	public int getCopas() {
		return copas;
	}
	public void setCopas(int copas) {
		this.copas = copas;
	}
	@Override
	public String toString() {
		return "Equipo [j=" + j + ", nombre=" + nombre + ", copas=" + copas + "]";
	}
	
	
}
