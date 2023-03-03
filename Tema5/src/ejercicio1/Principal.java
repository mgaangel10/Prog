package ejercicio1;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Nota n;
		int op = 0, opN=0,nNota=0;
		String contenido,propietario;
		
		List <Nota> listaNotas = new ArrayList <Nota>();
		
		do {
			System.out.println("------MENU------");
			System.out.println("1--mostrar notas");
			System.out.println("2--ver cantidad de notas");
			System.out.println("3--agregar notas");
			System.out.println("4--borrar notas");
			op=Leer.datoInt();
			switch (op) {
			case 1:
				System.out.println(listaNotas);
				System.out.println("cual desea mostrar");
				opN=Leer.datoInt();
				System.out.println(listaNotas.get(opN-1));
				break;
			case 2:
				System.out.println("el numero de notas guaradada son: "+listaNotas.size());
				
				
				break;
			case 3:
				System.out.println("indique el propietario");
				propietario=Leer.dato();
				System.out.println("diga el contenido");
				contenido=Leer.dato();
				n=new Nota(propietario,contenido,nNota);
				listaNotas.add(n);
				nNota ++;
				
				break;
			case 4:
				//este se utiliza mucho
				//el empty es para saber si esta vacia o no 
				if (!listaNotas.isEmpty()) {
					System.out.println(listaNotas);
					System.out.println("cual deseas borrrar");
					opN=Leer.datoInt();
					listaNotas.remove(opN-1);
					System.out.println("nota borrada correctamente");
				} else {
					System.out.println("la lista esta vacia");
				}
				
				break;

			default:
				System.out.println("esa opcion no existe");
				break;
			}
		} while (op!=0);
		System.out.println("gracias por usar el progarama");
		

	}

}
