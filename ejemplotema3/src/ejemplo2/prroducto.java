package ejemplo2;

import java.util.Arrays;

public class prroducto {

	private double preciob;
	private String nombre;
	private int [] lista;
	
	
	
	public int[] getLista() {
		return lista;
	}
	public void setLista(int[] lista) {
		this.lista = lista;
	}
	public prroducto (double preciob,String nombre,int[] lista) {
		this.nombre=nombre;
		this.preciob=preciob;
		this.lista=lista;
	}
	//getters and setters
	public double getPreciob () {
		return preciob;
	}
	public void setPreciob (double preciob) {
		this.preciob=preciob;
	}
	public String getNombre () {
		return nombre;
	}
	public void setNombre (String nombre) {
		this.nombre=nombre;
	}
	//tostring
	@Override
	public String toString() {
		return "prroducto [preciob=" + preciob + ", nombre=" + nombre + ", lista=" + Arrays.toString(lista) + "]";
	}
	
	
	
}
