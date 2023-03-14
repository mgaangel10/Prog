package ejemplos;

public class Jugador {
	private String nombre;
	private int edad; 
	private String posicion;
	private String Nacionalidad;
	public Jugador(String nombre, int edad, String posicion, String nacionalidad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
		Nacionalidad = nacionalidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public String getNacionalidad() {
		return Nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		Nacionalidad = nacionalidad;
	}
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", edad=" + edad + ", posicion=" + posicion + ", Nacionalidad="
				+ Nacionalidad + "]";
	}
	
	
	
	

}
