package ejercicio2L2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double precio=60.0,precioEx=8.0;
		String nombre;
		int dias=0,posicion=0,elec=0,elecM=0,elecE=0,cantidad=5;
		boolean extra=false;
		Habitacion [] lista;
		lista=new Habitacion [cantidad];
		Hotel h1=new Hotel(lista);
		do {
		System.out.println("1---listar habitaciones");
		System.out.println("2---añadir habitaciones");
		System.out.println("3-- si ha elegido extra");
		elec=Leer.datoInt();
		switch (elec) {
		case 1:
			h1.imprimirTodo();
			break;
		case 2:
			System.out.println("nombre");
			nombre=Leer.dato();
			System.out.println("numerod de dias");
			dias=Leer.datoInt();
			System.out.println("quires servicios extras ");
			System.out.println("1=si,0=no");
			elecE=Leer.datoInt();
			h1.add(new Habitacion (precio,extra,nombre,dias),posicion);
			posicion++;
		case 3:
			System.out.println("has elegido ");
			if (elecE==1) {
				System.out.println("ha elegido servicios extras");
			} else {
				System.out.println("no ha elegido servicios extras");
			}
		default:
			break;
		}
		
		
		}while(elec!=0);
		
		
	}

}
