package ejercicio5;

public  class Empleado {
	
	private String nombre;
	private String aplleido;
	private double sueldoBase;
	private int numEmp;
	
	public Empleado(String nombre, String aplleido, double sueldoBase, int numEmp) {
		super();
		this.nombre = nombre;
		this.aplleido = aplleido;
		this.sueldoBase = sueldoBase;
		this.numEmp = numEmp;
	}
	
	public  double calcularSueldo() {
	return getSueldoBase();	
	}
	
	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAplleido() {
		return aplleido;
	}

	public void setAplleido(String aplleido) {
		this.aplleido = aplleido;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public int getNumEmp() {
		return numEmp;
	}

	public void setNumEmp(int numEmp) {
		this.numEmp = numEmp;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", aplleido=" + aplleido + ", sueldoBase=" + sueldoBase + ", numEmp="
				+ numEmp + "]";
	}
	
	
	
	
	
	

}
