package ejercicio8;

import java.util.Random;

public class Sorteo {
	private int [] num;
	public Sorteo() {
		
	}
	public Sorteo(int [] num) {
		this.num=num;
	}
	
	public int [] generarale() {
		Random num1= new Random (System.nanoTime());
		int hasta=9,desde=0;
		for (int i = 0; i < this.num.length; i++) {
			 num [i]= num1.nextInt(hasta-desde+1)+desde;
		}
		 return num;
	}
	public void imprimir() {
		for (int i = 0; i < num.length; i++) {
		 System.out.println(num[i]);
		}
	}
	public int[] getNum() {
		return num;
	}
	public void setNum(int[] num) {
		this.num = num;
	}
	
	
}
