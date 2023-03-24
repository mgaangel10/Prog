package ejercicio7;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre="angel";
		double saldo=0.0,ingresar=0.0,retirada=0.0,res=0.0;
		int elecion=0;
		boolean comp;
		Cajero c1=new Cajero (saldo,nombre);
		System.out.println("Bienvenido al cajero\n"
				+ "diga su nombre");
		nombre=Leer.dato();
		do {
			System.out.println("Pulse 0 si deseas salir del programa");
		System.out.println("Hola de nuevo "+nombre+", puedes elegir estas opciones\n"
				+ "-------------------------------------------------\n"
				+ "pulse 1----------para ingresar el saldo\n"
				+ "pulse 2----------para retrirar saldo\n"
				+ "pulse 3----------para calcular su saldo en dolares americanos\n"
				+ "pulse 4----------para consultar saldo\n");
		elecion=Leer.datoInt();
		switch (elecion) {
		case 1:
			
			System.out.println("Indique la cantidad que deseas introcucir");
			ingresar=Leer.datoDouble();
			c1.ingresarSaldo(ingresar);
			System.out.println(c1.getSaldo());
			System.out.println("Saldo actualizado");
			
			break;
		case 2:
			do {
			System.out.println("Indique la cantidad que deseas retirar");
			retirada=Leer.datoDouble();
			}while(ingresar<retirada);
			c1.retirarSaldo(c1.comprobrarSaldo(retirada));
			
			
			break;
		case 3:
			System.out.println("su saldo total en dolares americanos son de ");
			res=c1.dolarAmericano();
			System.out.println(res);
			break;
		case 4:
			System.out.println("el saldo actual es: ");
			c1.verSaldo(ingresar);
			System.out.println(c1.getSaldo());
			break;
		default:
			System.out.println("Esa opción no existe");
			

		
		}
		}while(elecion!=0);
		
		System.out.println("Has salido del programa,gracias por usarlo "+nombre);
		
		
		
		
		
		
		
		

	}

}
