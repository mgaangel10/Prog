package ejerciciorepaso;

import java.util.Objects;

public class Cuenta {
	
	private Cliente c;
	
	
	public Cuenta(Cliente c) {
		super();
		this.c = c;
	}
	
	public double calcularSaldo() {
		return c.getSaldo();
		
		
	}

	public Cliente getC() {
		return c;
	}

	public void setC(Cliente c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "Cuenta [c=" + c + "]";
	}

	

	
	

	
	


	
	
	
	
	

}
