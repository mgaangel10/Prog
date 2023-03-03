package ejercicio4_ticket;

public class Ropa extends Producto {
	
	private boolean lujosa;
	private double masDinero;
	
	public Ropa(double precioUni, String nombre, int codigo, boolean lujosa, double masDinero) {
		super(precioUni, nombre, codigo);
		this.lujosa = lujosa;
		this.masDinero = masDinero;
	}
	public double calcularSueldo() {
		double total=0.0;
		if (lujosa==true) {
			return total=masDinero+super.calcualrPrecio();
		} else {
			return super.getPrecioUni();
		}
	}
	public boolean isLujosa() {
		return lujosa;
	}
	public void setLujosa(boolean lujosa) {
		this.lujosa = lujosa;
	}
	public double getMasDinero() {
		return masDinero;
	}
	public void setMasDinero(double masDinero) {
		this.masDinero = masDinero;
	}
	@Override
	public String toString() {
		return "Ropa [lujosa=" + lujosa + ", masDinero=" + masDinero + "]";
	}
	
	
	

}
