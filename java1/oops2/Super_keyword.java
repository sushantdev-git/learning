package oops2;

public class Super_keyword {
	
	/*
	 Super keyword 
	 parent class - base /super
	 child class - derived/sub
	 
	 super keyword are used in child class
	 to access parent method and members;
	 */
	
	public static void main(String args[]) {
		
		dd ob1 = new dd();
		ob1.get_me();
		
	}
}
class gg{
	String c = "Parent";
	void get_me() {
		System.out.println("Inside parent");
	}
}
class dd extends gg{
	
	void get_me() {
		super.get_me();
		System.out.println("Inside child "+super.c);
	}
}