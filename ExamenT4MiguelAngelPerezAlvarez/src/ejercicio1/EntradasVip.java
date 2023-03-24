package ejercicio1;

public class EntradasVip extends EntradasNormales{
	
	private String nombreArtista;

	public EntradasVip(String nombre, int numFila, int numAsiento, boolean zona1, boolean zona2, double precioZ1,
			double precioZ2, String nombreArtista) {
		super(nombre, numFila, numAsiento, zona1, zona2, precioZ1, precioZ2);
		nombre = nombreArtista;
	}
	
	public double calcularPrecio(double cantidad,double descuento) {
		double total=0.0;
		total=super.calcularPrecio(cantidad, descuento)+cantidad;
		
		return total;
	}
	
	public double calcularIva(double iva) {
		double total=0.0;
		return total=super.calcularIva(iva)+calcularPrecio(iva, total);
	}
	
	public void mensajeEntradavip() {
		System.out.println("foto con artista");
		System.out.println("bortella champan");
	}

	public String getNombreArtista() {
		return nombreArtista;
	}

	public void setNombreArtista(String nombreArtista) {
		this.nombreArtista = nombreArtista;
	}

	@Override
	public String toString() {
		return super.toString()+"EntradasVip [nombre=" + nombreArtista + "]";
	}
	
	
	
	
	
	
	

	
	
	

}
