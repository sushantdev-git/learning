package function_and_scope;

public class Pass_by_value {
	
	public static void increment(int n) {
		n++;
		System.out.println("Increment "+n);
	}

	public static void main(String[] args) {
		
		int n =10;
		increment(n);
		System.out.println("Main "+n);
		
		/*
		 Value of n in main is 10 not eleven
		 because
		 in java "Pass by value" method is followed means that 
		 the actual n or where ever n is stored in the memory, that n is not passed
		 but the value that n contains (10) that is passed;
		 
		 so value of n in main remain same and not get incremented
		 
		 
		 
		 
		 How two function communicate
		 caller - main
		 callee - increment
		 
		 		-> argument ->
		 Caller 				Callee
		 		<-  return  <-
		 */
	}

}
