package ejercicio2;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu ,numSocio,num =1;
		String nombre , apellido;
		double dinero;
		List <Socio> listaSocio=new ArrayList <Socio>();
		Crud crud = new Crud (listaSocio);
		GestionClub clb = new GestionClub("La riberrilla",crud,10000);
		
		do {
			System.out.println("1--añadir");
			System.out.println("2--borra");
			menu=Leer.datoInt();
			switch (menu) {
			case 1:
				System.out.println("nombre");
				nombre=Leer.dato();
				System.out.println("aplleido");
				apellido=Leer.dato();
				break;
			case 2:
				System.out.println("diga un numero para  borrar");
				num=Leer.datoInt();
				clb.getCrud().eliminar(clb.getCrud().findBynum(num));
				break;

			default:
				break;
			}
		} while (menu!=0);

	}

}
