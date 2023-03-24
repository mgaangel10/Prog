package ejercicio6;

import java.util.Arrays;

public class Oficina {
	
	private Cuentas [] lista;

	public Oficina(Cuentas[] lista) {
		super();
		this.lista = lista;
	}
	public double calcularPagoDeUnaCuenta(Cuentas e) {
		return e.calcularPago();
	}
	
	public double sumarSueldos(int numEmp) {
		double total=0.0;
		
			for (int i = 0; i < lista.length; i++) {
			total=total+calcularPagoDeUnaCuenta(lista[i]);
		
		}
		
		return total;
	}
	
	public double calcularSueldo(int javiMeGustas) {
		return lista[javiMeGustas].calcularPago();
	}
	
	

	public Cuentas[] getLista() {
		return lista;
	}

	public void setLista(Cuentas[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Oficina [lista=" + Arrays.toString(lista) + "]";
	}
	
	
	

}
