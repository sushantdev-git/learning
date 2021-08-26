package oops;

abstract public class Abstract_implemetation {
	
	public static void main(String args[]) {
		
		B b = new B();
		
		b.m1();
		b.m2();
	}

}

abstract class A{//you can't make object of abstract class.
	
	abstract void m1();//you can't declare body
	//of a abstract method in it's class
	
	void m2() {
		System.out.println("This is a concreate method");
		
	}
}

class B extends A{
	
	void m1() {//implementing abstract method in sub class
		System.out.println("B's  imlementation of m1");
	}
}