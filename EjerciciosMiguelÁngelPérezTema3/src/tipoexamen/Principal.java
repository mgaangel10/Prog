package tipoexamen;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre,nombreJefe;
		 double precioB=0.0,nuevoPrecio=0.0;
		 String seccion = null;
		 boolean rebaja=false;
		 double pvp=0.0,dolar=0.0;
		 int porcentaje =0,elecion=0,porcentajeReb=0;
		 Producto p1=new Producto();
		 
		 
		 System.out.println("Bienvenido al progarama donde te ayudaremos con las cuentas");
		 System.out.println("Indiqueme su nombre");
		 nombreJefe=Leer.dato();
		 System.out.println("Hola "+nombreJefe+" ¿Que producto deseas vender?");
		 nombre=Leer.dato();
		 System.out.println("¿Su producto a que seccion pertenece?");
		 seccion=Leer.dato();
		 do {
		 System.out.println(nombreJefe+"¿Que deseas hacer?");
		 System.out.println("pulse 1----------para calacular el precio de venta al público\n"
		 		+ "pulse 2-------------para aplicar el descuento para las rebajas\n"
		 		+ "pulse 3-------------para imprimir todos los datos sobre\n"+nombre
		 		+ "pulse 4-------------para cambiar de € a dolaraes\n"
		 		+ "pulse 5-------------para modificar el precio base de\n"+nombre);
		 elecion=Leer.datoInt();
		 switch (elecion) {
		case 1:
			System.out.println("Para poder vender al público necesito saber cual sera su porcentaje de ganacias");
			porcentaje=Leer.datoInt();
			
			 
			System.out.println(" ¿Cual es el precio base? ");
			precioB=Leer.datoDouble();
			p1=new Producto(seccion, precioB, seccion, rebaja, pvp);
			 
			p1.pvp(porcentaje);
			System.out.println("precio pvp: "+p1.getPvp()+"€");
			p1.megaGanga();
			break;
		case 2:
			System.out.println("¿Que porcentaje de rebaja quieres darle al "+nombre+"?");
			porcentajeReb=Leer.datoInt();
			rebaja=p1.compReb(porcentajeReb);
			p1.rebaja(rebaja, porcentajeReb);
			
			
			break;
		case 3:
			System.out.println(p1  );
			p1.megaGanga();
			break;
		case 4:
			System.out.println("S u precio final en dolares serian de :");
			dolar=p1.convertirDolar();
			System.out.println(dolar+" dolar");
			break;
		case 5:
			System.out.println("Indiqueme el nuevo valor del precio base");
			nuevoPrecio=Leer.datoDouble();
			p1.setPrecioB(nuevoPrecio);
			System.out.println("Este es el nuevo precio base: "+p1.getPrecioB());
			break;
			

		default:
			break;
		}
		 }while(elecion!=0);
		 
		 
		 
		 
		 

	}

}
