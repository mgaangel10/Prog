package ejercicio4bienhecho;

public class Alimentacion extends Producto{
	private int diaCaducidad;
	private boolean descontado;
	//Constructor

	public Alimentacion(double precioUnit, String nombre, String id, int caducidad, boolean des) {
		super(precioUnit, nombre, id);
		this.diaCaducidad = caducidad;
		this.descontado = des;
	}
	//Getter and setter

	public int getCaducidad() {
		return diaCaducidad;
	}

	public void setCaducidad(int caducidad) {
		this.diaCaducidad = caducidad;
	}
	//toString
//nos ha flatado poner el mensaje de la caducidad en el enunciadod ecia que si le faltaba -de 2 dias para caducar que le saliera un mensaje 
	//voy, terminaos de un par de cosas aqui y te lo enseño
	@Override
	public String toString() {
		return "Alimentacion [caducidad=" + diaCaducidad + ", toString()=" + super.toString() + "]";
	}
	//Methods
	public void comprobarCad(int diaFecha) {
		if((diaCaducidad - diaFecha) <= 2) {
			descontado = true;
		}else {
			descontado = false;
		}
	}
	// lo que ha echo el nota esqeu como va sobrado ha creado una fecha y a echo la resta y si esa fecha es menor que dos pues hace o  no el if 
	// lo de descontado true es simplemente que en el atributo este el resultado le salga en la variable descontado true o false 
	// si tu pones return true cuando llames al metod en le main el metodo va ser true o faklse NO la variable la variable mo tiene nada 
	// lo puede hacer como quieras a vgusto de consumir , hombre asi como el javi esta mas elegante
	
	public void mostrarAviso(int diaFecha) {
		if(descontado) {
			System.out.println("Al producto le quedan 2 días o menos para caducar");
		}else {
			System.out.println("El producto tiene un margen amplio de caducidad");
		}
	}
	public double calcularPVP() {
		double desc = 0.15;
		if(descontado) {
			return super.getPrecioUnit() *(1-desc);
		}else {
			return super.getPrecioUnit();
		}
	}

}
