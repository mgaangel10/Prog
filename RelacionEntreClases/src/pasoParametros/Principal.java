package pasoParametros;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int x=1;
		int y=2;
		System.out.println("valores de x e y antes de la modificacion");
		System.out.println(" x = "+x+"; y = "+y);
		modifyPrimitiveTypes(x, y);
		System.out.println("valores de x e y despues de la modificacion");
		System.out.println("x="+x+"; y="+y);
		
		
		
		
		

	}

	private static void modifyPrimitiveTypes(int x, int y) {
		// TODO Auto-generated method stub
		x=5;
		y=10;
		
	}

}
