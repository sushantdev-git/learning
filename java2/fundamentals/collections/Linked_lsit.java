package collections;
import java.util.*;

public class Linked_lsit {
	/*
	 linked list work on the method that it store the address of next node
	 and store its own data
	 
	 
	 
	 */
	public static void main(String args[]) {
		
		LinkedList<String> ll = new LinkedList<String>();
		
//		LinkedList ll1 = new LinkedList();
//		ll1.add(12);
//		ll1.add(true);
//		ll1.add("Hello");
		//here we can see any type of data can be stored
		
		//And this goes for all List types
		
		ll.add("A");//Data is storing in the form of object
		ll.add("B");
		ll.addLast("C");
		ll.addFirst("D");
		ll.add(2,"E");
		
		System.out.println(ll);
		for(int i=0; i<ll.size(); i++) {
			//size can be found using size()
			
			System.out.println(ll.get(i));
			//using get(i) to get element of array list
		}
		
		Iterator<String> itr = ll.iterator();
		//if you don't make iterator generic it will also work
		
		while(itr.hasNext()) {
			System.out.print(itr.next());
		}
		
		
		
		ll.remove("B");
		ll.remove(3);
		ll.removeFirst();
		ll.removeLast();
		
		System.out.println(ll);
		
		
		System.out.println(ll.getClass().getName());
		
	}
}
