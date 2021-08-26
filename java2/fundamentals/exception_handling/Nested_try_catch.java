package exception_handling;

public class Nested_try_catch {
	/*
	 we can use nested try catch in java
	 
	 
	 */
	public static void main(String args[]) {
		try {
			int a = args.length;
			/*
			 if no command line argument are present the following
			 statement will generate a divide by zero exception
			 */
			int b = 42/a;
			System.out.println("a = "+a);
			try {
				if(a==1) a=a/(a-a);
				if (a==2) {
					int c[]= {1};
					c[43]=100;
				}
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.err.println("Array index out of range");
			}
			
		}
		catch(ArithmeticException e) {
			System.err.println("Can't divide by zero");
		}
		
		
	}
}
