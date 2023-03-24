package ejercicio4bienhecho;

public class Ropa extends Producto{
	
	public Ropa(double precioUnit, String nombre, String id) {
		super(precioUnit, nombre, id);
		// TODO Auto-generated constructor stub
	}
	//toString

	@Override
	public String toString() {
		return "Ropa [toString()=" + super.toString() + "]";
	}
	//literalmete no tiene nada aqi no tiene ha decdo que no tenga porque el no habra sabido que atributo ponele se le ha sudado el huevo derecho no ponerle y si no tiene atributos no puedes teber geter aro
	
	public double calcularPVP() {
		return super.getPrecioUnit();
	}

}
