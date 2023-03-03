package ejercicio4_ticket;

import java.util.Iterator;
import java.util.Map;





public class Ticket {
	private Map<Integer,LineaVenta> listado;

	public Ticket(Map<Integer, LineaVenta> listado) {
		super();
		this.listado = listado;
	}
	
	public void mostrar() {
		for (Integer c: listado.keySet() ) {
			System.out.println(listado.get(c));
			System.out.println(c);
		}
	}
	public void agregar(Integer i,LineaVenta lv) {
		listado.put(i, lv);
	}
	public LineaVenta find(Integer id) {
		Iterator<Integer>it=listado.keySet().iterator();
		Integer encontrado = null;
		while (it.hasNext()) {
			id=it.next();
			if (encontrado==id) {
				return listado.get(encontrado);
			}
			
		}
		return null;
	}
	public void editPrecioUni(LineaVenta lv,double nuevoPrecio) {
		lv.getP().setPrecioUni(nuevoPrecio);
	}
	public void eliminar(Integer id) {
		listado.remove(id);
	}
	public double calacularImporteTotal(double porcentajeIva,double porcentaje) {
		double importeTotal=0.0;
		for ( Integer id : listado.keySet()) {
			importeTotal+=listado.get(id).calacularLinea();
		}
		return importeTotal;
	}
	

	public Map<Integer, LineaVenta> getListado() {
		return listado;
	}

	public void setListado(Map<Integer, LineaVenta> listado) {
		this.listado = listado;
	}

	@Override
	public String toString() {
		return "Ticket [listado=" + listado + "]";
	}

	
	
	

}
