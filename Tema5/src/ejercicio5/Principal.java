package ejercicio5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <DatosPersonal> d = new ArrayList <DatosPersonal>();
		d.add(new DatosPersonal("c","pepe",39));
		 d.add(new DatosPersonal("e","garfia",10));
		  d.add(new DatosPersonal("a","perez",19));
		 d.add(new DatosPersonal("d","pablo",9)); 
		 d.add(new DatosPersonal("b","joseca",22));
		 
		 for (DatosPersonal da : d) {
			System.out.println(da);
		}
		 
		 System.out.println("ordenados alfabeticamente");
		Collections.sort(d);
		 for (DatosPersonal datos : d) {
			System.out.println(datos);
		}
		 System.out.println("ordenar por edad");
		 Collections.sort(d, new OrdenNatural());
		 for (DatosPersonal datos : d) {
			System.out.println(datos);
		}

	}

}
