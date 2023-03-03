package ejercicio1;

public class Nota {
	private String propietario,contenido;
	private int nNota;
	
	public Nota(String propietario, String contenido, int nNota) {
		super();
		this.propietario = propietario;
		this.contenido = contenido;
		this.nNota = nNota;
	}
	public String getPropietario() {
		return propietario;
	}
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	public int getnNota() {
		return nNota;
	}
	public void setnNota(int nNota) {
		this.nNota = nNota;
	}
	@Override
	public String toString() {
		return "Nota [propietario=" + propietario + ", contenido=" + contenido + ", nNota=" + nNota + "]";
	}
	
	

}
