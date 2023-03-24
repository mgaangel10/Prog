package ejercicio3L2;

import java.util.Arrays;





public class Vendedor {
	
	private  Movil  moviles [];
	private int totalV;
	
	public Vendedor(Movil[] moviles, int totalV) {
		super();
		this.moviles = moviles;
		this.totalV = totalV;
	}
	
	//METODOS IMPORTANTES 
	public void add(Movil m,int posicion) {
		moviles[posicion]=m;
	}
	
	public void listarMov() {
		for (int i = 0; i < moviles.length; i++) {
			System.out.println((i+1)+ ". "+ moviles[i]);
		}
	}
	
	public int findByIdV2(String marca) {
		int i = 0;
		boolean encontrado = false;

		while (i < moviles.length && !encontrado) {
			Movil deLista = moviles[i];
			if (deLista.getMarca().equalsIgnoreCase(marca))
				encontrado = true;
			else
				i++;
		}
		if (encontrado)
			return i;
		else
			return -1;
	}
	
	public void editPrecio(String marca, double  precioNew) {
		int index = findByIdV2(marca);
		if (index >= 0) {
			moviles[index].setPrecioUni(precioNew);
			
		} 

	}
	public void imprimirSoloActivos () {
		
		for(int i=0; i<moviles.length && moviles[i]!=null;i++) {
			if (moviles[i].isVendido()) {
				System.out.println((i+1)+". "+moviles[i]);
			}
			
				
		}
	}
	
	//empieza aqui
	
	public Movil findid(String marca) {
		int i= 0;
		boolean encontrado=false;
		while (i<moviles.length && !encontrado) {
			Movil delista=moviles[i];
			if (delista.getMarca().equalsIgnoreCase(marca)) {
				encontrado = true;
			} else {
				i++;
			}
		}
		if (encontrado) {
			return moviles[i];
		} else {
			return null;
		}
	}
	
	public int fidv2(String marca) {
		int i =0;
		boolean encontrado=false;
		while (i<moviles.length && !encontrado) {
			Movil delista=moviles[i];
			if (delista.getMarca().equalsIgnoreCase(marca)) {
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
	
	public void soloact() {
		for (int i = 0; i < moviles.length && moviles[i]!=null; i++) {
			if (moviles[i].isVendido()) {
				System.out.println((i+1)+". "+moviles[i]);
			}
		}
	}
	
	public int bucarprod(Movil m) {
		int i=0;
		boolean encontrado=false;
		while (i<moviles.length && !encontrado) {
			Movil delista=moviles[i];
			if (m.compareTo(delista)==0) {
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
	
	public void debaja(Movil m) {
		int index =bucarprod(m);
		if (index>=0) {
			moviles[index].setVendido(false);+
		}
	}
	
	public void edit(String marca,double precioN) {
		int index= fidv2(marca);
		if (index>=0) {
				moviles[index].setPrecioUni(precioN);
		}
		
		
	}
	
	
	
	
	
	
	


	

	
	public Movil[] getMoviles() {
		return moviles;
	}
	public void setMoviles(Movil[] moviles) {
		this.moviles = moviles;
	}
	public int getTotalV() {
		return totalV;
	}
	public void setTotalV(int totalV) {
		this.totalV = totalV;
	}
	@Override
	public String toString() {
		return "Vendedor [moviles=" + Arrays.toString(moviles) + ", totalV=" + totalV + "]";
	}
	
	

	
	

}
