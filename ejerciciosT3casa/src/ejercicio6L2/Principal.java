package ejercicio6L2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double precio=15.0;
		String numIdE;
		boolean ocupada= false;
		int numFil=0; 
		String butaca;
		int numeroId=0,contadorEn=0;
		int numLocal=0;
		int elec=0,contadorE=0;
		int cantidad=0,total=0;
		double [] entrada;
		entrada =new double[cantidad];
		System.out.println("Cuantas entradas hay disponible");
		numLocal=Leer.datoInt();
		Entrada [] entr;
		entr=new Entrada[numLocal];
		Sala s1;
		s1=new Sala(numeroId,numLocal, entr);
		
		System.out.println("");
		do {
		System.out.println("Bienvenido ");
		System.out.println("1 --- ver peli");
		System.out.println("2 ---- comprar entrada");
		System.out.println("3----- ver total");
		System.out.println("4----- listar entradas");
		System.out.println("5---- buscar por butaca");
		elec=Leer.datoInt();
		switch (elec) {
		case 1:
			System.out.println("La pelicula es las aventuras de miguel garfia");
			
			
			
			break;
		case 2:
			System.out.println("has elegido comprar entrada");
			
			do {
			System.out.println("cuantas entradas");
			cantidad=Leer.datoInt();
			if (cantidad>numLocal) {
				System.out.println("no hay tantas entradas disponible ");
				total=numLocal-contadorE;
				System.out.println("entradas disponibles: "+total);
			}
			}while(cantidad>numLocal);
			
			do  {
			System.out.println("eliga fila del 1-10");
			numFil=Leer.datoInt();
			
			System.out.println("butaca");
			butaca=Leer.dato();
			System.out.println("numid");
			numIdE=Leer.dato();
		
			
			
			
			 
			s1.add(new Entrada(numIdE,precio,ocupada,numFil,butaca),contadorE);
			contadorE++;
			
			s1.findById(butaca);
			s1.findByIdNum(numIdE);

			contadorEn++;
			
			}while(cantidad!=contadorEn);
			break;
		case 3:
		
		s1.imprir(s1.comprar(cantidad));
		break;
		case 4:
			s1.listar();
			break;
		case 5:
			System.out.println("butaca");
			butaca=Leer.dato();
			System.out.println(s1.findById(butaca));
			

		default:
			break;
		}
		}while(elec!=0);
		
		
		
		
		
		

	}

}
