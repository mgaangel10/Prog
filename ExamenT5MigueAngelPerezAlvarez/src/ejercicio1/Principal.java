package ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op=0;
		String interprete = null;
		boolean gratis = false;
		MiMusica m;
		Cancion c,c1,c2,c3,c4;
		List<Cancion> listado= new ArrayList <Cancion>();
		m=new MiMusica(listado);
		c=new Cancion(1,"tusa","karol",20,true,3.40);
		c1=new Cancion(2,"fantasias","anuel raw alejandro",70,true,5.40);
		c2=new Cancion(3,"soldado y profeta","anuel y ñengo flow",270,true,2.40);
		c3=new Cancion(4,"china","anuel",80,false,7.40);
		c4=new Cancion(5,"ruta","youg chimi",100,true,11.40);
		
		m.agregar(c);
		m.agregar(c1);
		m.agregar(c2);
		m.agregar(c3);
		m.agregar(c4);
		
		
		
		
		
		
		
		do {
			System.out.println("\t MENÚ");
		System.out.println("**********************");
		System.out.println("1---Buscar solo gratis");
		System.out.println("2---Buscar cacion con mas duracion");
		System.out.println("3---Buscar cancion");
		System.out.println("4---Buscar cancion que mas se haya escuchado-");
		System.out.println("5---modificar si es de pago");
		System.out.println("6---ordenar canciones alfabeticamente-");
		System.out.println("7---ordenar por duracion-");
		System.out.println("8---lista aleatoria-");
		System.out.println("9---calcular la duracion media");
		System.out.println("10---ver todas las canciones");
		op=Leer.datoInt();
		switch (op) {
		case 1:
			System.out.println("Aqui estan todas las gratsis");
			
			m.mostrarGratis(gratis);
			break;
		case 2:
			System.out.println("La cancion con mayor duracion es :");
			System.out.println(m.FindMaDur(c1));
			break;
		case 3:
			System.out.println("Digame el titulo de la cancion");
			interprete=Leer.dato();
			m.findByNombre(interprete);
			m.imprimirBuscado(interprete);
			break;
		case 4:
			System.out.println("La cancion mas escuchada ha sido :");
			System.out.println(m.FindMaEscu(c1));
			break;
		case 5:
			
			System.out.println("Digame el interprete");
			interprete=Leer.dato();
			m.editGra(interprete);
			
			break;
		case 6:
			System.out.println("Ordenadas alfabeticamenrte");
			break;
		case 7:
			
			break;
		case 8:
			
			break;
		case 9:
			System.out.println("La media de duracion de todas las canciones son de : ");
			System.out.println(m.calcularDurMedia()+" min");
			break;
		case 10:
			m.mostrar();
			break;
			

		default:
			System.out.println("Esa opción no existe");
			break;
		}
		} while (op!=0);
		System.out.println("Gracias por usar este programa");
		

	}

}
