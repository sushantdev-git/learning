package oops;

public class Constructer_overload {
	
	int a;
	
	Constructer_overload(){//
		
		this(10);//
		System.out.println("constructor 1 "+a);
	}
	
	Constructer_overload(int x){//
			
		this(20,30);//
		a+=x;
		System.out.println("constructor 2 "+a);
	}
	
	Constructer_overload(int x,int y){//
		
		a+=x+y;
		System.out.println("constructor 3 "+a);
		
	}
	
	
	public static void main(String args[]) {
		
		Constructer_overload ob1 = new Constructer_overload();///
		
		System.out.println("final "+ob1.a);
	}
	
}
