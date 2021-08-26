package oops;

public class Method_overload_and_overriding {
	
	//Method overloading
	/*
	 In method overload in a class you can define method 
	 with same name and same return type
	 but method should be differentiated on basis of 
	 no of arguments, or type of argument
	 
	 Method overloading works within the class
	 
	 
	 you can also do constructor overloading, same as method overloading
	 */
	
	//Method overriding
	/*
		Overriding is a feature that allows a subclass or child class to provide
		a specific implementation of a method that is already provided by one of its
		super-classes or parent classes.
		
		
		in overloading parameter need to be different 
		but is overriding function can be exactly same
		
		Rules:
			
		
	*/
	
	//Polymorphism: when you make differnet function with same name are called polymorphism
	public int area(int r) {
		//area of circle
		return (int)(3.14)*r*r;
	}
	
	public int area(int l, int b) {
		//area of rectangle
		return l*b;
	}
	
	public static void main(String args[]) {
		Method_overload_and_overriding obj1 =new Method_overload_and_overriding();
		System.out.println("Area of circle "+obj1.area(5));
		System.out.println("Area of rectang"+obj1.area(5,10));
		
		parent p = new parent();
		p.print();
		parent c = new child();//you also can make child class object like this
		c.print();
	}
}

class parent{
	void print() {
		System.out.println("Parent");
	}
	//if you use final, static , private method can't be overridden
	//you can't override constructor
}

class child extends parent{
	
	@Override
	void print() {//here method overriding take place
		System.out.println("Child");
	}
	
}


