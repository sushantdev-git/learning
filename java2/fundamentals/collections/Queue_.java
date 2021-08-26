package collections;
import java.util.*;
public class Queue_ {
	
	/*
	 Queue works on the principle of first in first out.
	 first element is known as front
	 last element is known as Rear
	 	Structure:
	 		front/10 | 12 | 13 | 1 | 20 | Rear/32
	 		front will remain same 
	 		but rear will be updated as element added to queue
	 		
	 Operations:
	 	Enqueue: all element to queue
	 		element will be added to last of queue and rear will be updated
	 	Dequeue: remove element from queue
	 		element will be removed from front of queue and front will be updated
	 	
	 It can be defined as ordered list (data is same as we entered in queue)
	 
	 Classes of queue:
	 	PriorityQueue - it is present in queue interface
	 	ArrayDeque - it is present in deque interface which is present in queue interface
	 	
	 #imp
	 	->in priority queue we can't store null value
	 	
	 	Array deque:
	 		Arraydeque is much fast than arraylist and stack
	 		In ArrayDeque we can add/remove element from both side
	 	
	 	priority queue:
	 		automatically sort the queue

	 */
	
	public static void main(String args[]) {
			
		Queue<String> q1 = new PriorityQueue<String>();
		Queue<Integer> q2 = new ArrayDeque<Integer>();
		
		q1.add("Sushant");
		q1.add("Vijay");
		q1.add("Raj");
		q1.add("Rohit");
		
		System.out.println("Head/Front "+q1.element());
		System.out.println("Head/Front "+q1.peek());//peek - fetching head of queue
		System.out.println("Iterating the queue elements");
		
		Iterator<String> itr = q1.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("Remove "+q1.remove());//remove - hover and see
		System.out.println("Poll "+q1.poll());//poll - removing head of queue
		
		System.out.println("Size "+q1.size());
		
		
		
		
		
	}
}
