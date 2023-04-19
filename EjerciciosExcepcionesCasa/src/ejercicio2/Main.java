package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)throws Tamaño,Letra {
		// TODO Auto-generated method stub
		String matricula;
		int op=0;
		do {
			try {
			
			Scanner s = new Scanner  (System.in);
		System.out.println("diga la matricula");
		matricula= s.nextLine();
		if (matricula.length()!=7) {
			throw new Tamaño ();
		}
		if (!matricula.substring(1).matches("[^A-Za-z]*")) {
			throw new Letra ();
		}
		op++;
		}catch (Letra l) {
			// TODO: handle exception
			System.err.println("el primer caracter no es una letra");
		}
		catch (Tamaño t) {
			// TODO: handle exception
			System.err.println("el tamaño de la matricula no es correcto");
		} 
		catch (Exception e) {
			// TODO: handle exception
		}
		} while (op==0);
		System.out.println("Perfecto la matricula es CORRECTA");
		
		
		
		
		

	}

}
