package ejemplo1;

public class Alumno {
	String nombre;
	int datenacimiento;
	double notaMedia;
	boolean repetidor; 
	//constructores
	public Alumno(String nombre,int datenacimiento, double notaMedia, boolean repetidor ) {
		this.nombre=nombre;
		this.datenacimiento=datenacimiento;
		this.notaMedia=notaMedia;
		this.repetidor=repetidor;
		
	}
	public Alumno(String nombre,int datenacimiento, double notaMedia) {
		this.nombre=nombre;
		this.datenacimiento=datenacimiento;
		this.notaMedia=notaMedia;
	}

}
