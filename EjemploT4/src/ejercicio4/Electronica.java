package ejercicio4;

public class Electronica extends Producto{
	
	
	private double impuesto ;
	private boolean lujo;
	
	public Electronica(double precioUni, String nombre, int codigo, double impuesto, boolean lujo) {
		super(precioUni, nombre, codigo);
		this.impuesto = impuesto;
		this.lujo = lujo;
	}
	
	public double calcularPrecio() {
		double total1=0.0, total=0.0;
		if (lujo=true) {
			total1=super.calcularPrecio()+impuesto;
			total=total1+super.getPrecioUni();
			return total;
		} else {
			return super.getPrecioUni();
		}
	}

	public double getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}

	public boolean isLujo() {
		return lujo;
	}

	public void setLujo(boolean lujo) {
		this.lujo = lujo;
	}

	@Override
	public String toString() {
		return super.toString()+"Electronica [impuesto=" + impuesto + ", lujo=" + lujo + "]";
	}
	
	
	
	
	
	
	

}
