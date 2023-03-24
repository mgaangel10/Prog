package ejercicio4;

public class LIneaDeVenta {
	
	private Producto produc;
	private int cantidad;
	
	public LIneaDeVenta(Producto produc, int cantidad) {
		super();
		this.produc = produc;
		this.cantidad = cantidad;
	}
	
	public double calcularPrecFin() {
		return produc.calcularPrecio()*cantidad;
	}
	public void imprimirProductos() {
		System.out.println(produc);
	}

	public Producto getProduc() {
		return produc;
	}

	public void setProduc(Producto produc) {
		this.produc = produc;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "[" + produc + ", cantidad=" + cantidad + "]";
	}
	
	
	
	

}
