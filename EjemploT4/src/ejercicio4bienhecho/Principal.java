package ejercicio4bienhecho;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LineaDeVenta []list;
		Venta ven;
		int cant, tam = 5, op;
		Producto rop, alim, elec;
		Mostrar mos = new Mostrar();
		//todo esto es lo que has echo tu abdel
		
		list = new LineaDeVenta[tam];
		rop = new Ropa(15, "Carzonas", "1a");
		alim = new Alimentacion(10, "Yogur", "2a", 1, true);
		elec = new Electronica(20, "Ordenador", "3a");
		list[0] = new LineaDeVenta(rop, 2);
		list[1] = new LineaDeVenta(alim, 4);
		list[2] = new LineaDeVenta(elec, 1);
		ven = new Venta(list);
		// la linea 26-38 es lo digamos que te falta
		//pero te e dicho que lo opongas asi para ahorraois de ahcer etso...
		mos.mostrarMenu();
		System.out.println("Que desea hacer");
		op = Leer.datoInt();
		switch(op) {
			case 1:
				mos.mostrarTicket(ven, list, "20/11/2002");
				break;
			case 2:
				mos.mostrarProductos(list);
				break;
			default:
				System.out.println("Número incorrecto");
		}
		//si quitaramos el if=null saldria los null

	}
//esto seria el ejercicio digamos bien 
}
