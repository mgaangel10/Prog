package ejercicio4_ticket;

import java.util.HashMap;
import java.util.Map;

import ejercicio4.Contacto;
import utilidades.Leer;



public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op=0;
		double precioNuevo=0.0;
		double porcentajeIva=0.0;
		double porcentaje=0.0;
		
		Ticket t = null;
		
		Map <Integer,LineaVenta> listado=new HashMap <Integer,LineaVenta>();
		int masuno=1;
		Integer idMap = masuno;
		listado.put(idMap, new LineaVenta(new Ropa(100,"nike",1,true,5),2));
		idMap++;
		listado.put(idMap, new LineaVenta(new Ropa(200,"kike",2,false,4),1));
		idMap++;
		listado.put(idMap, new LineaVenta(new Alimentacion(300,"adidas",3,5,1),3));
		idMap++;
	
		
		
		t=new Ticket(listado);
		do {
			System.out.println("menu");
		System.out.println("1--mostrar");
		System.out.println("2--mostrar el importe total");
		System.out.println("3--agregar");
		System.out.println("4--editar precio");
		System.out.println("5--eliminar");
		op=Leer.datoInt();
		switch (op) {
		case 1:
			t.mostrar();
			break;
		case 2:
			System.out.println(t.calacularImporteTotal(porcentajeIva, porcentaje));
			
			break;
		case 3:
			System.out.println("nose");
			break;
		case 4:
			System.out.println("eliga");
			t.mostrar();
			idMap=Leer.datoInt();
			System.out.println("precio nuevo");
			precioNuevo=Leer.datoDouble();
			t.editPrecioUni(precioNuevo, idMap);
			
			break;
		case 5:
			System.out.println("id ");
			idMap=Leer.datoInt();
			t.eliminar(idMap);
			 break;
			
		default:
			break;
		}
		} while (op!=0);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
