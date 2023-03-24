package ejercicio4bienhecho;

public class Mostrar {
	
public Mostrar() {
		
	}
//esto es lo que imprime el menu 
	//Methods
	public void mostrarMenu() {
		System.out.println("----------------MENU----------------");
		System.out.println("1. Imprmir ticket");
		System.out.println("2. Mostrar todos los productors");
		System.out.println("-----------------------------------");
	}
	public void mostrarProductos(LineaDeVenta [] lista) {
		for(int i = 0; i < lista.length; i++) {
			if(lista[i] == null) {
				System.out.println((i+1) + ". Sin datos");
			}else {
				System.out.println((i+1) + ". " + lista[i].getPr());
			}
		}
		//ha puesto que si es null en vez de null ponga sin datos sabes?
	}
	//esto es el ticket RECUERDA que el resultado es un ticket
	//esta clase solo sierve para imprimirno tine claculos esto perfectamente se puede hacer hacer en el main 
	//pero el javi se cree guay
	public void mostrarTicket(Venta ven, LineaDeVenta [] lista, String fecha) {
		System.out.println("---------------------------------------------------");
		System.out.println("Att Don Ramones Supermecado");
		System.out.println("Dia " + fecha);
		System.out.println("---------------------------------------------------");
		System.out.println("Cant \t Producto \t Precio \t Total");//que, no ha salido lo que tenianqe dalir ah no claro
		for(int i = 0; i< lista.length; i++) {//es aqui
			System.out.println(lista[i].getCant() + " \t " + lista[i].getPr().getNombre() + " \t " + lista[i].getPr().getPrecioUnit() + " \t\t " + lista[i].precioTotal());
		}
		//nada nada me e confido aro a echo un y ha dicho si por ejemplo el tamaño del array es de 5 y hay 3 cosas metidas si algo es nulo no tendria que aparecer en el ticket
		System.out.println("---------------------------------------------------");
		System.out.printf("Precio total: %.2f \n", ven.precioTotal());
		System.out.println("Gracias por su visita");
		System.out.println("---------------------------------------------------");
		
	}
	//sale error por que el tamño del array es mas grande que lo que hay mira joe espera

}
//sale sin datos porque el javi a puesto esto