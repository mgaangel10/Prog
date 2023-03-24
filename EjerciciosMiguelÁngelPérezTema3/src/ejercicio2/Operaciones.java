package ejercicio2;

public class Operaciones {
	int num;
	
	public Operaciones() {
		
	}
	public Operaciones(int num) {
		this.num=num;
	}
	
	
	public boolean comprobarPos(int num) {
		int tope=0;
				if(num>=tope) {
					return true;
				}else {
					return false;
				}
	}
	public void imprimir(boolean b) {
		if(comprobarPos(num)) {
			System.out.println("positivo");
		}else {
			System.out.println("negativo");
		}
	}
   
}
