package ejercicio4;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
/**
 * Esta clase se utiliza para gestionar todos los Contactos
 * Como atributos tenemos un map como clave Contacto y valor un Integer
 * @author Admin
 *
 */

public class Agenda implements Comparator<Contacto>{

	private Map<Contacto,Integer> listado;

public Agenda(Map<Contacto, Integer> listado) {
	super();
	this.listado = listado;
}
/**
 * agrega un contacto
 * @param contacto 
 * @param Integer
 * @param no devuelve nada
 *
 */
public void agregar(Contacto c,Integer num) {
	listado.put(c, num);
}

/**
 * muestra todos los contactos
 * @param no hay parametro
 * @return devuelve todos los contactos
 */

public void mostrar() {
	for (Contacto c: listado.keySet() ) {
		System.out.println(c+", número de teléfono: "+listado.get(c));
		
	}
}
/**
 * busqueda de un Contacto
 * @param id
 * @return devuelve un Contacto 
 */

public Contacto findById(int id) {
	boolean encontrado;	
	Contacto c;
	Iterator <Contacto> it = listado.keySet().iterator();
	while (it.hasNext()) {
		c=it.next();
		if (c.getId()==id) {
			return c;
		}
		
	}
	return null;
}

public void eliminar(int id) {
	listado.remove(findById(id));
}
public Map<Contacto, Integer> getListado() {
	return listado;
}

public void setListado(Map<Contacto, Integer> listado) {
	this.listado = listado;
}

@Override
public String toString() {
	return "Agenda [listado=" + listado + "]";
}

@Override
public int compare(Contacto o1, Contacto o2) {
	// TODO Auto-generated method stub
	String correo1=o1.getCorreo();
	String correo2=o2.getCorreo();
	return -(correo1.toLowerCase().compareTo(correo2.toLowerCase()));
}
public void edit(Contacto c,int numte) {
	listado.replace(c,numte);
	}

 
	
	

}
