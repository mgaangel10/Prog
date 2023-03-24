package ejercicio4bienhecho;

public class Venta {
	
	private LineaDeVenta[] lista;
	//Constructor

	public Venta(LineaDeVenta[] lista) {
		super();
		this.lista = lista;
	}
	
	//Methods
	public double precioTotal() {
		double precioT = 0;
		for(int i = 0 ; i < lista.length && lista[i]!=null; i++) {
			precioT += lista[i].precioTotal();
		}
		return precioT;
	}
	//esto es tu metod de sumarTodos los productos
	// y este seria el resultado de todo esto
	// nono este es mi ejercicio ha compilado mi ejercicio por la cara

}
