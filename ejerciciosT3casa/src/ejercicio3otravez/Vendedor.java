package ejercicio3otravez;

import java.util.Arrays;

public class Vendedor {
	
	private Movil moviles[];
	private double totalV;
	public Vendedor(Movil[] moviles, double totalV) {
		super();
		this.moviles = moviles;
		this.totalV = totalV;
	}
	
	
	//metodos importantes
	public void add(Movil m,int posicion) {
		moviles[posicion]=m;
	}
	
	public void listarmov() {
		for (int i = 0; i < moviles.length; i++) {
			System.out.println((i+1)+". "+moviles[i]);
		}
	}
	
	public int findById(String marca) {
		int i=0;
		boolean encontrado =false;
		while(i<moviles.length && !encontrado) {
			Movil deLista = moviles[i];
			if (deLista.getMarca().equalsIgnoreCase(marca)) {
				encontrado=true;
			} else {
				i++;
			}
		}
		if (encontrado) {
			return i;
		} else {
			return -1;
		}
	}
	
	public void editPrecio(String marca,double precioNew) {
		int index= findById(marca);
		if (index >= 0) {
			moviles[index].setPrecio(precioNew);
		}
	}
	
	public void imprirmirSoloAct() {
		for (int i = 0; i < moviles.length && moviles[i]!=null; i++) {
			if (moviles[i].isActivo()) {
				System.out.println((i+1)+". "+moviles[i]);
			}
		}
	}
	
	public int
		comptobarMov() {
		int contador=0;
		for ( int i = 0; i < moviles.length && moviles[i] !=null; i++) {
			if (moviles[i].isActivo()) {
				contador++;
			}
		}
		return contador;
	}
	
	
	
	public void imprirmiCant() {
		if (comptobarMov()==0) {
			System.out.println("no quedan moviles");
		} else {
			System.out.println("quedan "+comptobarMov()+" moviles");
		}
	}
	
	public void imprirMovAct() {
		if (comptobarMov()==0) {
			System.out.println("no hay moviles");
		}else {
			for (int i = 0; i < moviles.length; i++) {
				System.out.println("todavia hay estos: "+moviles[i] );
			}
			
		}
	}
	
	
	
	
	
	public Movil[] getMoviles() {
		return moviles;
	}
	public void setMoviles(Movil[] moviles) {
		this.moviles = moviles;
	}
	public double getTotalV() {
		return totalV;
	}
	public void setTotalV(double totalV) {
		this.totalV = totalV;
	}
	@Override
	public String toString() {
		return "Vendedor [moviles=" + Arrays.toString(moviles) + ", totalV=" + totalV + "]";
	}
	
	
	

}
