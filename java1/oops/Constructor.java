package oops;

public class Constructor {
	
	/*
	 The constructor look like a function call
	 
	 Constructor:
	 	it is called automatically when an object is created
	 	
	 	there is a default constructor inside a class not defined by you;
	 	
	 	Constructor does not have a return type
	 	
	 	
	 */
	
	public static void main(String args[]) {
		
		
		Student_constructor s1 = new Student_constructor("Sushant",12);
		s1.print();
			
		Student_constructor s2 = new Student_constructor("Aman",45);
		s2.print();
		
		
		
	}
	
	
}
