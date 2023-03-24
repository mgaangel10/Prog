package ejercicio;

import java.util.Arrays;
import java.util.Iterator;

public class GestionGastos {
	
	private Gasto lista [];
	private double totalGastado;
	
	
	public GestionGastos(Gasto[] lista, double totalGastado) {
		super();
		this.lista = lista;
		this.totalGastado = totalGastado;
	}
	//METODOS ADD Y LISTAR
	
	public void add(Gasto g,int posicion) {
		lista[posicion]=g;
	}
	
	public void listarTodo() {
		for (int i = 0; i < lista.length; i++) {
			System.out.println((i+1)+". "+lista[i]);
		}
	}
	//METODOS 
	
	public Gasto findById(int identificador) {
		int i=0;
		boolean encontrado=false;
		while (i<lista.length && !encontrado) {
			Gasto delista=lista[i];
			if (delista.getIdentificador()==identificador) {
				encontrado=true;
			} else {
				i++;
			}
		}
		if (encontrado) {
			return lista[i];
		} else {
			return null;
		}
	}
	
	public int findById2(int identificador) {
		int i=0;
		boolean encontrado=false;
		while (i<lista.length && !encontrado) {
			Gasto delista=lista[i];
			if (delista.getIdentificador()==identificador) {
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
	public Gasto buscarPorGasto(Gasto g) {
		int i=0;
		boolean encontrado=false;
		while (i<lista.length && !encontrado) {
			Gasto delista=lista[i];
			if (delista.compareTo(g)==0) {
				encontrado=true;
			} else {
				i++;
			}
		}
		if (encontrado) {
			return lista[i];
		} else {
			return null;
		}
	}
	
	public void editGasto(int identificador,double gastoNew) {
		int index=findById2(identificador);
		if (index>=0) {
			lista[index].setGastado(gastoNew);
		}
	}
	
	
	
	
	public void imprirSoloGast() {
		for (int i = 0; i < lista.length && lista[i]!=null; i++) {
			if (lista[i].getGastado()>0) {
				System.out.print("Gasto "+(i+1)+": "+lista[i].getGastado()+" € \t");
			}
			
		}
		System.out.println(" ");
	}
	public void imprirSoloConcep(String concepto) {
		for (int i = 0; i < lista.length && lista[i]!=null; i++) {
			if (lista[i].getConcepto().equalsIgnoreCase(concepto)) {
				System.out.println((i+1)+". "+lista[i]);
			}
			
		}
		System.out.println(" ");
	}
	
	public double calcularTotalGastado() {
		double suma=0.0;
		for (int i = 0; i < lista.length && lista[i]!=null; i++) {
			suma+=lista[i].getGastado();
		}
		totalGastado+=suma;
		return totalGastado;
		
	}
	
	public double calcularSaldoFinal(double presupuesto) {
		double total=0.0;
		
		total= presupuesto-totalGastado ;
		return total;
	}
	
		
	public void imprimirTotalGastado() {
		System.out.println("su total gastado es de: "+calcularTotalGastado());
	}
	public void imprimriYaGastados() {
		for (int i = 0; i < lista.length && lista[i]!=null
				; i++) {
			if (lista[i].getGastado()>0) {
				System.out.println((i+1)+". "+lista[i]);
			}
		}
	}
	
	
	
	public Gasto[] getLista() {
		return lista;
	}
	public void setLista(Gasto[] lista) {
		this.lista = lista;
	}
	public double getTotalGastado() {
		return totalGastado;
	}
	public void setTotalGastado(double totalGastado) {
		this.totalGastado = totalGastado;
	}
	@Override
	public String toString() {
		return "GestionGastos [lista=" + Arrays.toString(lista) + ", totalGastado=" + totalGastado + "]";
	}
	
	

}
