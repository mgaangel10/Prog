package ejercicio9;

public class Ticket {
	private double precioT;
	private int personas;
	private double precioS;
	private double precioM;
	private double precioG;
	private double precioC;
	private String destino;
	private double cambio;
	public Ticket(double precioT, int personas, double precioS, double precioM, double precioG, double precioC,
			String destino, double cambio) {
		super();
		this.precioT = precioT;
		this.personas = personas;
		this.precioS = precioS;
		this.precioM = precioM;
		this.precioG = precioG;
		this.precioC = precioC;
		this.destino = destino;
		this.cambio = cambio;
	}
	
	//metodos para el cambio
	
		public double cambioS(double dinero) {
			
			return cambio= dinero-precioT;
		}
		public double cambioG(double dinero) {
		
			return cambio= dinero-precioT;
		}
		public double cambioM(double dinero) {
		
			return cambio= dinero-precioT;
		}
		public double cambioC(double dinero) {
			
			return cambio= dinero-precioT;
		}
		
		
		
		//sumar percio total
		
		public double sumaPFS() {
			return precioT=precioS*personas;
		}
		public double sumaPFG() {
			return precioT=precioG*personas;
		}
		public double sumaPFM() {
			return precioT=precioM*personas;
		}
		public double sumaPFC() {
			return precioT=precioC*personas;
		}
		
		//suma de cambios
		
		public double sumCa() {
			return cambio+=cambio;
		}
		
		//imprimir ticket
		
		public void ticketS(String nombre,int personas) {
			System.out.println("------------------------");
			System.out.println("------"+destino+"------");
			System.out.println("------------------------");
			System.out.println("nombre del titular "+nombre);
			System.out.println("numero de personas: "+personas);
			System.out.println("precio total: "+precioT);
			System.out.println("cambio: "+cambio);
		}
		public void ticketG(String nombre, int personas) {
			System.out.println("------------------------");
			System.out.println("------"+destino+"------");
			System.out.println("------------------------");
			System.out.println("nombre del titular "+nombre);
			System.out.println("numero de personas: "+personas);
			System.out.println("precio total: "+precioT);
			System.out.println("cambio: "+cambio);
		}
		public void ticketM(String nombre,int personas) {
			System.out.println("------------------------");
			System.out.println("------"+destino+"------");
			System.out.println("------------------------");
			System.out.println("nombre del titular "+nombre);
			System.out.println("numero de personas: "+personas);
			System.out.println("precio total: "+precioT);
			System.out.println("cambio: "+cambio);
		}
		public void ticketC(String nombre, int personas) {
			System.out.println("------------------------");
			System.out.println("------"+destino+"------");
			System.out.println("------------------------");
			System.out.println("nombre del titular "+nombre);
			System.out.println("numero de personas: "+personas);
			System.out.println("precio total: "+precioT);
			System.out.println("cambio: "+cambio);
		}
		

	
	
	public double getPrecioT() {
		return precioT;
	}
	public void setPrecioT(double precioT) {
		this.precioT = precioT;
	}
	public int getPersonas() {
		return personas;
	}
	public void setPersonas(int personas) {
		this.personas = personas;
	}
	public double getPrecioS() {
		return precioS;
	}
	public void setPrecioS(double precioS) {
		this.precioS = precioS;
	}
	public double getPrecioM() {
		return precioM;
	}
	public void setPrecioM(double precioM) {
		this.precioM = precioM;
	}
	public double getPrecioG() {
		return precioG;
	}
	public void setPrecioG(double precioG) {
		this.precioG = precioG;
	}
	public double getPrecioC() {
		return precioC;
	}
	public void setPrecioC(double precioC) {
		this.precioC = precioC;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public double getCambio() {
		return cambio;
	}
	public void setCambio(double cambio) {
		this.cambio = cambio;
	}
	@Override
	public String toString() {
		return "Ticket [precioT=" + precioT + ", personas=" + personas + ", precioS=" + precioS + ", precioM=" + precioM
				+ ", precioG=" + precioG + ", precioC=" + precioC + ", destino=" + destino + ", cambio=" + cambio + "]";
	}
	
	
	
	
	
	
	
	

}
