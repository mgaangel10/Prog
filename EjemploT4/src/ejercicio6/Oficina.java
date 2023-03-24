package ejercicio6;

import java.util.Arrays;

public class Oficina implements IEstadisticas{
	
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
	public double  sumarTodo() {
		double total=0.0;
		for (int i = 0; i < lista.length && lista[i] !=null; i++ ) {
			total+=lista[i].calcularPago();
		}
		return total;
	}
	
	public double calcularSueldo(int posicion) {
		return lista[posicion].calcularPago();
	}
	
	public void imprimirCuentas() {
		for (int i = 0; i < lista.length; i++) {
			System.out.println(i+1+". "+lista[i]);
		}
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
	//entra 100% lo que hace es buscar las cuentas que tiene  mayor saldo dde 100 creo
	@Override
	public Cuentas[] bucarSaldoMayorQue(double tope) {
		// TODO Auto-generated method stub si no tiene te paso el ejercicio ?y lo ves queme voy a iur a comerenga te lo paso ya
		Cuentas [] aux = new Cuentas [lista.length];
		
		for (int i = 0; i < lista.length && lista[i]!=null; i++) {
			if (lista[i].getSaldo()>tope) {
				aux[i]=lista[i];
			}
		}
		return aux;
	}
	
	
	

}
