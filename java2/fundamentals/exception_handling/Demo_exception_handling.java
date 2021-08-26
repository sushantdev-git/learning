package exception_handling;

import java.util.Scanner;

public class Demo_exception_handling {
	
	/*
	Error : An error indicates serious problem that a reasonable applications
	should not try to catch
	
	Exception : Exception indicates conditions that a reasonable application might try
	to catch
	
	ex: ClassNotFoundException, IOException, SQLException, RemoteException, etc.
	
	There a two types of exception:
	Checked: those exception which we know that can occur and try to catch that
	Unchecked: those exception of which we are not aware of, this occur mainly due to logical
	error
	
	Benefits of exception handling
	is that a exception occur then we can handle that
	and code will continue forward and program won't break at that point
	
	finally block will run dosen't matter a exception is there or not
	 */
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int arr[] = new int[5];
		String s=null;
		
		try {
			System.out.println(s.length());//this is a null pointer exception
			System.out.println(a/b);
			arr[10]=20;
			
		}
		catch(ArithmeticException e){
			//this is a specific exception
			System.out.println("Cannot divide by zero "+e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index out of range");
		}
		catch(Exception e) {
			//if you want to use the Exception class to handle the 
			//exception then it should be below the specific exception
			//otherwise you will get compile time error
			//this is a general exception
			System.out.println("All type of exception handled");
		}
		finally {
			//finally block is not necessary
			System.out.println("code completed");
		}
		
		sc.close();
	}
}
