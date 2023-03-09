package ejemplos;

import java.util.SortedMap;
import java.util.TreeMap;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortedMap<String,Integer>sorted=new TreeMap<>();
		
		//añadimos elementos en el sortedMap
		sorted.put("z", 1);
		sorted.put("C", 3);
		sorted.put("B", 2);
		sorted.put("x", 18);
		sorted.put("w", 2);
		sorted.put("p", 9);
		
		//obtener valores del map ordenado
		for (String key : sorted.keySet()) {
			System.out.println("key: "+key+", valor: "+sorted.get(key));
		}
		

	}

}
