package relacionClases;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre;
		int edad=0;
		int topeEdad=0;
		Cliente c;
		long numeroC;
		float saldo,interes;
		Cuenta cu;
		System.out.println("diga nombre");
		nombre=Leer.dato();
		System.out.println("diga edad");
		edad=Leer.datoInt();
		c=new Cliente (nombre, edad);
		
		System.out.println("diga numero de cuenta");
		numeroC=Leer.datoLong();
		System.out.println("diga saldo");
		saldo=Leer.datoFloat();
		System.out.println("diga interes");
		interes=Leer.datoFloat();
		cu=new Cuenta(numeroC,c,saldo,interes);
		//la linea 30 sobraria
		System.out.println("datos del cliente: "+c);
		System.out.println("datos de la cuenta: "+cu);
		//cdavez que salga un null pointed esque es objeto no esta instanciado
		System.out.println("A partir de que edad se cobra la pension");
		topeEdad=Leer.datoInt();
		System.out.printf("su saldo es:%.2f ",cu.ingresarPension(topeEdad));
		System.out.println("otra manera de hacerlo "+cu.ingresarPensionV2(topeEdad));

	}

}
