package ejercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import utilidades.Leer;
/**
 * 
 * @author Admin
 *
 */
public class Principal {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id=0;
		int numte=0;
		int op=0;
		int num=1;
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
		do {
			System.out.println("1--Agregar");
			System.out.println("2--Mostrar");
			System.out.println("3--Eliminar");
			System.out.println("4--Ordenar alfabeticamente");
			System.out.println("5--Ordenar por correo");
			System.out.println("6--Editar número de teléfono");
			op=Leer.datoInt();
			switch (op) {
			case 1:
				System.out.println("Agregando contactos aletorios...");
				a.agregar(c1, 111111);
				a.agregar(c2, 222222);
				a.agregar(c3, 333333);
				a.agregar(c4, 444444);
				for(int i=0;i<num;i++) {
					System.out.println("1");
					System.out.println("2");
					System.out.println("3");
				}
				break;
			case 2:
				a.mostrar();
				break;
			case 3:
				System.out.println("Dime el id del contacto para eliminar");
				id=Leer.datoInt();
				a.eliminar(id);
				break;
			case 4:
				tree = new TreeMap<Contacto,Integer>();
				tree.putAll(listado);
				for (Contacto c : tree.keySet()) {
					System.out.println(c+""+tree.get(c));
				}
				break;
			case 5:
				tree = new TreeMap<Contacto,Integer>(new OrdenarPorCorreo());
				tree.putAll(listado);
				for (Contacto c : tree.keySet()){
					System.out.println(c+""+tree.get(c));
					}
				break;
			case 6:
				 System.out.println("Dime el id pa buscar");
				 id=Leer.datoInt();
				 System.out.println("Diga el nuevo número teléfono");
				 numte=Leer.datoInt();
				 a.edit(a.findById(id), numte);
				 a.mostrar();
				break;

			default:
				System.out.println("Esa opción no existe");
				break;
			}
			
		} while (op!=0);
			System.out.println("Gracias por usar el programa");
		 
		
	}
	

}
