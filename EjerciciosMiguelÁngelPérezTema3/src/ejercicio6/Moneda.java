package ejercicio6;

import java.util.Random;

public class Moneda {
	private String cara;
	private String cruz;
	public Moneda () {
		
	}
	
	
	public Moneda (String cara, String cruz) {
		this.cara=cara;
		this.cruz=cruz;
	}
	Random num1= new Random (System.nanoTime());
	public int aleatorio(int hasta, int desde) {
		int num13 = num1.nextInt(hasta-desde+1)+desde;
		
		return num13;
	}
	public void imprimir(int num13) {
		num13=num13%2;
		if(num13==0) {
			System.out.println("Ha salido cara");
		}else {
			System.out.println("Ha salido cruz");
		}
	
	}
	public void ganador(int num13) {
		num13=num13%2;
		if(num13==0) {
			System.out.println("has ganado");
		}else {
			System.out.println("siga jugando");
		}
	}
	public void ganadorCruz(int num13) {
		num13=num13%2;
		if(num13!=0) {
			System.out.println("Has ganado");
		}else {
			System.out.println("siga jugando");
		}
	}
}
