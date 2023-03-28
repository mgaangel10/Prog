package ejercicio1;

import java.util.List;

public class Secretaria {
	
	private List<Alumno> list;

	public Secretaria(List<Alumno> list) {
		super();
		this.list = list;
	}
	
	public void mostrar() {
		list.stream()
		.forEach(System.out::println);
	}
	public void mostrarTodosAlumnosv2(String nombre) {
		System.out.println("los alumnos de "+nombre+"son");
	}
	public List<Alumno> buscarPorNombre(char inicial){
		return list.stream()
				.filter(x -> x.getNombre().toUpperCase().charAt(0)== inicial)
				.toList();
	}
	public long longitudLista() {
		return list.stream().count();
	}
	public void imprimirLongitud() {
		System.out.println("la longitud es:"+longitudLista());
	}
	
	public List<Alumno> obtenerAlumnos1dam(){
		return list.stream()
				.filter(x -> x.getNombreCurso().equalsIgnoreCase("1dam"))
				.filter(x -> x.getNotaMedia() > 9)
				.toList();
	}
	
	public List<Alumno> coger3Primeros(){
		return list.stream()
				.limit(3)
				.toList();
	}
	public void mostrar3Primeros() {
		System.out.println("los tres primeros alumnos son: ");
		obtenerAlumnos1dam().stream()
		.forEach(System.out::println);
	}
	public Alumno obtenerAlumnoMenorEdad() {
		return list.stream()
				.min((x,z) -> x.getEdad()<z.getEdad()?1:x.getEdad()>z.getEdad()?-1:0)
				.get();
	}
	public void mostraralumnoMenorEdad() {
		System.out.println("el alumno menor de edad es:");
		System.out.println(obtenerAlumnoMenorEdad());
	}
	public Alumno alunoPrimeroLista() {
		return list.stream()
				.findFirst()
				.get();
	}
	public void mostrarAlumnoPrimerolista() {
		System.out.println("el alumno primero de la lista es :");
		System.out.println(alunoPrimeroLista());
	}
	
	
	
	


	public List<Alumno> getList() {
		return list;
	}

	public void setList(List<Alumno> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Secretaria [list=" + list + "]";
	}
	
	

}
