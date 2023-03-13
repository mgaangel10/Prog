package ejemploentorno;

public class Mecanico extends Trabajador{
	
	private int numCochesReparado;
	private String marca;
	
	public Mecanico(String nombre, String apellidos, double sueldo, String dni, int edad, int numCochesReparado,
			String marca) {
		super(nombre, apellidos, sueldo, dni, edad);
		this.numCochesReparado = numCochesReparado;
		this.marca = marca;
	}
	
	public int getNumCochesReparado() {
		return numCochesReparado;
	}
	public void setNumCochesReparado(int numCochesReparado) {
		this.numCochesReparado = numCochesReparado;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	@Override
	public String toString() {
		return super.toString()+"Mecanico [numCochesReparado=" + numCochesReparado + ", marca=" + marca + "]";
	}
	@Override
	public double calcularSueldo() {
		// TODO Auto-generated method stub
		
		return super.getSueldo()*numCochesReparado;
	}
	
	
	
	
	

}
