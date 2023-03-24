package ejercicio5;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0, hasta=0,desde=0,num13=0,num=0,res=0,elecion=0,comp=1;
		do {
		System.out.println("Bienvenido a seccion de juegos \n"
				+ "pulse 1--------------para la quiniela\n"
				+ "pulse 2--------------para pares y nones\n"
				+ "pulse 3--------------para los chinos\n"
				+ "pulse 4--------------para la primitiva");
		elecion=Leer.datoInt();
		switch (elecion) {
		case 1:
			System.out.println("estas jugando a la quiniela");
			Generadora g1=new Generadora();
			num1=g1.quiniela(num1);
			System.out.println("resultado quiniela "+num1);
			System.out.println("si deseas salir pulse 0 si deseas volver al menu pulse 0");
			comp=Leer.datoInt();
			break;
		case 2:
			System.out.println("estas jugando a pares y nones ");
			System.out.println("diga el menor");
			desde=Leer.datoInt();
			System.out.println("diga el mayor");
			hasta=Leer.datoInt();
			Generadora g2=new Generadora();
			num13=g2.paresNones( hasta, desde);
			System.out.println(num13);
			g2.comprob(num13);
			System.out.println("si deseas salir pulse 0 si deseas volver al menu pulse 0");
			comp=Leer.datoInt();
			break;
		case 3:
			System.out.println("estas jugando a los chinos");
			Generadora g3=new Generadora();
			num=g3.chinos();
			System.out.println("El reasultado del juego de los chinos es "+num);
			System.out.println("si deseas salir pulse 0 si deseas volver al menu pulse 0");
			comp=Leer.datoInt();
			break;
		case 4:
			System.out.println("etsas jugando a la primitiva");
			Generadora g4=new Generadora();
			res=g4.primitiva();
			System.out.println("el resultado de la primiriva es "+res);
			System.out.println("si deseas salir pulse 0 si deseas volver al menu pulse 0");
			comp=Leer.datoInt();
			break;

		default:
			break;
		}
		}while(comp==1);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
