package ejemplocrud;

public class CrudProducto {
	
	private Producto [] lista;

	
	
	
	//solo lo vamos a hacer en este caso
	public CrudProducto() {
		int cuatro=4;
		lista = new Producto [cuatro];
	}
	
	public void add(Producto p, int posicion) {
		lista[posicion]=p;
	}
	
	public CrudProducto(Producto [] lista) {
		this.lista=lista;
	}
	
	
	//para modificar el precio del producto
		
	public void editPrecio(String codigo,float precioN) {
		int index=findByIdV2(codigo);
		if (index>=0) {
			lista[index].setPrecioUnitario(precioN);
		}
	}
	
	//mostrar todos los productosde la lista
	
	public void imprimirTodosLosProductos() {
		for (int i = 0; i < lista.length; i++) {
			System.out.println((i+1)+". "+lista[i]);
		}
	}
	//metodo mostrar solos productos cuyo atributo activo es true 
	// esta a la venta
	
	public void imprimirSoloActivos() {
		for (int i = 0; i < lista.length && lista[i]!=null; i++) {
			if (lista[i].isActivo()) {
				System.out.println((i+1)+". "+lista[i]);
			}
		}
	}
	
	//metodos buscar
	
	public Producto findById(String codigo) {
		int i = 0;
		boolean encontrado = false;
		while (i < lista.length && !encontrado) {
			Producto deLista = lista[i];
			if (deLista.getCodigo().equalsIgnoreCase(codigo)) {
				 
			}else {
				i++;
			}
		
		}
		if (encontrado) {
			return lista[i];
		}else {
			return null;
		}
		
	}
	
	
	
	//metodo borrar
	
	public void delete(Producto p) {
		int index=findProduct(p);//devuelve el indice del array
		if (index>=0) {
			lista[index].setActivo(false);
		}
	}
	
	//segunda forma para buscar
	
	public int findByIdV2(String codigo) {
		int i = 0;
		boolean encontrado = false;
		while(i<lista.length && !encontrado) {
			Producto deLista = lista[i];
			if (deLista.getCodigo().equalsIgnoreCase(codigo)){
				encontrado = true;
				
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
	//un buscador de todo es decir devuele la lista de producto
	
	
	public Producto [] findAll() {
		return lista;
	}
	
	public int findProduct(Producto p) {
		int i =0;
		boolean encontrado= false;
		while (i<lista.length && !encontrado) {
			Producto deLista=lista[i];
			if (p.compareTo(deLista)==0) {
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
	
	
	

	public Producto[] getLista() {
		return lista;
	}

	public void setLista(Producto[] lista) {
		this.lista = lista;
	}
	
	 

	
	
}
