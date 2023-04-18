package ejercicio1;

public class Caja {
	private int numVentas;
	private int numTickets;
	private int numOperRealizadas;
	private double dineroCaja;
	private String codigoEmpleado;
	
	public Caja(int numVentas, int numTickets, int numOperRealizadas, double dineroCaja, String codigoEmpleado) {
		super();
		this.numVentas = numVentas;
		this.numTickets = numTickets;
		this.numOperRealizadas = numOperRealizadas;
		this.dineroCaja = dineroCaja;
		this.codigoEmpleado = codigoEmpleado;
	}

	public void codigoEmpl()throws Codigo {
		char letra;
		if (codigoEmpleado.length()!= 5) {
			throw new Codigo();
		}
		letra= codigoEmpleado.charAt(0);
		if (!Character.isLetter(letra)) {
			throw new Codigo();
		}
		
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

	public String getCodigoEmpleado() {
		return codigoEmpleado;
	}

	public void setCodigoEmpleado(String codigoEmpleado) {
		this.codigoEmpleado = codigoEmpleado;
	}

	@Override
	public String toString() {
		return "Caja [numVentas=" + numVentas + ", numTickets=" + numTickets + ", numOperRealizadas="
				+ numOperRealizadas + ", dineroCaja=" + dineroCaja + ", codigoEmpleado=" + codigoEmpleado + "]";
	}
	
		
	
	 
	

		
	
	
	

}
