package ejercicio4;

import java.util.Comparator;

public class OrdenarPorCorreo implements Comparator<Contacto> {

	/*@Override
	public int compare(Contacto o1, Contacto o2) {
		// TODO Auto-generated method stub
		if (o1.getId()<o2.getId()) {
			return -1;
		} else {
			if (o1.getId()>o2.getId()) {
				return 1;
			}
		}
		return 0;
	}*/

	
	

	@Override
	public int compare(Contacto o1,Contacto o2) {
		// TODO Auto-generated method stub
	return-(o1.getCorreo().toLowerCase().compareTo(o2.getCorreo().toLowerCase()));


	}
}
