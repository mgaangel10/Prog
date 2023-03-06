package ejerciciorepaso;

import java.util.Iterator;
import java.util.Map;

public class Oficina {
	
	private Map<Integer,Cuenta> listado;
	
	
	
	
	public Oficina(Map<Integer, Cuenta> listado) {
		super();
		this.listado = listado;
	}
	
	public void agregar(Integer id,Cuenta c) {
		listado.put(id, c);
	}

	public void mostrarCuenta() {
		for (Integer c: listado.keySet()) {
			System.out.println(listado.get(c));
		}
	}
	
	public double calcularSueldosTotales() {
		double importeTotal=0.0;
		for(Integer d:listado.keySet()) {
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
	
	public void editPrecio(Integer id,double precioN) {
		listado.get(id).getC().setSaldo(precioN);
	}
	
	

	public Map<Integer, Cuenta> getListado() {
		return listado;
	}

	public void setListado(Map<Integer, Cuenta> listado) {
		this.listado = listado;
	}

	@Override
	public String toString() {
		return "Oficina [listado=" + listado + "]";
	}

	
	
	
	

	
	
	

}
