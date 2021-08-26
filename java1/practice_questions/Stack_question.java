package practice_questions;
import java.util.*;

public class Stack_question <E>{
	
	Stack <E> st = new Stack<>();
	
	public void push(E obj) {
		st.push(obj);
	}
	
	public E pop() {
		E s = st.pop();
		
		return s;
	}
	
	
	public static void main(String args[]) {
//		Stack_question<String> gs = new Stack_question<>();
//		
//		gs.push("hello");
//		gs.push("25");
//		System.out.println(gs.pop());
		
		
//		char c = 65;
//		System.out.println("Hello"+c);
		
//		List<String> names = new LinkedList<>();
//		
//		names.add("Rahul");
//		names.add("Ram");
//		names.add("Rahullll");
//		names.add("Rammmm");
//		
//		ListIterator<String> it = names.listIterator(3);
//		
//		while(it.hasPrevious()) {
//			System.out.println(it.previous());
//		}
		
		
		StringBuffer s [] = new StringBuffer[2];
		
		for(int i=0; i<s.length; i++) {
			s[i].append("index"+i);
			System.out.println(s);
		}
		
		
		
	}
	
}
