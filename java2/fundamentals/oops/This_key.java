package oops;

public class This_key {
	
	/*
	 This keyword used to refer object who is calling that
	 method
	 */
	
	int x;
	
	This_key(){
		
		this(10);//this is invoking the current class constructor
		//means This_key(10);
		System.out.println("Inside default constructor");
	}
	
	
	
	This_key(int x){
		
		this.x = x;//putting local variable value in instance variable 
		System.out.println("Inside parametrized constructor");
		display();
	}
	
	
	This_key get() {
		
		return this;//returning the current class instance
		//means return the object
	}
	
	
	void display() {
		System.out.println("Value of x is "+x);
		
	}
	
	void get1() {
		display1(this);
	}
	
	void display1(This_key x) {//here argument is type of "this"
		System.out.println("Value of x is "+x.x);
		
	}
	
	public static void main(String args[]) {
		This_key a = new This_key(5);
		a.x=10;
		a.display();
		System.out.println(a);
		System.out.println(a.get());
		a.get().display();
		a.get1();
	}
}
