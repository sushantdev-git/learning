package oops2;

import oops.Student;

class Protected_modifier extends Student{
	
	public static void main(String args[]) {
		Protected_modifier p = new Protected_modifier();
		p.set_marks(100);
		System.out.println(p.get_marks());
		
	}
	
	
	/*
			 				  (same package)			(Different Package)
				 same 		Derived		Non-Derived		Derived		Non-Derived
				 class		class		class			class		class
	 
	 private	 true		false		false			false		false
	 
	 default	 true		true		true			false 		false
	 
	 protected	 true		true		true			true		false
	 
	 public		 true		true		true			true		true
	 */
}
