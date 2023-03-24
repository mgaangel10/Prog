package ejercicio3interfaces;

import java.util.Random;

public class ArrayReales implements IEstadisticas {
	
	private double [] num;
	
	

	public ArrayReales(double[] num) {
		super();
		this.num = num;
	}

	@Override
	public double calcularMinimo() {
		// TODO Auto-generated method stub
		double menor=num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i]<menor) {
				menor=num[i];
			}
		}
		
		return menor;
	}

	@Override
	public double calcularMAximo() {
		// TODO Auto-generated method stub
		double mayor=num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i]>mayor) {
				mayor=num[i];
			}
		}
		return mayor;
	}

	@Override
	public double calcularsuma() {
		// TODO Auto-generated method stub
		double total=0.0;
		for (int i = 0; i < num.length; i++) {
			total=num[i]+total;
		}
		return total; 
	}
	
	public double [] cargar() {
		Random rn=new Random(System.nanoTime());
		int hasta =10,desde=0;
		for (int i = 0; i < num.length; i++) {
			num[i]=rn.nextInt(hasta-desde+1)+desde;
		}
		return num;
	}
	
	public void imprimirArray() {
	for (int i = 0; i < num.length; i++) {
		System.out.println(num[i]);
	}
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
