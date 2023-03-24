package ejercicio1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op=0;
		double cantidad=0.0,descuento=0.0,iva=0.0;
		String nombre;
		
	
		Taquilla t;
		EntradasNormales [] lista;
		lista=new EntradasNormales[4];
		
		
		lista[0]=new EntradasVip("angel",3,1,true,false,1.4,2.7,"anuel");
		lista[1]=new EntradasGrupo("manolo",5,5,false,true,1.4,2.7,15);
		lista[2]=new EntradasGrupo("pepe",1,1,true,false,1.4,2.7,4);
		lista[3]=new EntradasNormales("julio",6,1,false,true,1.4,2.7);
		
		t=new Taquilla(lista);
		System.out.println("dime el un porcentaje de iva");
		iva=Leer.datoDouble();
		System.out.println("dime un descuento para cuando la entrada de gurpo haya mas de 10 personas");
		descuento=Leer.datoDouble();
		do {
			
			System.out.println("1----ver las entradas");
			System.out.println("2----ver el precio");
			System.out.println("3----cancelar entrada");
			System.out.println("4----ver recaudo solo de la zona 1");
			System.out.println("5----ver el dienero total recaudado con iva");
			System.out.println("6----para buscar su entrada");
		
			op=Leer.datoInt();
			switch (op) {
			case 1:
				t.imprimirEntradas();
				break;
			case 2:
				System.out.println("diga el nombre del titular de la entradd");
				nombre=Leer.dato();
				t.imprimirPrecio(nombre, cantidad, descuento);
				break;
			case 3:
				System.out.println("digame el nombre del titular de la entrada para cancelar");
				nombre=Leer.dato();
				t.cancelarEntrada(nombre);
				
				break;
			case 4:
				System.out.println("el dinero recaudado de la zona 1 sin iva es de ");
				t.verTotalDeZona1(cantidad, descuento);
				break;
			case 5:
				System.out.println("el total ha sido");
				;
				System.out.println(t.totalRecaudadoPoriva(iva));
				break;
			case 6:
				System.out.println("diga el nombre del titular de la entrada");
				nombre=Leer.dato();
				t.encontrarEntrada(nombre);
				break;
		

			default:
				System.out.println("esa opcion no existe");
				break;
			}
			
		} while (op!=0);
		
		System.out.println("Gracias por usar el programa");

	}

}
