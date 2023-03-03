package ejercicio5;

import java.util.Comparator;



public class OrdenNatural implements Comparator <DatosPersonal> {
	
	public int compare(DatosPersonal d,DatosPersonal d1) {
		
		if ( d.getEdad() < d1.getEdad()) {
			return -1;
		} else {
			if (d.getEdad() > d1.getEdad()) {
				return 1;
			}
			return 0;
		}
	}

	

}
