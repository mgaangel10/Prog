package ejemplo2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre;
		int [] lista= {1,2,3};
		double precioB,precioNuevo=0.0;
		prroducto prod;
		System.out.println("diga nombre");
		nombre=Leer.dato();
		System.out.println("diga precio");
		precioB=Leer.datoDouble();
		prod=new prroducto (precioB, nombre,lista);
		System.out.println(prod.getNombre());
		System.out.println("diga el precio nuevo");
		precioNuevo=Leer.datoDouble();
		prod.setPreciob(precioNuevo);
		System.out.println(prod.getPreciob());
		System.out.println(prod);
		
	}

}
