package ejercicio1;

public class SobreMesa extends Ordenador{
	
	private double precioMontaje;

	public SobreMesa(double capDisco, double frecuencia, double precio, String marca ,double precioMontaje) {
		super(capDisco, frecuencia, precio ,marca);
		this.precioMontaje = precioMontaje;
	}

	public double getPrecioMontaje() {
		return precioMontaje;
	}

	public void setPrecioMontaje(double precioMontaje) {
		this.precioMontaje = precioMontaje;
	}

	@Override
	public String toString() {
		return super.toString()+"SobreMesa [precioMontaje=" + precioMontaje + "]";
	}
	
	

}
