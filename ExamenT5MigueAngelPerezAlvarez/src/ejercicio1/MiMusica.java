package ejercicio1;

import java.util.Iterator;
import java.util.List;

public class MiMusica {
	private List<Cancion> listado;

	public MiMusica(List<Cancion> listado) {
		super();
		this.listado = listado;
	}
	
	public void agregar(Cancion c) {
		listado.add(c);
	}
	
	public Cancion findByNombre(String titulo) {
		Iterator<Cancion> it = listado.iterator();
		Cancion c;
		while(it.hasNext()) {
			c=it.next();
			if (c.getTitulo().equalsIgnoreCase(titulo)) {
				return c;
			}
			
		}
		return null;
	}
	public Cancion editGra(String interprete) {
		Iterator<Cancion> it = listado.iterator();
		Cancion c;
		while(it.hasNext()) {
			c=it.next();
			if (c.getInterprete().equalsIgnoreCase(interprete)) {
				c.setGratis(false);
				return c;
			}
			
		}
		return null;
	}
	public void mostrarBuscado(String interprete) {
		System.out.println(editGra(interprete));
	}
	
	public void mostrarGratis(Boolean gratis) {
		for(Cancion c :listado  ) {
			if (c.isGratis()) {
				System.out.println(c);
			}
		}
	}
	public Cancion FindMaDur(Cancion c1) {
		Iterator<Cancion> it = listado.iterator();
		
		Cancion c;
		
		while(it.hasNext()) {
			c=it.next();
			for(Cancion c3:listado) {
				if (c.getDuracion()>c1.getDuracion()) {
				return c;
			}
			}
			
			
		}
		return null;
	}
	public Cancion FindMaEscu(Cancion c1) {
		Iterator<Cancion> it = listado.iterator();
		
		Cancion c;
		
		while(it.hasNext()) {
			c=it.next();
			for(Cancion c3:listado) {
				if (c.getNumVecesEscuchada()>c1.getNumVecesEscuchada()) {
				return c;
			}
			}
			
			
		}
		return null;
	}

	
	
	public void mostrar() {
		for(Cancion c: listado) {
			System.out.println(c);
		}
	}
	public double calcularDurMedia() {
		double total=0.0,suma=0.0;
		
		for(Cancion c:listado) {
			suma+=c.getDuracion();
			total=suma/listado.size();
		}
		return total;
	}
	public void edit(Cancion c,String interprete) {
		listado.indexOf(findByNombre(interprete));
		System.out.println();
		
	}
	public void imprimirBuscado(String titulo) {
		;
		System.out.println(findByNombre(titulo));
	}
	

	public List<Cancion> getListado() {
		return listado;
	}

	public void setListado(List<Cancion> listado) {
		this.listado = listado;
	}

	@Override
	public String toString() {
		return "MiMusica [listado=" + listado + "]";
	}
	
	

}
