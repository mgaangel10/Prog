package registrarse;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pin=0, opcion=0,cero=0, cuatro=4;
		String nombre;
		
		System.out.println("Hola bienvenido \n"
				+ "Pulse 1------------para inciar sesion\n"
				+ "Pulse 2------------para regristrate ");
		opcion=Leer.datoInt();
		
		switch (opcion) {
		case 1:
			if (pin==cero) {
				System.out.println("Lo sentimos el pin con coincide con ninguno de los resultados");
			}
			
			break;
		case 2:
			
			System.out.println("Hola registrate como nuevo usuario en Cines Callao");
			System.out.println("Indiqueme su nombre porfavor");
			nombre=Leer.dato();
			do {
			System.out.println("Indique su codigo de 4 numeros");
			pin=Leer.datoInt();
			if (pin<4||pin>4) {
				System.out.println("El pin debe de tener 4 numeros , intentalo de nuevo");
				
			}else {
				System.out.println("Bienvenido "+nombre);
			}
			System.out.println("");
			}while(opcion!=0);
			break;

		default:
			break;
		}
		

	}

}
