package ejercicio4L2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String dni=null;
		 String nombre=null;
		 String apellidos = null;
		 boolean activo=false;
		 double peso=0.0;
		 double altura=0.0,totalpes=0.0,totalalt=0.0;
		 int cantidad=0,elec=0,posicion=0;
		 Gimnasio g1;
		 Cliente [] lista;
		 System.out.println("cuantos clientes vas a tener ");
		 cantidad=Leer.datoInt();
		 lista=new Cliente[cantidad];
		 g1=new Gimnasio(lista);
		do {
		 System.out.println("MENU");
		 System.out.println("1---listar los clientes");
		 System.out.println("2---añadir a clientes");
		 System.out.println("3---dar de baja a un cliente");
		 System.out.println("4---calcular la media del IMC de los clientes ");
		 elec=Leer.datoInt();
		 switch (elec) {
		case 1:
			g1.mostrarTodo();
			break;
		case 2:
			System.out.println("dni");
			dni=Leer.dato();
			System.out.println("dime su nombre");
			nombre=Leer.dato();
			System.out.println("dime su apllido");
			apellidos=Leer.dato();
			System.out.println("peso");
			peso=Leer.datoDouble();
			System.out.println("altura");
			altura=Leer.datoDouble();
			g1.add(new Cliente(dni,nombre,apellidos,true,peso,altura),posicion);
			posicion++;
			
			break;
		case 3:
			g1.imprimirSoloActivos();
			System.out.println("dime el dni del cliente para darle baja");
			dni=Leer.dato();
			g1.darbaja(g1.findById(dni));
			break;
		case 4:
			System.out.println("la media de IMC de los clientes son de ");
			g1.calcularIMCGym();
			
			break;

		default:
			break;
		}
		 
		 
		 
		}while(elec!=0);
		
		

	}

}
