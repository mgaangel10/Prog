package ejercicio6L2;

import java.util.Arrays;



public class Sala {
	private int numeroId;
	private int numLocal;

	private Entrada entr [];
	
	
	public Sala(int numeroId, int numLocal,Entrada [] entr) {
		super();
		this.numeroId = numeroId;
		this.numLocal = numLocal;
		this.entr=entr;
		
		
	}
	
	public Sala() {
		
		
	}
	//LISTAR LAS ENTRADAS
	public void listar() {
		for (int i = 0; i < entr.length; i++) {
			System.out.println((i+1)+". "+entr[i]);
		}
	}
	//METODOS
	public void add(Entrada entrada, int posicion) {
		entr[posicion] = entrada;
	}
	
	public double [] comprar(int cantidad) {
		double [] entrada;
		entrada = new double [cantidad];
		for (int i = 0; i < entrada.length; i++) {
			entrada[i]= entr[i].getPrecio() * cantidad;
		}
		return entrada;
	}
	
	public void imprir(double[] entrada) {
		for (int i = 0; i < entr.length; i++) {
			System.out.println("resultado:"+entrada[i]);
		}
	}
	// COMPROBAR BUTACA
	
	public Entrada findById(String butaca) {
		int i=0;
		boolean encontrado=false;
		while (i<entr.length && !encontrado) {
			Entrada en=entr[i];
			if (en.getButaca().equalsIgnoreCase(butaca)) {
				encontrado=true;
			} else {
				i++;
			}
			
			}
		if (encontrado) {
			return entr[i];
		}else {
			return null;
		}
	}
	//COMPROBAR NUMID
		public Entrada findByIdNum(String numIdE ) {
			int i=0;
			boolean encontrado=false;
			while (i<entr.length && !encontrado) {
				Entrada en=entr[i];
				if (en.getNumIdE().equalsIgnoreCase(numIdE)) {
					encontrado=true;
				} else {
					i++;
				}
				
				}
			if (encontrado) {
				return entr[i];
			}else {
				return null;
			}
		
	}
	

	
	
	
	
	
	
	
	//TOSTRING
	
	@Override
	public String toString() {
		return "Sala [numeroId=" + numeroId + ", numLocal=" + numLocal + ", entr=" + Arrays.toString(entr) + "]";
	}

	public int getNumeroId() {
		return numeroId;
	}


	public void setNumeroId(int numeroId) {
		this.numeroId = numeroId;
	}


	public int getNumLocal() {
		return numLocal;
	}


	public void setNumLocal(int numLocal) {
		this.numLocal = numLocal;
	}


	public Entrada[] getEntr() {
		return entr;
	}


	public void setEntr(Entrada[] entr) {
		this.entr = entr;
	}
	
	
	
	
	
	
	
	
	
}
