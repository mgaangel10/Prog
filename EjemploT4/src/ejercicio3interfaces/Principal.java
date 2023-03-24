package ejercicio3interfaces;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double [] num;
			num = new double [5];
		ArrayReales ar;
		
		ar=new ArrayReales(num);
		
		ar.cargar();
		ar.imprimirArray();
		System.out.println("------------");
		
		System.out.println(ar.calcularMAximo());
		System.out.println(ar.calcularMinimo());
		System.out.println(ar.calcularsuma());
		
		

	}

}
