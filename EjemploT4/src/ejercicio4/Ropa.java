package ejercicio4;

public class Ropa extends Producto{
	
	private boolean lujosa;
	private double masDinero;
	
	public Ropa(double precioUni, String nombre, int codigo, boolean lujosa, double masDinero) {
		super(precioUni, nombre, codigo);
		this.lujosa = lujosa;
		this.masDinero = masDinero;
	}
	
	public double calcularPrecio() {
		double total1=0.0, total=0.0;
		if (lujosa=true) {
			total= super.calcularPrecio()+masDinero;
			total1=super.getPrecioUni()+total;
			return total1;
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
		return super.toString()+"Ropa [lujosa=" + lujosa + ", masDinero=" + masDinero + "]";
	}
	
	
	
	
	

}
