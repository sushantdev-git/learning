package try_exception;

public class ExceptionDemo {
	/*
	 There are three type of exception
	 Errors - this exception occur in extreme case like hard disk failure
	 
	 Unchecked - these exception occur due to some logical error, and we generally don't except them
	 to happen, like ArrayindexBound exception
	 
	 checked - these exception are excepted exception, means we expect that these exception can occur 
	 in our program
	 */
	
	public static int fact(int n) throws NegativeNumberException{
		if(n <0) {
			throw new NegativeNumberException();
		}
		int ans =1;
		for(int i=1; i<=n; i++) {
			ans*=i;
		}
		
		return ans;
	}
	
	public static int divide(int a, int b) throws DivideByZeroException{ //here
		//this function is throwing exception to who so ever has called this function
		if(b == 0) {
			throw new DivideByZeroException();//here we are raising the exception
			
			//throw new ArithmeticException();//this is a default type of exception
		}
		
		return a/b;
	}
	
	public static void main(String args[]) {
		//the main can also throw the exception and that can be seen in console
		//System.out.println(10/0);
		try {
			
			int a = 5/0;
			divide(10,0);
			System.out.println(fact(2));
			//no line will be executed after error
			System.out.println("Ye print nhi hoga");
			
		} catch (DivideByZeroException e) { //here we are handling the exception
			
			System.out.println("Divide by zero exception raised");
			//e.printStackTrace();
			return;
		}
		catch (NegativeNumberException e) {
					
			System.out.println("Negative number Exception");
			//with one try block you can handle multiple
			//exception on the basis of exception occurred
		}
		catch(Exception e) {
			System.out.println("Some excpetion occurred");
			//this is a generic from of exception 
		}
		finally {
			System.out.println("Finally");
			//this will be executed weather or not exception happened
			//this will run even if any return statement is hit inside try/catch block
		}
		
		System.out.println("Inside main");
		
		/*
		 if you directly throw error from main then nothing will be executed
		 after that line where error occurred
		 
		 but if you handle the exception then program will continue to run
		 after the exception handling
		 */
		

		
		
		

//	    try{
//	       int a = 5/0;
//	    }
//	    catch(ArithmeticException e){
//	        System.out.print("Arithmetic Exception caught ");
//	    }
//	    catch(Exception e){
//	        System.out.print("Exception caught ");
//	    }
//	   finally{
//	       System.out.print("finally block");
//	   } 
		 
	}
}
