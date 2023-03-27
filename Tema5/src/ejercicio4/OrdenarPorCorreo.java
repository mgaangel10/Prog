package ejercicio4;

import java.util.Comparator;
/**
 * Esta clase no tiene atributos ni constructores 
 * Solo se utiliza para implementar la interfaz Comparator
 * @author Admin
 *
 */

public class OrdenarPorCorreo implements Comparator<Contacto> {

	/**
	 * es un metodo que se utiliza para ordenar
	 * @param dos contactos
	 * @return la lista de contactos ordenada
	 */

	@Override
	public int compare(Contacto o1,Contacto o2) {
		// TODO Auto-generated method stub
	return-(o1.getCorreo().toLowerCase().compareTo(o2.getCorreo().toLowerCase()));


	}
}
