package pret;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.*;

public class M2 {
	
	public static void main(String args[]) {
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int i=0; i<5; i++) {
			map.put((char)(65+i), 65+i);
		}
		
		System.out.println(map);
		
		map.putIfAbsent('A', 90);
		map.putIfAbsent('F', 70);
		
		System.out.println(map);
		
		map.remove('A');
		
		System.out.println(map);
		
		System.out.println(map.containsKey('A'));
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		Set<Map.Entry<Character,Integer>> s = map.entrySet();
		System.out.println(s);
		
		for(Character c:map.keySet()) {
			System.out.println(map.get(c));
		}
		
//		for each loop
		for(Entry<Character, Integer> entry: map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	
		Iterator it = map.entrySet().iterator();
		System.out.println("------------------");
		while(it.hasNext()) {
			Map.Entry e = (Entry) it.next();
			System.out.println(e.getKey());
		}
		
		
		HashMap<Character, Integer> hm = new HashMap<>();
		
		hm.putAll(map);
		
		System.out.println(hm);
		
		hm.replaceAll((k,v) -> hello(hm.get(k)));
		
		System.out.println(hm);
		
		System.out.println(hm.containsKey('B'));
		System.out.println(hm.containsValue(76));
		
		System.out.println("How are you".hashCode());
		System.out.println("How are youu".hashCode());
		
		hm.put(null, 25);
		System.out.println(hm.get(null));
		
		System.out.println(hm.size());
		

	}
	
	static int hello(int a) {
		return a+10;
	}
}

/*
 A view can be understand as the data in some data structure is change to another
 structure without copying the data, it just provide how a data look like in this data structure
 Like Set<Map.Entry<k,V>> entrySet() return a set view of map keys
 */
