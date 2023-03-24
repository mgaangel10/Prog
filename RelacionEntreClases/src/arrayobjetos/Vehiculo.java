package arrayobjetos;

public class Vehiculo {
	
	
	private String modelo;
	private double precio;
	
	public Vehiculo() {
		
	}

	public Vehiculo(String modelo, double precio) {
		
		this.modelo = modelo;
		this.precio = precio;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Vehiculo [modelo=" + modelo + ", precio=" + precio + "]";
	}
	
	

}
