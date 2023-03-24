package ejercicioEntrenamiento;

public class Operador {
	
	
	public Operador() {
		
	}

	
	
	
	public Racional multiplicar(Racional r2, Racional r3) {
		return new Racional(r2.getNumerador()*r3.getNumerador(),r2.getDenominador()*r3.getDenominador());
	}
	
	public Racional cambiarSig(int num, int den) {
		return new Racional(-num,den);
	}
	
	public void imprimirFraccion(Racional r) {
		System.out.println(r.getNumerador()+"/"+r.getDenominador());
	}
	
	
}
