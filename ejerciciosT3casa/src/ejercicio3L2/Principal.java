package ejercicio3L2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*3. Vamos a intentar modelar a un vendedor ambulante de “móviles”. Los atributos de la clase Móvil
		serán, como mínimo, marca, modelo, vendido o no y precio unitario. En la clase Vendedor con un
		array de Móviles y total vendido, como atributos mínimos, se deben crear métodos que hagan las
		siguientes operaciones: Comprobar que le quedan móviles, mostrar cuántos móviles le quedan sin
		vender, mostrar precio final de un producto haciendo algún descuento al precio unitario, etc.
		Podemos incluir también, si se quiere, la posibilidad de ofrecer cambio. Escribir también una clase
		de prueba para hacer todas las operaciones.*/
		
		String marca;
		 String modelo;
		 boolean vendido=false;
		 double precioUni=0.0,precioNew=0.0,rebaja=0.0;
		 int totalV=0, cantidad=0,elec=0,posicion=0;
		Movil  moviles [];
		Vendedor v1;
		System.out.println("cuntos moviles vas a vender");
		cantidad=Leer.datoInt();
		moviles=new Movil[cantidad];
		v1=new Vendedor (moviles,totalV);
		
		do {
			System.out.println("menu");
			System.out.println("1----listar moviles");
			System.out.println("2----añadir moviles");
			System.out.println("3----cambiar precio");
			System.out.println("4----para rebajr un movil");
			
			elec=Leer.datoInt();
			switch (elec) {
			case 1:
				
				v1.listarMov();
				break;
			case 2:
				System.out.println("marca?");
				marca=Leer.dato();
				System.out.println("modelo?");
				modelo=Leer.dato();
				System.out.println("dime el precio");
				precioUni=Leer.datoDouble();
				v1.add(new Movil(marca,modelo, true, precioUni),posicion);
				posicion++;
				break;
			case 3:
				System.out.println("dime que marca quieres el precio");
				marca=Leer.dato();
				System.out.println("dime el nuevo precio");
				precioNew=Leer.datoDouble();
				v1.editPrecio(marca, precioNew);
				
				
				
				 break;

			default:
				System.out.println("esa opccion no existe");
				break;
			}
			
			}while(elec!=0);
		System.out.println("fin de programa");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
