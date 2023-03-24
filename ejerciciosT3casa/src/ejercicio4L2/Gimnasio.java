package ejercicio4L2;

import java.util.Arrays;

public class Gimnasio {
	
	
	private Cliente lista [];
	
	public Gimnasio(Cliente[] lista) {
		super();
		this.lista = lista;
	}
	
	//metodos importantes
	
	public void add(Cliente c,int posicion) {
		lista[posicion]=c;
	}
	
	public void mostrarTodo() {
		for (int i = 0; i < lista.length; i++) {
			System.out.println((i+1)+". "+lista[i]);
		}
		
	}
	//metodos normales
	
	
	
	
	//metodos buscar
	public Cliente findById(String dni) {
		int i =0;
		boolean encontrado=false;
		while (i<lista.length && !encontrado) {
			Cliente delista=lista[i];
			if (delista.getDni().equalsIgnoreCase(dni)) {
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
	
	@Override
	public String toString() {
		return "Gimnasio [lista=" + Arrays.toString(lista) + "]";
	}

	public int findById2(String dni) {
		int i =0;
		boolean encontrado=false;
		while (i<lista.length && !encontrado) {
			Cliente delista=lista[i];
			if (delista.getDni().equalsIgnoreCase(dni)) {
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
	
	public int buscarPorClient(Cliente c) {
		int i=0;
		boolean encontrado=false;
		while (i<lista.length && !encontrado) {
			Cliente delista=lista[i];
			if (c.compareTo(delista)==0) {
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
	
	
	
	public void darbaja(Cliente c) {
		int index=buscarPorClient(c);
		if (index>=0) {
			lista[index].setActivo(false);
		}
	}
	
	
	
	public void imprimirSoloActivos () {
		
		for(int i=0; i<lista.length && lista[i]!=null;i++) {
			if (lista[i].isActivo()) {
				System.out.println((i+1)+". "+lista[i]);
			}
			
				
		}
	}
	
	public void calcularIMCGym() {
		double suma=0,total;
		
		for (int i = 0; i < lista.length && lista[i]!=null; i++) {
			suma+=lista[i].getPeso()/lista[i].getAltura();
		}
		total=suma/lista.length;
		
		System.out.printf("EL IMC total del Gimnasio es de %2.2f \n",total);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



	public Cliente[] getLista() {
		return lista;
	}





	public void setLista(Cliente[] lista) {
		this.lista = lista;
	}





	





	
	
	
	
	
	
	
	
	
	
	

	

}
