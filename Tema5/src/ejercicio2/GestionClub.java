package ejercicio2;

import java.util.Iterator;

public class GestionClub {
	
	private String nombre;
	private Crud crud;
	private double saldo;
	public GestionClub(String nombre, Crud crud, double saldo) {
		super();
		this.nombre = nombre;
		this.crud = crud;
		this.saldo = saldo;
	}
	//aqui se hace todos los no crud 
	//calcular cuansto ganaria el club en el mes
	//se hace con iterator porque recorre todo el array
	public void ganancia() {
		Iterator <Socio> it = crud.getLista().iterator();
		while (it.hasNext()) {
			
			
		}
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Crud getCrud() {
		return crud;
	}
	public void setCrud(Crud crud) {
		this.crud = crud;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "GestionClub [nombre=" + nombre + ", crud=" + crud + ", saldo=" + saldo + "]";
	}
	

}
