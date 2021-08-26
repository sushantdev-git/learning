package collections;
import java.util.*;
public class Vector_class {
	
	/*
	 iterable -> collection -> list -> Vector -> Stack
	 
	 //vector is a class present in list interface
	 
	 vector class methods are synchronized by default
	 
	 Array list and vector is similar but array list is not syncrhonized
	 
	 */
	
	public static void main(String args[]) {
		
		Vector v = new Vector();
		
		v.add("hello");
		
		Vector v1 = new Vector();
		v1.add("Hello");
		
		
		
		for(int i=0; i<5; i++) {
			v1.add("Hello"+i);
		}
		
		v.add(v1);
		
		v1.removeElementAt(1);
		
		System.out.println(v1);
		System.out.println(v);
		
		v1.setElementAt("helloooo", 3);
		
		System.out.println(v);
		
		v.insertElementAt("howwwww", 1);
		
		v1.remove(0);
		v1.remove("helloooo");
		
		System.out.println(v);
		System.out.println(v.firstElement());
		System.out.println(v1.lastElement());
		
		System.out.println("-----------------------");
		for(int i=0; i<v.size(); i++) {
			System.out.println(v.elementAt(i));
		}
		
	}
}
