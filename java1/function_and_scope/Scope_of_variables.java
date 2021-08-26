package function_and_scope;

public class Scope_of_variables {
	public static void increment(int n) {
		n++;
		//int j=100;//here j is local variable of increment function and can't be accessed inside main
		//function or outside of increment function
		//there can be j variable inside main but that will be totally different from j inside increment
		System.out.println("Increment "+n);
	}
	
	public static void main(String args[]) {
		
		
		int n=10;
		increment(n);
		System.out.println("Main "+n);
		
		/*
		 How two function communicate
		 caller - main
		 callee - increment
		 
		 		-> argument ->
		 Caller 				Callee
		 		<-  return  <-
		 */
	}
}
