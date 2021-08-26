package class_work;

public class Static_key {
	public static int a=10;
	//class B - same package
	//class C - different package
	
	void print() {
		System.out.println("Hello");
	}
	public static void main(String args[]) {
		Static_key a1= new Static_key();
		a1.a=50;
		
		Static_key a2 = new Static_key();
		a2.a=20;
		
		System.out.println(a);
		System.out.println(a1.a);
		System.out.println(a2.a);
		//all will print same value
		//means any object can alter the static variable
		//and the change can be seen for all the objects
		//static value is property of class and will be same for all members of class
		
	}
}
