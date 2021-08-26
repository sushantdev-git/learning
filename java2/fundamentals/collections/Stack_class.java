package collections;
import java.util.*;
public class Stack_class {
	
	/*
	 Stack work on push on pop operation
	 TOS - Top of the stack
	 */
	
	public static void main(String args[]) {
			
		Stack<String> s = new Stack<String>();
		
		s.push("1");
		s.push("2");
		s.push("3");
		s.push("4");
		s.push("5");
		System.out.println(s);
		
		s.pop();
		
		System.out.println(s);
		
		System.out.println(s.peek());//peek return top of the stack
		



	}
}
