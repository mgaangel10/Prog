package ejercicio1;

import java.util.Arrays;

public class Taquilla {
	
	private EntradasNormales [] lista;

	public Taquilla(EntradasNormales[] lista) {
		super();
		this.lista = lista;
	}
	
	public double totalRecaudado(double cantidad,double descuento) {
		double total=0.0;
		for (int i = 0; i < lista.length; i++) {
			total+=lista[i].calcularPrecio(cantidad,descuento);
		}
		return total;
	}
	
	public void imprimirEntradas() {
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
	}
	public void encontrarEntrada(String nombre) {
		
			System.out.println(lista[buscarPorNombre(nombre)]);
		
		
	}
	
	
	
	public int buscarPorNombre(String nombre) {
		int i = 0;
		boolean encontrado = false;
		while (i<lista.length && !encontrado) {
			EntradasNormales deLista= lista[i];		
			if (deLista.getNombre().equalsIgnoreCase(nombre)) {
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
		System.out.println(lista[buscarPorNombre(nombre)]);
	}
	
	public void imprimirPrecio(String nombre,double cantidad,double descuento) {
		System.out.println("el precio es de: ");
		System.out.println(lista[buscarPorNombre(nombre)].calcularPrecio(cantidad, descuento));
	}
	
	public void cancelarEntrada(String nombre) {
		int aux = buscarPorNombre(nombre);
		if (aux>=0) {
			lista[aux].setZona1(false);
			lista[aux].setZona2(false);
		}
	}
	
	public double totalRecaudadoPoriva(double iva) {
		double total=0.0;
		for (int i = 0; i < lista.length; i++) {
			total+=lista[i].calcularIva(iva);
		}
		return total;
	}
	public double sumarZona1(double cantidad,double descuento) {
		double total=0.0;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i].isZona1()) {
				total+=lista[i].calcularPrecio(cantidad, descuento);
			}
		}
		return total;
	}
	
	public void verTotalDeZona1(double cantidad,double descuento) {
		System.out.println(sumarZona1(cantidad, descuento));
		
	}
	
	
	
	

	public EntradasNormales[] getLista() {
		return lista;
	}

	public void setLista(EntradasNormales[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Taquilla [lista=" + Arrays.toString(lista) + "]";
	}
	
	

}
