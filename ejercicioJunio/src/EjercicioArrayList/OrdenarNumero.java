package EjercicioArrayList;

import java.util.Comparator;

public class OrdenarNumero implements Comparator<Jugador>{

	@Override
	public int compare(Jugador o1, Jugador o2) {
		// TODO Auto-generated method stub
		if (o1.getNumCamiseta()<o2.getNumCamiseta()) {
			return-1;
		} else {
			if (o1.getNumCamiseta()>o2.getNumCamiseta()) {
				return 1;
			}
		}
		return 0;
	}

}
