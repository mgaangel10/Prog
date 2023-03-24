package examena;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pasteleria tarta;
		String sabor;
		int tam=0, eleccionExtra=0, opcion=0, cero=0, hasta=0, desde=0,cambiarDia=0,cambiarTarta=0;
		double precioLitro=0.0, volumen=0.0, porcenGan=0.0, costeExtra=0.0;
		boolean extraNormal=false;
		int[] cantTartas;
		
		System.out.println("bienvenidos al programa");
		System.out.println("indica los dias que vamos a contabilizar");
		tam=Leer.datoInt();
		cantTartas=new int[tam];
		System.out.println("indique el sabor");
		sabor=Leer.dato();
		System.out.println("inidca el precio en euros que se usa para elaborar una tarta");
		precioLitro=Leer.datoDouble();
		System.out.println("indica el volumen en litros que se usa para una tarta");
		volumen=Leer.datoDouble();
		System.out.println("pulse 1: extra\n"
				+ "pulse 2: no extra");
		eleccionExtra=Leer.datoInt();
		if (eleccionExtra==0) {
			extraNormal=false;
		}else {
			extraNormal=true;
		}
		tarta=new Pasteleria(sabor,precioLitro,volumen,extraNormal,cantTartas);
		System.out.println("1-arrays");
		System.out.println("2-precioFab");
		System.out.println("3-precio venta");
		System.out.println("4- extra normal");
		
		
		switch (opcion) {
		case 1:
			System.out.println("desde");
			desde=Leer.datoInt();
			
			break;
		case 2:
		System.out.println(tarta.calcularPrecioFab());	
		break;
		case 3:
			System.out.println("porcentaje de ganancia?");
			porcenGan=Leer.datoDouble();
			System.out.println(tarta.calcularPrecioVenta(porcenGan)); 
			break;
		case 4:
			if (extraNormal) {
				System.out.println("inidca cuanto es el coste del extra de la tarta");
				costeExtra=Leer.datoDouble();
			}
			System.out.println( tarta.calcularExtra(porcenGan, costeExtra)); 
			
			break;
		case 5:
			System.out.println(tarta.calcularTotalTartas()); 
			break;
		case 6:
			System.out.println("que dia");
			cambiarDia=Leer.datoInt();
			System.out.println("cambiar num tarta");
			cambiarTarta=Leer.datoInt();
			tarta.cambiarDiaTarta(cambiarDia, cambiarTarta);
			
			break;
		default:
			break;
		}
		
		
		

	}

}
