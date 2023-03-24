package ejercicio4;

import java.util.Arrays;

public class Venta {
	 private LIneaDeVenta [] lista;

	public Venta(LIneaDeVenta[] lista) {
		super();
		this.lista = lista;
	}
	
	
	public double sumarTodo() {
		double total=0.0;
		for (int i = 0; i < lista.length; i++) {
			total+=lista[i].calcularPrecFin();
		}
		return total;
	}
	
	public void imprimirTicket(LIneaDeVenta [] l) {
		System.out.println("*********************");
		System.out.println("Atendido por: Paco");
		System.out.println("*********************");
		System.out.println("******Productos******");
		
		for (int i = 0; i < l.length; i++) {
			System.out.println("Nombre: "+l[i].getProduc().getNombre()+"  -  Precio: "+l[i].getProduc().getPrecioUni()+"€  -  Cantidad "+l[i].getCantidad());
		}
		System.out.println("total de la compra: "+sumarTodo()+"€");
		
		
	}
	
	public void imprimirCesta() {
		for (int i = 0; i < lista.length; i++) {
			System.out.println((i+1)+", "+lista[i]);
		}
	}
	
	//find
	
	public int find(String nombre) {
		int i =0;
		boolean encontrado = false;
		while (i<lista.length && !encontrado) {
			LIneaDeVenta deLista=lista[i];
			if (deLista.getProduc().getNombre().equalsIgnoreCase(nombre)) {
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
	
	public void imprimirBuscado(String nombre) {
		
				System.out.println(lista[find(nombre)]);
			
	}
	
	public void dardebjaa(String nombre) {
		int aux = find(nombre);
		if (aux>=0) {
			lista[aux].getProduc().setPrecioUni(0);
		}
	}
	
	
	
	
	

	public LIneaDeVenta[] getLista() {
		return lista;
	}

	public void setLista(LIneaDeVenta[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Venta [lista=" + Arrays.toString(lista) + "]";
	}
	 
	 
	
	

}
