package abstraction_and_Interface;

class Interface_ {
	
	/*
	 An interface in java is a blueprint of a class. it has static constants
	 and abstract and abstract methods
	 
	 Interface in java is a mechanism to achieve abstraction
	 
	 There can be only abstract methods in the have interface, not abstraction and 
	 multiple body. It is used to achieve abstraction and multiple inheritance in java.
	 
	 since java 8 we can have default and static methods in an interface
	 after java 9, we can have private methods in an interface
	 
	 
	 Reasons to use interface:
	 1>it is used to achieve abstraction
	 2>By interface, we can support the functionality of multiple inheritance
	 3>it can be used to achieve loose coupling
	 
	 */
	
	public static void main(String args[]) {
		
		ac ob = new ac();
		ob.display();
	}
	
	
}

interface hello{
	
	
	//you can't instantiate interface, (can't make objects)
	
	//if you want use interface property in class use "implements" keyword
	//if you want to use interface property in interface than use "extends" keyword
	
	// in interface by default variable are "public static final"
	// in interface by default method are "public abstract"
	
	//you can change modifier of interface
	
	
	int min =10;
	
	void display();
}

class ac implements hello{
	
	public void display() {//interface methods are "public abstract" so
		//you have to use public with method in sub-class to define it's body
		System.out.println("hello"+min);
	}
}