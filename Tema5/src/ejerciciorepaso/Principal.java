package ejerciciorepaso;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cl,cl1,cl2,cn;
		Oficina of;
		Cuenta cu ,cu1,cu2,cu3;
		double precioN=0.0, saldo=0.0;
		String nombre = null;
		String dni;
		int op=0,op1=0;
		int edad=0;
		int masuno=1;
		Integer idMap = masuno;
		Map <Cliente,Cuenta> tree;
		Map<Cliente,Cuenta> listado=new HashMap <Cliente,Cuenta>();
		
		
		cl=new Cliente(1,"z","1234b",19);
		cl1=new Cliente(3,"a","1234b",16);
		cl2=new Cliente(100,"h","1234b",12);
		of=new Oficina (listado);
		cu=new CuentaJoven(cl,1,true);	
		cu1=new CuentaCorriente (cl1,10,10);	
		cu2=new CuentaEmpresa (cl2,1,true);	
	
		
		of.agregar(cl, cu);
		of.agregar(cl1, cu1);
		of.agregar(cl2, cu2);
		
		
		
		
		
		do {
			System.out.println("MENU");
			System.out.println("1--mostrar clientes ");
			System.out.println("2--total de saldos");
			System.out.println("3--editar saldo");
			System.out.println("4--ordenar por nombre");
			System.out.println("5--ordenar por saldo");
			System.out.println("6--agregar una cuenta");
			op=Leer.datoInt();
			switch (op) {
			case 1:
				of.mostrarCuenta();
				break;
			case 2:
				System.out.println(of.calcularSueldosTotales());
				
				break;
			case 3:
				System.out.println("diga el id");
				nombre=Leer.dato();
				System.out.println("diga el precio nuevo");
				precioN=Leer.datoDouble();
				of.editPrecio(precioN,nombre);
				break;
			case 4:
				tree=new TreeMap<Cliente,Cuenta>();
				tree.putAll(of.getListado());
				for(Cliente c: tree.keySet()) {
					System.out.println(c+". "+tree.get(c));
				}
				
				break;
			case 5:
				tree=new TreeMap<Cliente,Cuenta>(new OrdenarSaldo());
				tree.putAll(of.getListado());
				for(Cliente c:tree.keySet()) {
					System.out.println(c+". "+tree.get(c));
				}
				break;
			case 6:
				System.out.println("saldo");
				saldo=Leer.datoDouble();
				System.out.println("nombre");
				nombre=Leer.dato();
				System.out.println("dni");
				dni=Leer.dato();
				System.out.println("edad");
				edad=Leer.datoInt();
				cn=new Cliente(saldo,nombre,dni,edad);
				System.out.println("que tipo de cuenta quieres");
				System.out.println("cuenta empresa");
				System.out.println("cuenta corriente");
				System.out.println("cuenta joven");
				op1=Leer.datoInt();
				switch (op1) {
				case 1:
					System.out.println("has elegido cuenta empresa");
					cu3=new CuentaEmpresa(cn,1,false);
					of.agregar(cn, cu3);
					break;
				case 2:
					System.out.println("has elegido cuenta corriente ");
					cu3=new CuentaCorriente(cn,10,10);
					of.agregar(cn, cu3);
					
					break;
				case 3:
					System.out.println("has elegido cuenta joven");
					cu3=new CuentaJoven(cn,1,false);
					of.agregar(cn, cu3);
					break;

				default:
					break;
				}
				
				
				break;

			default:
				System.out.println("esa opcion no existe");
				break;
			}
		} while (op!=0);
		System.out.println("gracias por usar este programa");

	}

}
