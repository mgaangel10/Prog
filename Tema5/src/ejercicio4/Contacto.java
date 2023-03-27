package ejercicio4;

import java.util.Objects;
/**
 * Esta es una clase que representa un objeto "Contacto"
 * Contiene informacion como el id,nombre,correo
 * @author Admin
 *
 */

public class Contacto implements Comparable <Contacto>{
	private int id;
	private String nombre;
	private String correo;
	
	public Contacto(int id, String nombre, String correo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.correo = correo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	@Override
	public String toString() {
		return "Contacto [id=" + id + ", nombre=" + nombre + ", correo=" + correo + "]";
	}
	/**
	 * se utiliza para identificar y buscar objetos de manera mas eficiente
	 * @param no hay
	 * 
	 */
	
	@Override
	public int hashCode() {
		return Objects.hash(correo, id, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contacto other = (Contacto) obj;
		return Objects.equals(correo, other.correo) && id == other.id && Objects.equals(nombre, other.nombre);
	}
	@Override
	public int compareTo(Contacto o) {
		// TODO Auto-generated method stub
		return -(o.getNombre().toLowerCase().compareTo(this.nombre.toLowerCase()));
		
	}
	
	

}

