package ejercicio2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=0;
		boolean resultado;
		
		Operaciones op=new Operaciones();
		System.out.println("diga numero");
		num=Leer.datoInt();
		op.comprobarPos(0);
		//opcion 1
		resultado=op.comprobarPos(num);
		System.out.println(resultado);
		//opcion2 la chupipiruli
		
		System.out.println(op.comprobarPos(num));//esto no es chachi
		op.imprimir(op.comprobarPos(num));//esto si es chachi
		//opcion3 tmb chachi
		op.imprimir(resultado);
		resultado=op.comprobarPos(num);
		
	}

}
