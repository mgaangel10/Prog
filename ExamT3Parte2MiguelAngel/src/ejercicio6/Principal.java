package ejercicio6;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cuentas [] lista;
		lista = new Cuentas[5];
		Oficina of;
		
		
		
		lista[0]=new CuentaJoven(1000,"123a","angel","perez",0,10,0,1,true);
		lista[1]=new CuentaJoven(1000,"123b","raul","perez",0,30,0,1,true);
		lista[2]=new CuentaEmpresa(1000,"123c","pablo","perez",0,40,0,1,true);
		lista[3]=new CuentaCorriente(1000,"123d","pablo","perez",0,60,0,100,30);
		of=new Oficina(lista);
		System.out.println(of.calcularSueldo(0));
		System.out.println(lista[1].calcularPago());
		System.out.println(of.calcularSueldo(2));		
		System.out.println(of.calcularSueldo(3));
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
		

	}

}
