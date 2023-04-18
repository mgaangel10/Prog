package ejercicio1;

public class Caja {
	private int numVentas;
	private int numTickets;
	private int numOperRealizadas;
	private double dineroCaja;
	public Caja(int numVentas, int numTickets, int numOperRealizadas, double dineroCaja) {
		super();
		this.numVentas = numVentas;
		this.numTickets = numTickets;
		this.numOperRealizadas = numOperRealizadas;
		this.dineroCaja = dineroCaja;
	}
	
	public void hacerCaja()throws Exception {
			if (numVentas!=dineroCaja) {
		throw new Exception ();
		}	
	}
	
	public void numVentas () throws ExceptionS{
		if (numVentas!=numTickets) {
			throw new ExceptionS();
		}
	}
	public void numDineroYTickets() throws NumDinero {
		if (dineroCaja!=numTickets) {
			throw new NumDinero();
		}
	}
	public void operaciones()throws Operar {
		if (numOperRealizadas!=numVentas || numOperRealizadas!=numTickets || numOperRealizadas!=dineroCaja) {
			
		}
		throw new Operar();
	}
	
		
	
	 
	public int getNumVentas() {
		return numVentas;
	}
	public void setNumVentas(int numVentas) {
		this.numVentas = numVentas;
	}
	public int getNumTickets() {
		return numTickets;
	}
	public void setNumTickets(int numTickets) {
		this.numTickets = numTickets;
	}
	public int getNumOperRealizadas() {
		return numOperRealizadas;
	}
	public void setNumOperRealizadas(int numOperRealizadas) {
		this.numOperRealizadas = numOperRealizadas;
	}
	public double getDineroCaja() {
		return dineroCaja;
	}
	public void setDineroCaja(double dineroCaja) {
		this.dineroCaja = dineroCaja;
	}
	@Override
	public String toString() {
		return "Caja [numVentas=" + numVentas + ", numTickets=" + numTickets + ", numOperRealizadas="
				+ numOperRealizadas + ", dineroCaja=" + dineroCaja + "]";
	}

		
	
	
	

}
