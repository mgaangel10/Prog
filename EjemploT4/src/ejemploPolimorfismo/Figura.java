package ejemploPolimorfismo;

public abstract class Figura {
	
	private String color,nombre;

	public Figura() {
		super();
	}

	public Figura(String color, String nombre) {
		super();
		this.color = color;
		this.nombre = nombre;
	}
	
	public abstract double calcularArea();
	
	public abstract double calcularPerimetro();
	
	public void metodSoloDeFigura () {
		System.out.println("solo estoy en la clase figura ,sin sobreescribir en las hijas");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Figura [color=" + color + ", nombre=" + nombre + "]";
	}
	
	

}
