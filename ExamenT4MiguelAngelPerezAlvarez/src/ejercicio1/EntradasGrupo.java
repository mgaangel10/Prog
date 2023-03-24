package ejercicio1;

public class EntradasGrupo extends EntradasNormales{
	
	private int numPersonas;
	
	public EntradasGrupo(String nombre, int numFila, int numAsiento, boolean zona1, boolean zona2, double precioZ1,
			double precioZ2, int numPersonas) {
		super(nombre, numFila, numAsiento, zona1, zona2, precioZ1, precioZ2);
		this.numPersonas = numPersonas;
		
	}
	
	public double calcularPrecio(double cantidad,double descuento) {
		double total=0.0;
		if (numPersonas>10) {
			total=super.calcularPrecio(cantidad,descuento)-descuento;
			return total;
		} else {
			return super.calcularPrecio(cantidad,descuento);
		}
		
	}
	
	public double calcularIva(double iva) {
		double total=0.0;
		return total=super.calcularIva(iva)+calcularPrecio(iva, total);
	}
	
	public int getNumPersonas() {
		return numPersonas;
	}
	public void setNumPersonas(int numPersonas) {
		this.numPersonas = numPersonas;
	}

	@Override
	public String toString() {
		return super.toString()+"EntradasGrupo [numPersonas=" + numPersonas + "]";
	}
	
	
	
	
	

	
	
	
	
	

}
