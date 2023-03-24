package ejerciciorepaso;

import java.util.Comparator;

public class OrdenarSaldo implements Comparator<Cliente>{

	@Override
	public int compare(Cliente o1, Cliente o2) {
		// TODO Auto-generated method stub
		if (o1.getSaldo()<o2.getSaldo()) {
			return -1;
		} else {
			if (o1.getSaldo()>o2.getSaldo()) {
				return 1;
			}
		}
		return 0;
	}
	

}
