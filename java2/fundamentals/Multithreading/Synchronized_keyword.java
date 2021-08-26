package Multithreading;


public class Synchronized_keyword {
	
	/*
	 synchronization don't work with normal class
	 */
	public static void main(String args[]) {
		xyz a1 = new xyz();
		xyz a2 = new xyz();
		xyz a3 = new xyz();
		
		a1.method();
		a2.method();
		a3.method();
	}
	
}
class xyz{
	int a=10;
	
	synchronized void method(){
		if(a>0) {
			a-=5;
			System.out.println(a);
		}
		else {
			System.out.println("Cannot process");
		}
	}
	
	void hell() {
		System.out.println("Something");
	}
}