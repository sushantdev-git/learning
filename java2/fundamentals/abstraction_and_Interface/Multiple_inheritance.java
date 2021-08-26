package abstraction_and_Interface;
import java.util.Scanner;
class Multiple_inheritance {
	
	public static void main(String args[]) {
		D d1 = new D();
		d1.display();
		
		System.out.println(D.a);//here 'a' is a static variable and can be accessed within another
		//classes without making objects
		
		//System.out.println(D.d); here d is a non-static variable, so can't be accessed outside the class
		
		//if there is any static method in interface  then you can call it like this
		//interface_name.method_name
		C.d3();
		
		
	}
	
}

interface A{
	
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	//interface variable can be only initialized in its interface
	//by default interface variable are "public static final" and you can't change it
	
	
}

interface B{
	
	int b=10;
	public void display();
}


interface C{
	
	int c=10;
	
	default void display() {
		System.out.println("Hello how are you");
	};
	//by default a method is "public abstract" and you can
	//change it to default, private, protected, public 
	
	/*
	 default
	 public default 
	 private
	 static
	 when you use these modifier then you can define body of method inside 
	 same interface
	 */
	
	static void d3() {
		System.out.println("Ehooooo");
	}
	
}

class D implements A,B,C{
	
	int d =10;
	public void display() {
		System.out.println(a+b+c+d);
		System.out.println(B.b + b);
	}
}






interface E extends B,C{
	
	//if there are same method in parent class 
	//then that will create error 
	//so to remove error change methods name
	//or do method overriding
	default void display() {
		System.out.println("Inside inherited interface");
	};
}