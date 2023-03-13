package ejemploentorno;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Trabajador t,t1,t2,t3;
		Profesor p;
		Mecanico m;
		Comercial co;
		Camarero ca;
		t=new Profesor("a","p",1000,"11b",23,2,true);
		t1=new Mecanico("a","p",1000,"11b",23,3,"audi");
		t2= new Comercial("a","p",1000,"11b",23,5,true);
		t3= new Camarero("a","p",1000,"11b",23,10,"a");
		
		System.out.println("sueldo profesor");
		System.out.println(t.calcularSueldo());
		System.out.println("sueldo mecanico");
		System.out.println(t1.calcularSueldo());
		System.out.println("sueldo comercial");
		System.out.println(t2.calcularSueldo());
		System.out.println("sueldo camarero");
		System.out.println(t3.calcularSueldo());
		
		
		
		
		
		
		
		

	}

}
