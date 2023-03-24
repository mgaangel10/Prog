package ejemplo1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Alumno alum1=new Alumno("Angel",19,7.5,true);  
		Alumno alum2=new Alumno("Anl",45,10);
		System.out.println("alum1 "+alum1.nombre+" la edad "+alum1.datenacimiento+" nota media "+alum1.notaMedia+" repetidor "+alum1.repetidor);
		System.out.println("alum2 "+alum2.nombre +" la edad "+alum2.datenacimiento+" nota media "+alum2.notaMedia);

	}

}
