package ejercicioEntrenamiento;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//otramanera
		int num=4,den=6;
		Racional r2=new Racional (1,2);
		Racional r3=new Racional (4,3);
		Racional ftotal;
		Operador op1=new Operador();
		ftotal=op1.multiplicar(r2, r3);
		System.out.println("resultado"+ftotal);
		op1.cambiarSig(num, den);
		op1.imprimirFraccion(ftotal);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
