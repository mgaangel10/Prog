package ejercicio4;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op=0;
		String nombre;
		LIneaDeVenta [] lista;
		lista=new LIneaDeVenta[7];
		Venta v ;
		v=new Venta (lista);
		Producto r,a,e,r1,r2,a1,e1;
		r=new Ropa(100,"nike",1,true,10);
		a=new Alimentacion(10,"patatas",2,5,1);
		e=new Electronica (1000,"movil",3,15,true);
		r1=new Ropa(110,"adidas",4,true,10);
		a1=new Alimentacion(200,"nike tech",5,5,4);
		e1=new Electronica (1020,"camara",6,15,false);
		r2=new Ropa(220,"jordan",7,false,10);
		
		lista[0]=new LIneaDeVenta(r,1);
		lista[1]=new LIneaDeVenta(e,2);
		lista[2]=new LIneaDeVenta(r1,3);
		lista[3]=new LIneaDeVenta(r2,1);
		lista[4]=new LIneaDeVenta(e1,2);
		lista[5]=new LIneaDeVenta(a,4);
		lista[6]=new LIneaDeVenta(a1,2);
		
		do {
			System.out.println("-------MENU--------");
			System.out.println("1-----para ver la cesta de compra ");
			System.out.println("2-----para buscar un articulo en especifico");
			System.out.println("3-----para eliminar producto");
			System.out.println("4-----para ver ticket de compra");
			op=Leer.datoInt();
			switch (op) {
			case 1:
				System.out.println("Esta es tu cesta de compra");
				v.imprimirCesta();
				break;
			case 2:
				System.out.println("digame el nombre del producto");
				nombre=Leer.dato();
				v.imprimirBuscado(nombre);
				break;
			case 3:
				System.out.println("digam el nombre del producto que quieras eliminar");
				nombre=Leer.dato();
				v.dardebjaa(nombre);
				break;
			case 4:
				v.imprimirTicket(lista);
				break;

			default:
				System.out.println("esa opcion no existe");
				break;
			}
			
		} while (op!=0);
		System.out.println("gracias por usar este programa");
		
	}
}
