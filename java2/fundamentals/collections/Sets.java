 package collections;
import java.util.*;

public class Sets {
	/*
	 with set class we can use property of sets
	 There are three classes of set
	 HashSet
	 TreeSet
	 LinkedHashSet
	 
	 similarity:
	 	They are not allowed to store duplicate objects
	 	HashSet and LinkedHashSet are Thread Safe because they use synchronized method
	 	
	 Difference
	 ->
	 	TreeSet to use set in sorted order
	 	HashSet if you don't want to maintain insertion order
	 	LinkedHashSet it is implementation of Set using hashMap and linked list
	 	LinkedHashSet maintain insertion order
	 	
	 
	 */
	public static void main(String args[]) {
		Set<Integer> a = new HashSet<Integer>();
		
		a.addAll(Arrays.asList(new Integer[] {2,3,4,8,9,0,12,14}));
		
		Set<Integer> b= new HashSet<Integer>();
		b.addAll(Arrays.asList(new Integer[] {1,3,7,5,4,0,7,5}));
		
		System.out.println("A set "+a+"\nB set"+b);
		
		//finding Union
		Set<Integer> union = new HashSet<Integer>(a);//copying a in unoin
		union.addAll(b); //it will create union of union and b
		
		System.out.println("Union of A and B sets");
		System.out.println(union);
		
		//Intersecion
		Set<Integer> intersection = new HashSet<Integer>(a);
		intersection.retainAll(b);//it will create intersection of intersectoin and b
		System.out.println("Intersection of A and B  sets\n"+intersection);
		
		//Difference
		Set<Integer> difference = new HashSet<Integer>(a);
		difference.removeAll(b);//it will create difference of difference and b
		System.out.println("Difference of A and B  set\n"+difference);
		
		
		//Converting array to a list
		String[] stringArray= {"One","Two","Three"};
		List<String> list = Arrays.asList(stringArray);
		System.out.println(list);
	}
}
