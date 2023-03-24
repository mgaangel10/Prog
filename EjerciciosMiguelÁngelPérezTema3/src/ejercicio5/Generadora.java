package ejercicio5;

import java.util.Random;

public class Generadora {
	Random num= new Random (System.nanoTime());
	
	public int quiniela(int numero) {
		int hasta=2, desde=0;
		int num1 = num.nextInt(hasta-desde+1)+desde;
		
		return num1;
	}
	Random num2= new Random (System.nanoTime());
	public int paresNones(int hasta, int desde) {
		
		int num13 = num2.nextInt(hasta-desde+1)+desde;
		
		
		return num13;
		
		
	}
	public void comprob(int num13) {
		num13=num13%2;
		if(num13==0) {
			System.out.println("par");
		}else {
			System.out.println("impar");
		}
	}
	Random num3= new Random (System.nanoTime());
	public int chinos() {
		int hasta=3;
		int desde=1;
		int num = num3.nextInt(hasta-desde+1)+desde;
		
		
		return num;
		
		
	}
	Random num4= new Random (System.nanoTime());
	public int primitiva() {
		int hasta=49;
		int desde=1;
		int num = num4.nextInt(hasta-desde+1)+desde;
		
		
		return num;
		
		}
	
	
	
	

}
