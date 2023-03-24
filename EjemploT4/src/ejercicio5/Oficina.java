package ejercicio5;

import java.util.Arrays;



public class Oficina {
	
	private Empleado lista [];

	public Oficina(Empleado[] lista) {
		super();
		this.lista = lista;
	}
	
	public double calcularSueldoDeUnEmpleado(Empleado e) {
		return e.calcularSueldo();
	}
	
	public double sumarSueldos(int numEmp) {
		double total=0.0;
		if (findByIdV2(numEmp)>0) {
			for (int i = 0; i < lista.length; i++) {
			total=total+calcularSueldoDeUnEmpleado(lista[i]);
		}
		}
		
		return total;
	}
	public double calcularSueldo(int javiMeGustas) {
		return lista[javiMeGustas].calcularSueldo();
	}
	
	//find
	public int findByIdV2(int numEmp) {
		int i = 0;
		boolean encontrado = false;

		while (i < lista.length && !encontrado) {
			Empleado deLista = lista[i];
			if (deLista.getNumEmp()==numEmp)
				encontrado = true;
			else
				i++;
		}
		if (encontrado)
			return i;
		else
			return -1;
	}
	//añadir
	
	
	
	
	
	

	public Empleado[] getLista() {
		return lista;
	}

	public void setLista(Empleado[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Oficina [lista=" + Arrays.toString(lista) + "]";
	}
	
	

}
