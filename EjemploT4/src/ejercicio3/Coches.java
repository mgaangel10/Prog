package ejercicio3;

public class Coches extends Vehiculos{
	
	private boolean ServicioPublic;

	public Coches(double impuesto, double cilindrada, double potencia, double categoria, boolean servicioPublic) {
		super(impuesto, cilindrada, potencia, categoria);
		ServicioPublic = servicioPublic;
	}

	public boolean isServicioPublic() {
		return ServicioPublic;
	}

	public void setServicioPublic(boolean servicioPublic) {
		ServicioPublic = servicioPublic;
	}

	@Override
	public String toString() {
		return super.toString()+"Coches [ServicioPublic=" + ServicioPublic + "]";
	}
	
	

}
