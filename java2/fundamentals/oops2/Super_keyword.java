package oops2;

public class Super_keyword {
	/*
	 Super keyword is used with super classes
	 This keyword work with inheritance
	 
	 this keyword work with current class
	 
	 */
	public static void main(String args[]) {
		sub s = new sub();
		s.show();
		
		
	}
}

class sup{
	int a=10;
	void show() {
		System.out.println(a);
		System.out.println("Super class method");
	}
}
class sub extends sup{
	int a=20;
	void show() {
		super.show();//you can use super keyword to access member of super class
		System.out.println(a);
		System.out.println("Sub class method");
	}
}
