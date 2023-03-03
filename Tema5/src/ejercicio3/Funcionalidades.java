package ejercicio3;

import java.util.Set;

public class Funcionalidades {
	
	private double numSuspensos;
	private double mediaSupensos;
	private double media;
	private Set <Alumno> list;
	
	public Funcionalidades(double numSuspensos, double mediaSupensos, double media, Set<Alumno> list) {
		super();
		this.numSuspensos = numSuspensos;
		this.mediaSupensos = mediaSupensos;
		this.media = media;
		this.list = list;
	}
	
	
	
	
	
	
	
	public double getNumSuspensos() {
		return numSuspensos;
	}
	public void setNumSuspensos(double numSuspensos) {
		this.numSuspensos = numSuspensos;
	}
	public double getMediaSupensos() {
		return mediaSupensos;
	}
	public void setMediaSupensos(double mediaSupensos) {
		this.mediaSupensos = mediaSupensos;
	}
	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
	}
	public Set<Alumno> getList() {
		return list;
	}
	public void setList(Set<Alumno> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "Funcionalidades [numSuspensos=" + numSuspensos + ", mediaSupensos=" + mediaSupensos + ", media=" + media
				+ ", list=" + list + "]";
	}
	
	
	

}
