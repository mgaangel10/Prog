package ejercicio1;

import java.util.Arrays;

public class Alquiler {
	
	private Vehiculo vehiculo [];
	private int numDia;
	private String nombre;
	private String dni;

	
	
	
	public Alquiler(Vehiculo[] vehiculo, int numDia, String nombre, String dni) {
		super();
		this.vehiculo = vehiculo;
		this.numDia = numDia;
		this.nombre = nombre;
		this.dni = dni;
	}

	public double precioDeUno(Vehiculo v) {
		return v.cacularPrecio();
	}


	public double calcularvehiculo() {
		double total=0.0;
		for (int i = 0; i < vehiculo.length &&vehiculo[i]!=null; i++) {
			total=total+vehiculo[i].cacularPrecio();
			
		}
		
		
		
		return total; 
	}
	public void mostrarDatos () {
		Vehiculo v= null;
		Batmovil b = null;
		
		for (int i = 0; i < vehiculo.length; i++) {
			if (v instanceof Batmovil){
				System.out.println(b.toString());
			}else {
				//System.out.println(p.toString());
			}
		}
	}




	public Vehiculo[] getVehiculo() {
		return vehiculo;
	}




	public void setVehiculo(Vehiculo[] vehiculo) {
		this.vehiculo = vehiculo;
	}




	public int getNumDia() {
		return numDia;
	}




	public void setNumDia(int numDia) {
		this.numDia = numDia;
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public String getDni() {
		return dni;
	}




	public void setDni(String dni) {
		this.dni = dni;
	}




	@Override
	public String toString() {
		return "Alquiler [vehiculo=" + Arrays.toString(vehiculo) + ", numDia=" + numDia + ", nombre=" + nombre
				+ ", dni=" + dni + "]";
	}
	
	
	

		
	

}
