package ejercicio3;

import java.util.HashSet;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Alumno a1=new Alumno ("angel","perez",19,8,"423a");
		Alumno a2=new Alumno ("pepe","marin",14,7,"153m");
		Alumno a3=new Alumno ("carlos","setz",17,5,"623x");
		Alumno a4=new Alumno ("jaime","var",18,3,"127b");

		Set <Alumno> lista = new HashSet<Alumno>();
		
		lista.add(a1);
		lista.add(a2);
		lista.add(a3);
		lista.add(a4);
		
		Aula a=new Aula("1ºDAM",lista);
//		llamadas a metodos
		a.mostrarTodo();
		a.mostrarTodoV2();
		//ver nota media
		System.out.println(a.calcularNotaMedia());
		
	}

}
