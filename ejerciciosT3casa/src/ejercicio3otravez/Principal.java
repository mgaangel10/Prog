package ejercicio3otravez;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String marca;
		String modelo;
		double precio=0.0,totalV=0.0,precioNew=0.0;
		boolean activo=false;
		int posicion=0,cantidad=0,elec=0,contador=0;
		Movil [] moviles;
		Vendedor v1;
		System.out.println("cuantos moviles ");
		cantidad=Leer.datoInt();
		moviles=new Movil [cantidad];
		 v1=new Vendedor(moviles,totalV);
		
		do {
		System.out.println("menu");
		System.out.println("1--listar moviles");
		System.out.println("2--añadir movil");
		System.out.println("3--cambiar el precio");
		System.out.println("4--ver moviles vendidos");
		elec=Leer.datoInt();
		switch (elec) {
		case 1:
			v1.listarmov();
			break;
		case 2:
			System.out.println("marca");
			marca=Leer.dato();
			System.out.println("modelo");
			modelo=Leer.dato();
			System.out.println("precio?");
			precio=Leer.datoDouble();
			v1.add(new Movil(marca,modelo,precio,true),posicion);
			posicion++;
			break;
		case 3:
			v1.imprirmirSoloAct();
			System.out.println("dime la marca para cambiar el precio");
			marca=Leer.dato();
			System.out.println("diga el precio nuevo");
			precioNew=Leer.datoDouble();
			v1.editPrecio(marca, precioNew);
			break;
		case 4:
			
			System.out.println(v1.comptobarMov());

		default:
			break;
		}
		}while(elec!=0);
		
		

	}

}
