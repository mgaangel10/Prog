package ejercicio5;



public class DatosPersonal implements Comparable <DatosPersonal> {
	private String nombre;
	private String apellidos;
	private int edad;
	
	public DatosPersonal(String nombre, String apellidos, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	public int compareTo(DatosPersonal c1) {
		String nombre1=c1.getNombre();
		String nombre2=this.getNombre();
		return -(nombre1.toLowerCase().compareTo(nombre2.toLowerCase()));
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "DatosPersonal [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + "]";
	}
	
	
	
	

}
