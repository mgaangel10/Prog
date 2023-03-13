package ejemploentorno;

public class Profesor extends Trabajador{
	private int numAsignatura;
	private boolean tutor;
	
	
	
	public Profesor(String nombre, String apellidos, double sueldo, String dni, int edad, int numAsignatura,
			boolean tutor) {
		super(nombre, apellidos, sueldo, dni, edad);
		this.numAsignatura = numAsignatura;
		this.tutor = tutor;
	}
	
	public int getNumAsignatura() {
		return numAsignatura;
	}
	public void setNumAsignatura(int numAsignatura) {
		this.numAsignatura = numAsignatura;
	}
	public boolean isTutor() {
		return tutor;
	}
	public void setTutor(boolean tutor) {
		this.tutor = tutor;
	}
	
	@Override
	public String toString() {
		return super.toString()+"Profesor [numAsignatura=" + numAsignatura + ", tutor=" + tutor + "]";
	}
	@Override
	public double calcularSueldo() {
		// TODO Auto-generated method stub
		return super.getSueldo()*numAsignatura;
	}
	

	
	
	
	
	
	

}
