package collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class Collections_intro {
	
	/*
	 we can store the data using collections 
	 we can manipulate group of data using collections
	 
	 Data structure - in memory how we want to store memory
	 
	 Collections gives is a framework and provide us interface and classes
	 to use different type of data structure
	 
	 Hierarchy of collection framework
	 
	 These interfaces are present in java.util package;
	 
	 iterable
	 
	 	Ietrator interface gives the facility of iterating elements in 
	 	a forward direction only
	 		function :
	 			hasNext()
	 			next()
	 			remove()
	 			
	 			syntax : Iterator<T> iterator()
	 			T is type of data type
	 			
	 			
	 	Collections
	 		
	 		list
	 			
	 			Array List
	 			Linked List
	 			Vector
	 				stack
	 		
	 		Queue
	 			
	 			Priority queue
	 			Deque
	 				Array Deque
	 		
	 		Set
	 			Sorted Set
	 				Tree set
	 			Hashset
	 			LinkedHashset
	 			
	 
	 
	 
	 
	 */
	public static void main(String x[]) {
		
		Collection values = new ArrayList();
		//Arraylist is implementing Collection
		
		values.add(3);
		values.add(77f);
		values.add(12.22f);
		values.add(25.2f);
		values.add(55.6);
		
		Iterator i = values.iterator();
		//interator works with collections
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
			
		
		
	}
}
