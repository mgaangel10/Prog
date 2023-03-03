package ejercicio4_ticket;

import java.util.Map;

public class Ticket {
	private Map<Producto,Integer> listado;

	public Ticket(Map<Producto, Integer> listado) {
		super();
		this.listado = listado;
	}
	public double calacularPrecioDeUno(Producto p) {
		return p.calcualrPrecio();
	}
	public void calcularTotal(LineaVenta lv) {
		for (Producto p : listado.keySet()) {
			System.out.println(lv.calacularLinea()); 
		}
	}

	public Map<Producto, Integer> getListado() {
		return listado;
	}

	public void setListado(Map<Producto, Integer> listado) {
		this.listado = listado;
	}

	@Override
	public String toString() {
		return "Ticket [listado=" + listado + "]";
	}
	
	

}
