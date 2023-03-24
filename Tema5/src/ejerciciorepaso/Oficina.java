package ejerciciorepaso;

import java.util.Iterator;
import java.util.Map;

public class Oficina {
	
	private Map<Cliente, Cuenta> listado;
	
	
	
	
	public Oficina(Map<Cliente, Cuenta> listado) {
		super();
		this.listado = listado;
	}
	
	public void agregar(Cliente id,Cuenta c) {
		listado.put(id, c);
	}

	public void mostrarCuenta() {
		for (Cliente c: listado.keySet()) {
			System.out.println(listado.get(c));
		}
	}
	
	public double calcularSueldosTotales() {
		double importeTotal=0.0;
		for(Cliente d:listado.keySet()) {
			importeTotal+=listado.get(d).calcularSaldo();
		}
		return importeTotal;
	}
	
	public Cuenta findBy(String nombre) {
		Iterator<Cuenta> it=listado.values().iterator();
		Cuenta cu;
		while (it.hasNext()) {
			cu=it.next();
			if (cu.getC().getNombre().equalsIgnoreCase(nombre)) {
				return listado.get(cu);
			}
			
			
		}
		return null;
	}
	
	public void editPrecio(double precioN,String nombre) {
		listado.get(findBy(nombre)).getC().setSaldo(precioN);;
	}
	
	

	public Map<Cliente, Cuenta> getListado() {
		return listado;
	}

	public void setListado(Map<Cliente, Cuenta> listado) {
		this.listado = listado;
	}

	@Override
	public String toString() {
		return "Oficina [listado=" + listado + "]";
	}

	
	
	
	

	
	
	

}
