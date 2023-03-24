package ejercicio3L2;



public class Movil {
	
	

	private String marca;
	private String modelo;
	private boolean vendido;
	private double precioUni;
	
	public Movil(String marca, String modelo, boolean vendido, double precioUni) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.vendido = vendido;
		this.precioUni = precioUni;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isVendido() {
		return vendido;
	}

	public void setVendido(boolean vendido) {
		this.vendido = vendido;
	}

	public double getPrecioUni() {
		return precioUni;
	}

	public void setPrecioUni(double precioUni) {
		this.precioUni = precioUni;
	}
	
	
	@Override
	public String toString() {
		return "Movil [marca=" + marca + ", modelo=" + modelo + ", vendido=" + vendido + ", precioUni=" + precioUni
				+ "]";
	}
	
	public int compareTo(Movil m) {
		if (this.marca.equalsIgnoreCase(m.getMarca())
				&&this.modelo.equalsIgnoreCase(m.getModelo())
				&&this.precioUni==m.getPrecioUni()) {
			return 0;
		} else {
			return -1;
		}
	}
	
	
	
	
	
	
	
	

}
