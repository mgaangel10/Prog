package ejercicio;

public class Gasto {
	
	private String concepto;
	private double Gastado;
	private int identificador;
	public Gasto(String concepto, double totalGastado, int identificador) {
		super();
		this.concepto = concepto;
		this.Gastado = totalGastado;
		this.identificador = identificador;
	}
	
	
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public double getGastado() {
		return Gastado;
	}
	public void setGastado(double totalGastado) {
		this.Gastado = totalGastado;
	}
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	@Override
	public String toString() {
		return "Gasto [concepto=" + concepto + ", totalGastado=" + Gastado + ", identificador=" + identificador
				+ "]";
	}
	
	public int compareTo(Gasto g) {
		if (this.concepto.equalsIgnoreCase(g.getConcepto())
				&&this.Gastado==g.getGastado()
				&&this.identificador==g.getIdentificador()) {
			return 0;
		} else {
			return -1;
		}
	}
	
	
	
	
	

}
