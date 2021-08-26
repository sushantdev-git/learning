package oops2;

public class Super_constructor {
	public static void main(String args[]) {
		b b1 = new b();
		
	}
}

class a{
	
	int c,b;
	a(){
		System.out.println("Class a constructor");
	}
	
	a(int c, int b){
		this.c = c;
		this.b = b;
		System.out.println(c+b);
	}
}
class b extends a{
	
	b(){
		//super(); //you can't call more than one constructor
		super(10,20);
		System.out.println("Class b constructor");
	}
	
}


