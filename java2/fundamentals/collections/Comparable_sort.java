package collections;
import java.util.*;
public class Comparable_sort implements Comparable<Comparable_sort>{
	
	/*
	 Comparable and comparator
	 These are two interfaces and used to sort objects using
	 data members of that class
	 These interfaces are present in java.lang package
	 
	 
	 */
	int rollno;
	String name;
	int age;
	
	Comparable_sort(int rollno, String name, int age){
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		
	}
	
	public int compareTo(Comparable_sort st) {
		if(age == st.age) return 0;
		else if(age> st.age) return 1;
		else return -1;
	}
	
	public static void main(String args[]) {
		
		ArrayList <Comparable_sort> aa = new ArrayList<Comparable_sort>();
		
		aa.add(new Comparable_sort(101,"Sushant", 20));
		aa.add(new Comparable_sort(105,"Rahul", 22));
		aa.add(new Comparable_sort(109,"Amit", 19));
		aa.add(new Comparable_sort(106,"Udit", 36));
		
		Collections.sort(aa);
		
		for(Comparable_sort a: aa) {
			
			System.out.println("Age "+a.age+" Name "+a.name+" roll no "+a.rollno);
		}
		
		
		
	}
}
