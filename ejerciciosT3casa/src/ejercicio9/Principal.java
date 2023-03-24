package ejercicio9;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 double precioT=0.0,dinero=0.0,precioS=10,precioM=30,precioG=20,precioC=40,cambio=0.0;
		 int elec=0, elec2=0;
		 String nombre;
		 int personas=0,contra=1;
		 String destino = null;
		 
		 
		 
		System.out.println("bienvenido");
		System.out.println("dime su destino");
		destino=Leer.dato();
		System.out.println("indiquime el nombre del titular");
		nombre=Leer.dato();
		System.out.println("cuantas personas van");
		personas=Leer.datoInt();
		Ticket t1 = new Ticket ( personas,personas, precioS, precioM,precioG, precioC, destino,cambio);
		do {
			
			
		System.out.println("pulse 1---comprar billete");
		System.out.println("pulse 2--- para ver el cambio");
		System.out.println("pulse 3--- para ver el ticket");
		System.out.println("pulse 4--- operador");
		System.out.println("pulse 0 para salir ");
		elec=Leer.datoInt();
		switch (elec) {
		case 1:
			
			

			System.out.println("cuantos saltos deseas dar");
			System.out.println("1 salto -- sevilla");
			System.out.println("2 salto -- granada");
			System.out.println("3 salto -- malaga");
			System.out.println("4 salto -- cordoba");
			elec2=Leer.datoInt();
			switch (elec2) {
			case 1:
				System.out.println("has elegido sevilla");
				System.out.println("son "+t1.sumaPFS());
				
				do
				{
					System.out.println("ingrese su dinero");
					dinero=Leer.datoDouble();
					if (dinero<t1.sumaPFS()) {
						System.out.println("cantidad insuficiente");
					}
				}while(dinero<t1.sumaPFS());
				System.out.println("calculando....");
				
				break;
			case 2:
				System.out.println("has elegido garanada");
				System.out.println("son "+t1.sumaPFG());
				do
				{
					System.out.println("ingrese su dinero");
					dinero=Leer.datoDouble();
					if (dinero<t1.sumaPFG()) {
						System.out.println("cantidad insuficiente");
					}
				}while(dinero<t1.sumaPFG());
				System.out.println("calculando....");
				
				break;
			case 3:
				System.out.println("has elegido malaga");
				System.out.println("son "+t1.sumaPFM());
				do
				{
					System.out.println("ingrese su dinero");
					dinero=Leer.datoDouble();
					if (dinero<t1.sumaPFM()) {
						System.out.println("cantidad insuficiente");
					}
				}while(dinero<t1.sumaPFM());
				System.out.println("calculando....");
				
				break;
			case 4:
				System.out.println("has elegido cordoba");
				System.out.println("son "+t1.sumaPFC());
				do
				{
					System.out.println("ingrese su dinero");
					dinero=Leer.datoDouble();
					if (dinero<t1.sumaPFC()) {
						System.out.println("cantidad insuficiente");
					}
				}while(dinero<t1.sumaPFC());
				System.out.println("calculando....");
				
				break;
				
			default:
				break;
			}
			break;
		case 2:
			System.out.println("su cambio");
			switch (elec2) {
			case 1:
				t1.cambioS(dinero);
				System.out.println(t1.sumCa());
				
				break;
			case 2:
				t1.cambioG(dinero);
				System.out.println(t1.sumCa());
				break;
			case 3:
				t1.cambioM(dinero);
				System.out.println(t1.sumCa());
				break;
			case 4:
				t1.cambioC(dinero);
				System.out.println(t1.sumCa());
				break;
			default:
				break;
			}
			
			
			break;
		case 3:
			System.out.println("aqui su ticket");
			switch (elec2) {
			case 1:
				t1.ticketS(nombre, personas);
				break;
			case 2:
				t1.ticketG(nombre, personas);
				break;
			case 3:
				t1.ticketM(nombre, personas);
				break;
			case 4:
				t1.ticketC(nombre, personas);
				break;

			default:
				break;
			}
			break;
		case 4:
			System.out.println("contraseña");
			contra=Leer.datoInt();
			
			
					

		default:
			break;
		}
		}while(elec!=0);
		
		
		
		
		
	}

}
