package ejemploentorno;

public class Comercial extends Trabajador{
	private int numVentas;
	private boolean icentivo;

	
	
	public Comercial(String nombre, String apellidos, double sueldo, String dni, int edad, int numVentas,
			boolean icentivo) {
		super(nombre, apellidos, sueldo, dni, edad);
		this.numVentas = numVentas;
		this.icentivo = icentivo;
	}
	
	public int getNumVentas() {
		return numVentas;
	}
	public void setNumVentas(int numVentas) {
		this.numVentas = numVentas;
	}
	public boolean isIcentivo() {
		return icentivo;
	}
	public void setIcentivo(boolean icentivo) {
		this.icentivo = icentivo;
	}

	@Override
	public String toString() {
		return "Comercial [numVentas=" + numVentas + ", icentivo=" + icentivo + "]";
	}
	@Override
	public double calcularSueldo() {
		// TODO Auto-generated method stub
		if (icentivo) {
			return super.getSueldo()*numVentas;
		} else {
			return super.getSueldo();
		}
		
	}
	
	
	
	



	
	

}
