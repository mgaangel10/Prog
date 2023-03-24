package ejercicio3;

import java.util.Iterator;
import java.util.Set;
/**
 * <p>hola</p>
 * ssjsjsj<code> APP</code>
 * @author Admin
 *
 */

public class Aula {
	
	private String nombre;
	private Set <Alumno> lista;
	
	public Aula(String nombre, Set<Alumno> lista) {
		super();
		this.nombre = nombre;
		this.lista = lista;
	}
//	el hashcode lo vamos a creear tambien aqui pero para este ejemplo se debe xcrear en la pojco
//	mostrar todo
	public void mostrarTodo() {
		for (Alumno a : lista) {
			System.out.println(a);
		}
	}
	
//	otra forma de hacer un bucle con iterator
	public void mostrarTodoV2() {
		Iterator <Alumno> it = lista.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
	}
	
	public double calcularNotaMedia() {
		double suma=0.0;
		for(Alumno a:lista) {
			suma+=a.getNotaM();		
			}
		return suma/lista.size();
	}
	
	public int calcularSuspensos() {
		int susp=0;
		Iterator <Alumno> it = lista.iterator();
		while(it.hasNext()) {
			if(it.next().getNotaM()<5) {
				susp++;
			}
			
		}
		return susp;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Alumno> getLista() {
		return lista;
	}

	public void setLista(Set<Alumno> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Aula [nombre=" + nombre + ", lista=" + lista + "]";
	}
	
	
	
}
