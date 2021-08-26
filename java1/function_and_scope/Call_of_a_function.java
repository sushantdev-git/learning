package function_and_scope;

public class Call_of_a_function {
	public static int sum(int a,int b) {
		int result =a +b;
		return result;
	}
	
	public static void b() {
		System.out.println("Inside b");
	}
	public static void a() {
		b();
		System.out.println("Inside a");
	}
	
	public static void main(String args[]) {
			
		int a=10;
		int b=5;
		int result = sum(a,b);
		System.out.println(result);
		
		a();
		System.out.println("Inside Main");
		
		/*
		 Here execution stack or "call stack" will be like 
		 main> a > b > b executed > b popped>  a executed > a popped>  main executed;
		 */
	}
	
	/*
	 how function calling works
	 
	 the runtime environment calls main
	 and first function that get called is main
	 
	 and from main other functions are called
	 
	 here main is caller funciton 
	 and sum is calle function
	 
	 when sum function is called the main function is paused there and
	 when sum function get executed completely then main
	 function resumes
	 
	 on which line main get paused , the main will resume from there only
	 
	 All function calls are stored in memory area "call stack";
	 
	 first function in stack will be main
	 when we enter main we create variable and then we call sum
	 when we call sum the next entry in stack will be sum
	 main will pass value to sum
	 and sum will collect those values and process on that value
	 #the variable 'a' in main is different from variable 'a' in sum
	 and when return is hit in sum function, the sum function will be popped
	 from stack
	 and flow will return to main function
	 and main will resumes from that line where it was paused
	 
	 # variable in different scope with same name are different
	 
	 
	 
	 
	 
	 
	 */

}
