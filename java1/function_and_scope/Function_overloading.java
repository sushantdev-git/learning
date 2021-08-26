package function_and_scope;

public class Function_overloading {
	
	static int area(int r) {
		System.out.println("Area of circle");
		return (int)Math.PI*((int)Math.pow(r, 2));
		//here function can also be double type to output more precise value
	}
	
	static int area(int l,int b) {
		System.out.println("Area of parallelogram");
		return l*b;
	}
	
	public static void main(String[] args) {
		
		int a=10;
		int b=5;
		System.out.println(area(a));
		System.out.println(area(a,b));
	}
	
	/*
	 in function overloading : functions can have similar name
	 and complier will call that function that matches the
	 no of argument and type of argument.
	 */

}
