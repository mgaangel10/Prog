package ejercicio2;

public class Carta {
	
	private String nombre;
	private  String cif;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public Carta(String nombre, String cif) {
		super();
		this.nombre = nombre;
		this.cif = cif;
	}
	
	
	

}
