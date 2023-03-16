package ejercicio1;

public class Calculadora {
	private int numMayor;
	private int numMenor;
	public Calculadora(int numMayor, int numMenor) {
		super();
		this.numMayor = numMayor;
		this.numMenor = numMenor;
	}
	
	public int sumar() {
		return numMayor+numMenor;
	}
	public int restar() {
		return numMayor-numMenor;
	}
	public int multiplicar() {
		return numMayor*numMenor;
	}
	public int dividir() {
		return numMayor/numMenor;
	}
	
	
	public int getNumMayor() {
		return numMayor;
	}
	public void setNumMayor(int numMayor) {
		this.numMayor = numMayor;
	}
	public int getNumMenor() {
		return numMenor;
	}
	public void setNumMenor(int numMenor) {
		this.numMenor = numMenor;
	}
	@Override
	public String toString() {
		return "Calculadora [numMayor=" + numMayor + ", numMenor=" + numMenor + "]";
	}
	
	

}
