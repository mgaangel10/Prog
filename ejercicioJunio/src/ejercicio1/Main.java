package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op=0;
		int op1=0;
		String nombre = null;
		String dni = null;
		int numDia=0;
		String matricula;
		double tamaño=0.0;
		
		int fecha=0;
		double caballos;
		int numRueda=0;
		Vehiculo [] ve;
		ve= new Vehiculo[6];
		
		Alquiler a = new Alquiler(ve,5,"angel","36382C");
		Scanner scan = new Scanner(System.in);
		 ve[0]=new Batmovil("7826B",2,16,4);
		 ve[1]=new PatinVolador("5735C",3,5,300);
		 do {
		 System.out.println("MENU");
		 System.out.println("que deseas comprar");
		 System.out.println("1--Batmovil");
		 System.out.println("2--Patin volador");
		 System.out.println("3--Suma de alquileres");
		 System.out.println("4--nuevo");
		 System.out.println("5--mostrar Datos");
		 
		  op = scan.nextInt();
		 switch (op) {
		case 1:
			System.out.println("Su precio del alquiler es de:");
			System.out.println(ve[0].cacularPrecio());
			System.out.println();
			break;
		case 2:
			System.out.println("Su precio del alquiler es de:");
			System.out.println(ve[1].cacularPrecio());
			
			break;
		case 3:
			
			System.out.println("suma de todos los alquileres");
			System.out.println(a.calcularvehiculo());
			break;
		case 4:
			System.out.println("para crear un nuevo coche necesitas:");
			
			System.out.println("tamaño");
			tamaño=scan.nextDouble();
			System.out.println("fecha");
			fecha=scan.nextInt();
			System.out.println("que tipo de coche es:");
			System.out.println("Batmovil");
			System.out.println("patin volador");
			op1=scan.nextInt();
			switch (op1) {
			case 1:
				System.out.println("numero de puertas");
				numRueda=scan.nextInt();
				ve[2]= new Batmovil("236473M",tamaño,fecha,numRueda);
				break;
			case 2:
				System.out.println("caballos");
				caballos=scan.nextDouble();
				ve[3]= new PatinVolador("48269G",tamaño,fecha,caballos);
				break;

			default:
				break;
			}
			break;
		case 5:
			a.mostrarDatos();
			break;

		default:
			break;
		}
		 }while(op!=0);
	
		
		
		
		
		

	}

}
