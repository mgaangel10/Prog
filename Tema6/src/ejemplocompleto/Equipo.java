package ejemplocompleto;

public class Equipo {
	private Jugador j;
	private String nombre;
	private String colores;
	private String entrenador;
	private int trofeos;
	public Equipo(Jugador j, String nombre, String colores, String entrenador, int trofeos) {
		super();
		this.j = j;
		this.nombre = nombre;
		this.colores = colores;
		this.entrenador = entrenador;
		this.trofeos = trofeos;
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
	public String getColores() {
		return colores;
	}
	public void setColores(String colores) {
		this.colores = colores;
	}
	public String getEntrenador() {
		return entrenador;
	}
	public void setEntrenador(String entrenador) {
		this.entrenador = entrenador;
	}
	public int getTrofeos() {
		return trofeos;
	}
	public void setTrofeos(int trofeos) {
		this.trofeos = trofeos;
	}
	@Override
	public String toString() {
		return "Equipo [j=" + j + ", nombre=" + nombre + ", colores=" + colores + ", entrenador=" + entrenador
				+ ", trofeos=" + trofeos + "]";
	}
	
	
	
	
	
	
	
	
	

}
