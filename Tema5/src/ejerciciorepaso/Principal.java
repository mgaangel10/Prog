package ejerciciorepaso;

import java.util.HashMap;
import java.util.Map;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cl,cl1,cl2;
		Oficina of;
		Cuenta cu,cu1,cu2;
		int masuno=1;
		Integer idMap = masuno;
		Map<Integer,Cuenta> listado=new HashMap <Integer,Cuenta>();
		
		cl=new Cliente(1000,"angel","1234b",19);
		cl1=new Cliente(1000,"fewfw","1234b",16);
		cl2=new Cliente(1000,"dfs","1234b",12);
		of=new Oficina (listado);
		cu=new Cuenta (cl);	
		cu1=new Cuenta (cl1);	
		cu2=new Cuenta (cl2);	
		
		of.agregar(idMap, cu);
		idMap++;
		of.agregar(idMap, cu1);
		idMap++;
		of.agregar(idMap, cu2);
		
		of.mostrarCuenta();
		
		//chavales no tengo micro se me ha quedao sin bateria
		//cahavles mañana nos vemos!!!!!!!!!!!!!!!!!!!!!!!!!!

	}

}
