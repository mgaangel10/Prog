package ejercicio6;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cuentas [] lista;
		lista = new Cuentas[5];
		Oficina of;
		double tope=0.0;
		
		
		
		lista[0]=new CuentaJoven(9000,"123a","angel","perez",1,10);
		lista[1]=new CuentaJoven(1000,"123a","angel","perez",1,20);
		lista[2]=new CuentaEmpresa(1000,"123c","pablo","perez",1,true);
		lista[3]=new CuentaCorriente(1000,"123d","pablo","perez",100,30);
		of=new Oficina(lista);
		System.out.println(of.calcularSueldo(0));
		System.out.println(lista[1].calcularPago());
		System.out.println(of.calcularSueldo(2));		
		System.out.println(of.calcularSueldo(3));
		of.imprimirCuentas();
		System.out.println("supuestamenta este es el total de todas de las cuentas");
		System.out.println(of.sumarTodo());
		System.out.println("diga usted el topw");
		tope=Leer.datoDouble();
		for (int i = 0; i < lista.length; i++) {
			System.out.println(of.bucarSaldoMayorQue(tope)[i]);
		}
		
		

	}

}
