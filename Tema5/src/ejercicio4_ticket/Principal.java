package ejercicio4_ticket;

import java.util.HashMap;
import java.util.Map;

import ejercicio4.Contacto;



public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map <Producto,Integer> listado=new HashMap <Producto,Integer>();
		
		Producto c4=new Producto(105,"angel",4);
		Producto c2=new Producto(130,"b",3);
		Producto c3=new Producto(160,"c",2);
		Producto c1=new Producto(200,"d",1);
		Producto [] lista  ;
		lista=new Producto [7];
		
		LineaVenta [] linea;
		linea=new LineaVenta[7];
		String nombre;
		lista[0]=new Alimentacion(10,"tarta",1,1,5);
		lista[1]=new Ropa(230,"Jordan 11",2,true,10);
		
		lista[3]=new Ropa(240,"Nike tech",4,true,10);
		lista[4]=new Ropa(230,"Airforce 1",5,true,10);
		
		
		
		
		

	}

}
