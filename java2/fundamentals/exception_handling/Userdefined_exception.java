package exception_handling;

public class Userdefined_exception {
	/*
	 Custom Exception
	 These are user defined exception class by extending the exception class and can customize
	 the exception according to his/her needs
	 Mainly it is used in unchecked exception
	 
	 */
	public static void main(String args[]) {
		byte a=4,b=9;
		
		try {
			if(a/b == 0) {
				throw new UserException("It is integer division");
			}
		}
		catch(UserException e) {
			System.out.println("This exception has been caught");
			System.out.println(e.getMessage());
		}
	}
}

class UserException extends Exception{
	
	UserException(String message){
		super(message);
	}
}