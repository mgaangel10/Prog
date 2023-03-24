package ejercicio1;

public class EntradasNormales implements IDesglosable{
	
	private String nombre;
	private int numFila;
	private int numAsiento;
	private boolean zona1;
	private boolean zona2;
	private double precioZ1;
	private double precioZ2;
	
	public EntradasNormales(String nombre,int numFila, int numAsiento, boolean zona1, boolean zona2, double precioZ1,
			double precioZ2) {
		super();
		this.nombre=nombre;
		this.numFila = numFila;
		this.numAsiento = numAsiento;
		this.zona1 = zona1;
		this.zona2 = zona2;
		this.precioZ1 = precioZ1;
		this.precioZ2 = precioZ2;
		
	}
	
	//me encantas tu ami tambien
	public double calcularPrecio(double cantidad,double descuento) {
		if (zona1==true) {
			return getPrecioZ1();
		} else {
			return getPrecioZ2();
		}
		
	}
	
	
	
	
	
	
	
	public String getNombre() {
		return nombre;
	}





	public void setNombre(String nombre) {
		this.nombre = nombre;
	}





	public int getNumFila() {
		return numFila;
	}
	public void setNumFila(int numFila) {
		this.numFila = numFila;
	}
	public int getNumAsiento() {
		return numAsiento;
	}
	public void setNumAsiento(int numAsiento) {
		this.numAsiento = numAsiento;
	}
	public boolean isZona1() {
		return zona1;
	}
	public void setZona1(boolean zona1) {
		this.zona1 = zona1;
	}
	public boolean isZona2() {
		return zona2;
	}
	public void setZona2(boolean zona2) {
		this.zona2 = zona2;
	}
	public double getPrecioZ1() {
		return precioZ1;
	}
	public void setPrecioZ1(double precioZ1) {
		this.precioZ1 = precioZ1;
	}
	public double getPrecioZ2() {
		return precioZ2;
	}
	public void setPrecioZ2(double precioZ2) {
		this.precioZ2 = precioZ2;
	}


	@Override
	public String toString() {
		return "EntradasNormales [nombre=" + nombre + ", numFila=" + numFila + ", numAsiento=" + numAsiento + ", zona1="
				+ zona1 + ", zona2=" + zona2 + ", precioZ1=" + precioZ1 + ", precioZ2=" + precioZ2 + "]";
	}


	@Override
	public double calcularIva(double iva) {
		// TODO Auto-generated method stub
		double totalZ1=0.0,totalZ2=0.0;
		totalZ1=(precioZ1*iva)/100;
		totalZ2=(precioZ2*iva)/100;
		if (zona1==true) {
			return totalZ1;
		} else {
			return totalZ2;
		}
		
	}
	
	
	
	
	
	
	
	

}
