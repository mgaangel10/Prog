package ejemplo;

public class Jugador {
	private String nombre;
	private int dorsal;
	private String posicion;
	private int edad;
	public Jugador(String nombre, int dorsal, String posicion, int edad) {
		super();
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.posicion = posicion;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDorsal() {
		return dorsal;
	}
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", dorsal=" + dorsal + ", posicion=" + posicion + ", edad=" + edad + "]";
	}
	
	

}
