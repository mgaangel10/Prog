package ejemplocrud;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int posicion = 0, contadorP=0;
		String nombre;
		double precioUnitario=0.0;
		float precioN=0;
		boolean activo=false;
		String codigoABuscar;
		String codigo = null;
		int elec=0;
		
		CrudProducto crud2;
		Producto []listaCrud2;
		int tam;
		
		System.out.println("diga el tamaño");
		tam=Leer.datoInt();
		
		listaCrud2= new Producto [tam];
		crud2=new CrudProducto(listaCrud2);
		do {
			System.out.println("1---todos los prod");
			System.out.println("2---añadir");
			System.out.println("3---modificar");
			System.out.println("4---borrar");
			System.out.println("5---imprimir solo activos");
			elec=Leer.datoInt();
			
		switch (elec) {
		case 1:
			crud2.imprimirTodosLosProductos();
			break;
		case 2:
			System.out.println("codigo");
			codigo=Leer.dato();
			System.out.println("nombre");
			nombre=Leer.dato();
			System.out.println("diga el precio de unidad");
			precioUnitario=Leer.datoDouble();
			crud2.add(new Producto(codigo,nombre,precioUnitario,true),contadorP);
			break;
		case 3:
			System.out.println("codigo a modificar");
			crud2.imprimirSoloActivos();
			nombre=Leer.dato();
			System.out.println("nuevo precio");
			precioN=Leer.datoFloat();
			crud2.editPrecio(codigo, precioN);
			break;
		case 4:
			System.out.println("codigo para borrar");
			codigo=Leer.dato();
			crud2.delete(crud2.findById(codigo));
			break;
		case 5:
			crud2.imprimirSoloActivos();
			break;
		default:
			break;
		}
		
		}while(elec!=0);
		
		
		
		
		

	}

}
