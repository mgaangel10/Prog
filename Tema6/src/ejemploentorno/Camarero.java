package ejemploentorno;

public class Camarero extends Trabajador{
	private int numMesasAtendidas;
	private String zona;
	

	public Camarero(String nombre, String apellidos, double sueldo, String dni, int edad, int numMesasAtendidas,
			String zona) {
		super(nombre, apellidos, sueldo, dni, edad);
		this.numMesasAtendidas = numMesasAtendidas;
		this.zona = zona;
	}
	
	public int getNumMesasAtendidas() {
		return numMesasAtendidas;
	}
	public void setNumMesasAtendidas(int numMesasAtendidas) {
		this.numMesasAtendidas = numMesasAtendidas;
	}
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}

	@Override
	public String toString() {
		return "Camarero [numMesasAtendidas=" + numMesasAtendidas + ", zona=" + zona + "]";
	}
	@Override
	public double calcularSueldo() {
		// TODO Auto-generated method stub
		return super.getSueldo()*numMesasAtendidas;
	}
	
	

	
	
	

}
