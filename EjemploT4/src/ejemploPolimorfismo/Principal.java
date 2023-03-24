package ejemploPolimorfismo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//prueba con objetos sueltos
		Cuadrado cu=new Cuadrado("Primer cuadrado","rojo",1.0);
		Circulo ci=new Circulo("primer circulo","azul",1.0);
		
		System.out.println(cu);
		System.out.println(ci);
		
		System.out.println("*************Area y perimetro*****************");
		System.out.println("Área 1 cuadrado: "+cu.calcularArea());
		System.out.println("Perimetro 1 circulo: "+ci.calcularArea());
		
		//prueb con polimorfismo
		System.out.println("******************************");
		System.out.println("****************************prueba de arrays con objetos**********************************");
		Figura lista []= new Figura [4];
		
		lista[0]= new Cuadrado ("Un mísero cuadrado", "negro", 2.0);
		lista[1]= new Circulo ("Un mísero círculo", "blanco", 2.0);
		lista[2]= new Circulo ("Un círculo grisáceo", "gris", 2.0);
		lista[3]= new Cuadrado ("Un cuadrado desnudo", "transparente", 2.0);
		
		for (int i=0; i<lista.length;i++){
			System.out.println(lista[i]);
			}
			
			Operaciones of= new Operaciones ();
			for (int i=0; i< lista.length;i++){
			System.out.printf("El área del "+ (i+1)+ " es: %.2f \n",of.calcularElAreaDeUnaFigura (lista[i]));
			}
			System.out.printf("La suma de todas las áreas es: %.2f", of.sumarAreas(lista));
		
		
		
		

	}

}
