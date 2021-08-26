package pret;
import java.util.*;

public class M1 {
	
	/*
	 Map is a type of data structure that store data in the from of key value pair
	 
	 It does not implement collection interface
	 
	 It is present in java.util package
	 
	 Map is an interface, and there is three class that implement map interface
	 	-HashMap
	 		does not maintain order
	 		fastest because do not maintain order and used HashFunction
	 	-LinkedHashMap
	 		Maintain order
	 	-TreeMap
	 		Maintain ascending order
	 		
	 */
	
	public static void main(String args[]) {
		
		Map<String, Integer> map = new TreeMap<>();
		
		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);
		map.put("Five", 5);
		
		System.out.println(map);
		
//		Map<String, Integer> map1 = new LinkedHashMap<>();
//		map1.put("One", 1);
//		map1.put("Two", 2);
//		map1.put("Three", 3);
//		map1.put("Five", 5);
//		
//		System.out.println(map1);
//		
//		
//		Map<String, Integer> map2 = new HashMap<>();
//		map2.put("Ten", 10);
//		map2.put("Eleven", 11);
//		map2.put("Twelve", 12);
//		map2.put("Thirteen", 13);
//		
//		System.out.println(map2);
////		
//		map.putAll(map2);
//		
//		
//		System.out.println(map);
		
		
	}
}
