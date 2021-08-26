package oops;

public class Inheri {
	
	public static void main(String arhs[]) {
		
		two t = new two();//you can make object of a class to access 
		//it properties and methods
		
		t.get();//accessing get method via object
		
	}
}

class two{
	
	void get() {
		System.out.println("hello how are you???????");
	}
}