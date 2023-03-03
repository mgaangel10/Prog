package ejercicio4_ticket;

public class Alimentacion extends Producto {
	
	private double rebaja;
	private int diasCad;
	
	public Alimentacion(double precioUni, String nombre, int codigo, double rebaja, int diasCad) {
		super(precioUni, nombre, codigo);
		this.rebaja = rebaja;
		this.diasCad = diasCad;
	}
	public double calcularPrecio() {
		double total=0.0;
		if (diasCad<2) {
			return total=super.calcualrPrecio()-rebaja;
		} else {
			return super.getPrecioUni();
		}
	}
	public double getRebaja() {
		return rebaja;
	}
	public void setRebaja(double rebaja) {
		this.rebaja = rebaja;
	}
	public int getDiasCad() {
		return diasCad;
	}
	public void setDiasCad(int diasCad) {
		this.diasCad = diasCad;
	}
	@Override
	public String toString() {
		return "Alimentacion [rebaja=" + rebaja + ", diasCad=" + diasCad + "]";
	}
	
	
	

}
