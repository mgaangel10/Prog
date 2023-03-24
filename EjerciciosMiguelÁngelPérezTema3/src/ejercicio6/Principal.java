package ejercicio6;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int hasta=20,desde=1,res=1,num13=0;
		int eleccion=0;
		Moneda m2=new Moneda();
		
		Moneda m1=new Moneda();
		
		System.out.println("Bienvenido vamos a jugar a cara o cruz");
		do {
		System.out.println("pulsa 1--------para cara\n"
				+ "pulse 2--------para cruz");
		eleccion=Leer.datoInt();
		switch (eleccion) {
		case 1:
			System.out.println("Has elegido cara");
			num13=m1.aleatorio(hasta, desde);
			m1.imprimir(num13);
			m1.ganador(num13);
			num13=num13%2;
			if(num13==0) {
				System.out.println("Si deseas seguir jugando pulse 1 si deseas salir pulse 0");
			res=Leer.datoInt();
			}
			
			break;
		case 2:
			System.out.println("Has elegido cruz");
			num13=m2.aleatorio(hasta, desde);
			m2.imprimir(num13);
			m2.ganadorCruz(num13);
			num13=num13%2;
			if(num13!=0) {
				System.out.println("Si deseas seguir jugando pulse 1 si deseas salir pulse 0");
			res=Leer.datoInt();
			}
			break;
			

		
		default:
			break;
		
		}
		}while(num13!=0||res==1);
		
		
		
		
		
		
		
		

	}

}
