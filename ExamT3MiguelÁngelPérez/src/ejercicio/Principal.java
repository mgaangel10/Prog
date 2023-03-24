package ejercicio;

import java.util.Iterator;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sabor;
		double precioLitro = 0.0, suma = 0.0, media = 0.0;
		double volumen = 0.0, precioFab = 0.0, ganancias = 0.0, pv = 0.0;
		boolean extraNormal = false;
		int tam = 7, dia = 1, numDia = 0;
		int[] cantidad = new int[tam];
		int[] nuevoV = new int[dia];
		int eleccion = 0;
		int compBoolean = 0, hasta = 0, desde = 0;
		Pasteleria p1 = new Pasteleria();

		System.out.println("Bienvenido al programa");
		System.out.println("¿De qué sabor es la tarta?");
		sabor = Leer.dato();
		System.out.println("¿Cúanto le cuesta el litro de masa?");
		precioLitro = Leer.datoDouble();
		System.out.println("¿Cúantos litros de masa gastas al hacer una tarta?");
		volumen = Leer.datoDouble();
		System.out.println("Esta tarta es tipo extra o normal");
		System.out.println("1:si, 2:no");
		compBoolean = Leer.datoInt();
		extraNormal = p1.comprobarExtra(compBoolean);
		System.out.println("Indíqueme la cantidad de tartas que se hace en una semana");
		System.out.println("desde");
		desde = Leer.datoInt();
		System.out.println("hasta");
		hasta = Leer.datoInt();
		p1 = new Pasteleria(sabor, precioLitro, volumen, extraNormal, cantidad);

		do {

			System.out.println("------------------------------------");
			System.out.println("Puedes elegir una de estas opciones\n"
					+ "pulse 1-----------para saber cuantas tartas se fabrican al dia\n"
					+ "pulse 2-----------para calacular el precio de fabricacion\n"
					+ "pulse 3-----------para calcular el precio de venta\n" + "pulse 4-----------para tarta extra\n"
					+ "pulse 5-----------para ver el total de tartas hechas en una semana\n"
					+ "pulse 6-----------para mostrar la media de tartas hechas en una semana\n"
					+ "pulse 7-----------para ver la media de las tartas"
					+ "pulse 8-----------para ver toda la información");
			eleccion = Leer.datoInt();
			switch (eleccion) {
			case 1:
				p1.generarAleatorio(hasta, desde);
				p1.imprimirAleatorio();
				break;
			case 2:
				System.out.println("El precio de fabricacion es de :");
				precioFab = p1.calcularPF(volumen, precioLitro);
				System.out.printf("%.2f", precioFab, "€");
				System.out.println(" ");
				break;
			case 3:
				System.out.println("Digame el porcenatje ganacias que deseas obterner");
				ganancias = Leer.datoDouble();
				pv = p1.calcularPv(ganancias, precioFab);
				System.out.printf("El precio venta al publico es de:%.2f ", pv, "€");
				System.out.println(" ");
				break;
			case 4:
				p1.imprimirBool(pv);
				break;
			case 5:
				suma = p1.totalTarta();
				System.out.printf("La suma total de tartas hechas en una semana son de: %.2f", suma, "€");
				System.out.println(" ");
				break;
			case 6:
				System.out.println("¿Qué dia deseas cambiar?");
				numDia = Leer.datoInt();

				for (int i = 0; i < nuevoV.length; i++) {
					System.out.println("Indique el nuevo valor");
					cantidad[numDia - 1] = Leer.datoInt();
				}

				
				for (int i = 0; i < cantidad.length; i++) {
					System.out.println(cantidad[i]);
				}

				break;
			case 7:
				media = p1.mediaTartas(suma);
				System.out.printf("La media de tartas hechas en una semana es de: %.2f", media, "€");
				System.out.println(" ");
				break;
			case 8:
				System.out.println(p1);
				break;
			default:
				System.out.println("Esa opcción no existe");
				break;
			}
		} while (eleccion != 0);
		System.out.println("Gracias por usar este programa");

	}

}
