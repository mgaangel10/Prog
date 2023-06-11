package EjercicioArrayList;

public class Jugador {
	private String nombre,posicion;
	private int numCamiseta;
	
	
	public Jugador(String nombre, String posicion, int numCamiseta) {
		super();
		this.nombre = nombre;
		this.posicion = posicion;
		this.numCamiseta = numCamiseta;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public int getNumCamiseta() {
		return numCamiseta;
	}
	public void setNumCamiseta(int numCamiseta) {
		this.numCamiseta = numCamiseta;
	}
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", posicion=" + posicion + ", numCamiseta=" + numCamiseta + "]";
	}
	

}
