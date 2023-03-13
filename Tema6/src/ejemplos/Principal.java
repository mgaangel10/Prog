package ejemplos;

import java.util.SortedMap;
import java.util.TreeMap;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortedMap<String,Integer>sorted=new TreeMap<>();
		
		//añadimos elementos en el sortedMap
		sorted.put("c", 3);
		sorted.put("f", 6);
		sorted.put("a", 1);
		sorted.put("e", 5);
		sorted.put("b", 2);
		sorted.put("d", 4);
		
		//obtener valores del map ordenado
		for (String key : sorted.keySet()) {
			System.out.println("key: "+key+", valor: "+sorted.get(key));
		}
		

	}

}
