package oops;

public class Final_abstract_keyword{
	
	/*
	 final keyword
	 final variable - to create constant variables
	 final method  -  prevent method overriding(sub class)
	 	overloading possible not but not overriding
	 	(method overriding : Declaring a method in sub class which is already present in parent class 
	 	is known as method overriding)
	 final classes -  prevent inheritance(You can't make sub class of that class)
	 
	 
	 Abstract keyword
	 abstract is a non-access modifier in java
	 applicable for classes, methods but not variables
	 
	 when you use abstract with class you can't make object of that class
	 
	 when you use abstract with method you can't declare it's body in that class
	 you need a subclass for that
	 
	 abstract and final is opposite of each other;
	 
	 
	 */
	
	
	
	public static void main(String arg[]) {
		
		final float pi = 3.14f;
		System.out.println(pi);
		//pi = 3.1414f;//you can't assign a value to a final variable
		
		twoo t = new twoo();
		t.area();
		
	}
}

final class twoo{
	
	void area(){
		System.out.println("This is my area");
	}
}
