package ejemplocomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op,pos=0;
//		collecion de corredores
		List<Corredor> c = new ArrayList<Corredor>();
		
		c.add(new Corredor(4,1.43,"jesse"));
		c.add(new Corredor(3,1.29,"angel"));
		c.add(new Corredor(1,1.17,"pepe")); 
		c.add(new Corredor(7,1.33,"jose"));
		c.add(new Corredor(2,1.73,"carlos"));
		c.add(new Corredor(5,1.03,"pablo"));
		
		do {
			System.out.println("1--ordenar por nombre");
		System.out.println("2--ordernar por marca");
	
		op=Leer.datoInt();
		switch (op) {
		case 1:
			System.out.println("corredores ordenados alfabeticamente");
			Collections.sort(c, new CompararPorNombre());
			for (Corredor corredor : c) {
				System.out.println(corredor);
				
			}
			break;
		case 2:
			System.out.println("ordenados por marca");
			Collections.sort(c, new ComprobarPorMarca());
			for (Corredor corredor : c) {
				System.out.println(corredor);
				
			}
			break;
		case 3:
			
			break;

		default:
			System.out.println("esa opcion no existe");
			break;
		}
		} while (op!=0);
		System.out.println("gracias por usarlo");
		
		

	}

}
