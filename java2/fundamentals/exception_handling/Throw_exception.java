package exception_handling;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class Throw_exception {
	/*
	 throws keyword
	 throws is a keyword in Java which is used in the signature of method to indicate 
	 that this method might throw one of the listed type exceptions. 
	 The caller to these methods has to handle the exception using a try-catch block.
	 
	 throw keyword
	 The throw keyword in Java is used to explicitly throw an exception from a method or any block of code. 
	 We can throw either checked or unchecked exception. 
	 The throw keyword is mainly used to throw custom exceptions. 
	 
	 
	 
	 
	
	
	 */
	public static void main(String args[]) {
		tt rw1 = new tt();
		try {
			rw1.readf();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
//		rw1.savef();
		System.out.println("Hello");
	}
}

class tt{
	void readf() throws FileNotFoundException
	{
		FileInputStream fis = new FileInputStream("d:/abc.txt");
	}
	
	void savef() throws FileNotFoundException{
		String text = "This is a demo";
		FileOutputStream fos = new FileOutputStream("d:/xyz.tex");
				
	}
}
