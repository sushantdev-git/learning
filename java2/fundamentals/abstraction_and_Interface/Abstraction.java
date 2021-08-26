package abstraction_and_Interface;

class Abstraction {
	
	/*
	 abstract classes are declared by abstract keyword
	 a abstract class can have both abstract and simple method
	 
	 abstract class can have constructor and static method
	 
	 you can't make object of abstract class <-> can't instantiate
	 
	 */
	public static void main(String args[]) {
		ab ab1 = new abs();
		ab1.run();
		ab1.display();
		ab1.display2();
	}
}

abstract class ab{
	
	ab(){
		System.out.println("Inside ab constructor");
	}
	abstract void run() ;//this is declaration of method
	//if you use final with abstract method you can't change body of that
	//method inside sub-class
	
	//with final keyword method overloading is possible but overriding is not possible
	
	void display() {
		System.out.println("Inside abstract class");
	}
	
	static void display2() {
		System.out.println("Inside static method");
	}
	
}

class abs extends ab{
	
	void run() { //this is definition of method
		System.out.println("Running");
	}
}
