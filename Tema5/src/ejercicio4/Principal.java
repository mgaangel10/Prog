package ejercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id=0;
		int numte=0;
		Contacto c3=new Contacto(3,"a","e@e.com");
		Contacto c4=new Contacto(4,"b","f@f.com");
		Contacto c2=new Contacto(2,"c","g@g.com");
		Contacto c1=new Contacto(1,"d","h@h.com");
		Map<Contacto,Integer> tree;
	
		//los map no se ordenan en verdad
		Map <Contacto,Integer> listado=new HashMap <Contacto,Integer>();
		//agregamos con coleccion
		listado.put(c1, 111111);
		listado.put(c2, 2222222);
		listado.put(c3, 333333);
		listado.put(c4, 444444);
		Agenda a = new Agenda(listado);
		System.out.println("agregar y mostrar");
		a.agregar(c4, 444444);
		a.mostrar();
		System.out.println(a.findById(2));
		System.out.println("ahora elimina ");
		
		a.eliminar(2);
		a.mostrar();
		System.out.println("ahora ordena alfabeticamenta ");
		 tree = new TreeMap<Contacto,Integer>();
		tree.putAll(listado);
		for (Contacto c : tree.keySet()) {
			System.out.println(c+""+tree.get(c));
		}
		System.out.println("ordena por correo");
		 tree = new TreeMap<Contacto,Integer>(new OrdenarPorCorreo());
		 tree.putAll(listado);
		 for (Contacto c : tree.keySet()){
			System.out.println(c+""+tree.get(c));
		}
		 System.out.println("dim el id pa bsucar");
		 id=Leer.datoInt();
		 System.out.println("diga el nuevo telefno");
		 numte=Leer.datoInt();
		 a.edit(a.findById(id), numte);
		 a.mostrar();
	}

}
