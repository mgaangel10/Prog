package ticket;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre, tarjeta, efectivo, BIZUM;
		double precioFinal=0,precioNino=5,precioJoven=5,precioAdulto= 5,precio3raEdad=5,descuento=15,cantDinero=0,cambio=0;
		int op2=0,numPersonas=2,op3=1,tam=4,hasta=9,desde=1;	
		int[]aleatorio=new int [tam];
		Random num= new Random (System.nanoTime());
		System.out.println("Dime su nombre porfavor");
		nombre=Leer.dato();
		do {
		System.out.println(nombre+" ¿Cómo prefieres pagar?\n"
				+ "Pulse 1-------- para pagar con tarjeta\n"
				+ "Pulse 2-------- para pagar en efectivo\n"
				+ "Pulse 3-------- para pagar por BIZUM");
		op2=Leer.datoInt();
		switch (op2) {
		case 1:
			System.out.println("¿tienes el canet de estudiante?\n"
					+ "pulse 1 para SI \npulse 0 para NO");
			op3=Leer.datoInt();
			if (op3==1) {
				System.out.println("Al ser estudiante y poseer el carnet de estudiante \n"
						+ "se le descontara al precio final de un "+descuento+"%");
				precioFinal=precioNino*numPersonas;
				precioFinal=precioJoven*numPersonas;
				precioFinal=precioAdulto*numPersonas;
				precioFinal=precio3raEdad*numPersonas;
				for (int i = 0; i < aleatorio.length; i++) {
					aleatorio[i]=num.nextInt(hasta-desde+1)+desde;
				}
				
				System.out.println("");
				descuento=(precioFinal*descuento)/100;
				precioFinal=precioFinal-descuento;
				
				System.out.println(" ");
				System.out.printf("--------------------------------\n"
						+ "      TICKET DE SU COMPRA          \n"
						+ "--------------------------------\n"
						+ "sala:   -----Precio Final:%.2f\n",precioFinal);
				System.out.print("pagado con tarjeta con el numero:*****");
				for (int i = 0; i < aleatorio.length; i++) {
					System.out.print(+aleatorio[i]);
				}
				System.out.println(" ");
				System.out.print("El dia : 21/11/2022");
				
				
				
			}else {
				precioFinal=precioNino*numPersonas;
				precioFinal=precioJoven*numPersonas;
				precioFinal=precioAdulto*numPersonas;
				precioFinal=precio3raEdad*numPersonas;
				for (int i = 0; i < aleatorio.length; i++) {
					aleatorio[i]=num.nextInt(hasta-desde+1)+desde;
				}
				System.out.println(" ");
				System.out.printf("--------------------------------\n"
						+ "      TICKET DE SU COMPRA          \n"
						+ "--------------------------------\n"
						+ "sala:   -----Precio Final:%.2f\n",precioFinal);
				System.out.print("pagado con tarjeta con el numero:*****");
				for (int i = 0; i < aleatorio.length; i++) {
					System.out.print(+aleatorio[i]);
					
				}
				System.out.println(" ");
				System.out.print("El dia : 21/11/2022");
			}
			
			
			break;
		case 2:
			System.out.println("¿tienes el canet de estudiante?\n"
					+ "pulse 1 para SI \npulse 0 para NO");
			op3=Leer.datoInt();
			if (op3==1) {
				System.out.println("Al ser estudiante y poseer el carnet de estudiante \n"
						+ "se le descontara al precio final de un 15%");
				precioFinal=precioNino*numPersonas;
				precioFinal=precioJoven*numPersonas;
				precioFinal=precioAdulto*numPersonas;
				precioFinal=precio3raEdad*numPersonas;
				
				System.out.println("");
				descuento=(precioFinal*descuento)/100;
				precioFinal=precioFinal-descuento;
				System.out.printf("El precio final es:%.2f ",precioFinal);
				do {
				System.out.println("¿con cuanto dinero piensas pagar?");
				cantDinero=Leer.datoDouble();
				if (cantDinero<precioFinal) {
					System.out.println("Dinero insuficiente");
					
				}
				
				}while(cantDinero<precioFinal);
				cambio=cantDinero-precioFinal;
				
				System.out.println(" ");
				
				System.out.printf("--------------------------------\n"
						+ "      TICKET DE SU COMPRA          \n"
						+ "--------------------------------\n"
						+ "sala:   -----Precio Final:%.2f€ \n",precioFinal);
				System.out.printf("-------------------cambio:%.2f€ ",cambio);
				System.out.println(" ");
				System.out.print("El dia : 21/11/2022");
				
				
				
			}else {
				precioFinal=precioNino*numPersonas;
				precioFinal=precioJoven*numPersonas;
				precioFinal=precioAdulto*numPersonas;
				precioFinal=precio3raEdad*numPersonas;
				System.out.printf("El precio final es:%.2f ",precioFinal);
				do {
					System.out.println("¿con cuanto dinero piensas pagar?");
					cantDinero=Leer.datoDouble();
					if (cantDinero<precioFinal) {
						System.out.println("Dinero insuficiente");
						
					}
					
					}while(cantDinero<precioFinal);
					cambio=cantDinero-precioFinal;
					
					System.out.println(" ");
					
					System.out.printf("--------------------------------\n"
							+ "      TICKET DE SU COMPRA          \n"
							+ "--------------------------------\n"
							+ "sala:   -----Precio Final:%.2f€ \n",precioFinal);
					System.out.printf("-------------------cambio:%.2f€ ",cambio);
					System.out.println(" ");
					System.out.print("El dia : 21/11/2022");
			}
			break;
		case 3:
			System.out.println("¿tienes el canet de estudiante?\n"
					+ "pulse 1 para SI \npulse 0 para NO");
			op3=Leer.datoInt();
			if (op3==1) {
				System.out.println("Al ser estudiante y poseer el carnet de estudiante \n"
						+ "se le descontara al precio final de un 15%");
				precioFinal=precioNino*numPersonas;
				precioFinal=precioJoven*numPersonas;
				precioFinal=precioAdulto*numPersonas;
				precioFinal=precio3raEdad*numPersonas;
				for (int i = 0; i < aleatorio.length; i++) {
					aleatorio[i]=num.nextInt(hasta-desde+1)+desde;
				}
				System.out.println("");
				descuento=(precioFinal*descuento)/100;
				precioFinal=precioFinal-descuento;
				System.out.println(" ");
				System.out.printf("--------------------------------\n"
						+ "      TICKET DE SU COMPRA          \n"
						+ "--------------------------------\n"
						+ "sala:   -----Precio Final:%.2f\n",precioFinal);
				System.out.print("pagado por vizum:*****");
				for (int i = 0; i < aleatorio.length; i++) {
					System.out.print(+aleatorio[i]);
					
				}
				System.out.println(" ");
				System.out.print("El dia : 21/11/2022");
			}else {
				precioFinal=precioNino*numPersonas;
				precioFinal=precioJoven*numPersonas;
			  	precioFinal=precioAdulto*numPersonas;
				precioFinal=precio3raEdad*numPersonas;
				for (int i = 0; i < aleatorio.length; i++) {
					aleatorio[i]=num.nextInt(hasta-desde+1)+desde;
				}
				System.out.println(" ");
				System.out.printf("--------------------------------\n"
						+ "      TICKET DE SU COMPRA          \n"
						+ "--------------------------------\n"
						+ "sala:   -----Precio Final:%.2f\n",precioFinal);
				System.out.print("pagado por vizum:*****");
				for (int i = 0; i < aleatorio.length; i++) {
					System.out.print(+aleatorio[i]);
					
				}
				System.out.println(" ");
				System.out.print("El dia : 21/11/2022");
			}
			break;

		default:System.out.println("Esa opción no existe");
			break;
		}
		}while(op2>3);
		
	}

}
