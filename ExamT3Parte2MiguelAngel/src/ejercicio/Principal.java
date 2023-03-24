package ejercicio;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String concepto=null;
		double gastado=0.0;
		int identificador=0,cantidad=0,posicion=0,elec=0;
		double totalGastado=0.0,gastadoNew=0.0,presupuesto=0.0;
		Gasto [] lista;
		GestionGastos g1;
		System.out.println("cuantos gastos ha tenido ");
		cantidad=Leer.datoInt();
		lista=new Gasto [cantidad];
		g1=new GestionGastos(lista,totalGastado);
		
		do {
			System.out.println("menu");
			System.out.println("1---introducir gasto");
			System.out.println("2---Calcular todos los gastos");
			System.out.println("3---Listar todos los gastos");
			System.out.println("4---Mostrar solo los gastos");
			System.out.println("5---Editar un gasto");
			System.out.println("6--- Buscar por gastos");
			System.out.println("7---Para saber su saldo actual");
			elec=Leer.datoInt();
			switch (elec) {
			case 1:
				System.out.println("En ¿qué se ha gastado el dineo? ");
				concepto=Leer.dato();
				System.out.println("Diga el dinero gastado ");
				gastado=Leer.datoDouble();
				System.out.println("Añada un numero id");
				identificador=Leer.datoInt();
				g1.add(new Gasto(concepto,gastado,identificador),posicion);
				posicion++;
				break;
			case 2:
				g1.imprimirTotalGastado();
				break;
			case 3:
				g1.listarTodo();
				break;
			case 4:
				g1.imprirSoloGast();
				break;
			case 5:
				g1.imprimriYaGastados();
				System.out.println("Dime el numero del identificador que vas modificar");
				identificador=Leer.datoInt();
				System.out.println("Diga el nuevo valor");
				gastadoNew=Leer.datoDouble();
				g1.editGasto(identificador, gastadoNew);
				
				break;
			case 6:
				System.out.println("Dime el concepto");
				concepto=Leer.dato();
				g1.imprirSoloConcep(concepto);
				;
				
				break;
			case 7:
				System.out.println("Cual era su presupuesto que disponias para gastar");
				presupuesto=Leer.datoDouble();
				g1.calcularSaldoFinal(presupuesto);
				if (g1.calcularSaldoFinal(presupuesto)<0) {
					System.out.println("Deberia pensar en un plan de ahorro su saldo final es de: "+g1.calcularSaldoFinal(presupuesto));
				} else {
					System.out.println("Muy bien ha ahorrado muy bien su saldo final es de: "+g1.calcularSaldoFinal(presupuesto));
				}
				break;
			
				

			default:
				System.out.println("Esa opcion no exsiste");
				break;
			}
			
			
		}while(elec!=0);
		System.out.println("Gracias por usarlo");
		

	}

}
