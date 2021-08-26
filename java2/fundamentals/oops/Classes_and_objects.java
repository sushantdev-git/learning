package oops;

public class Classes_and_objects
{	
	/*
	 in oops everything is based on classes and object
	 
	 class is a template that have blueprint how an object form that class look
	 
	 basically which properites and method it can have
	 
	 object is an instance(chaap hindi) of class
	  
	  
	  Modifier:
	  
		  Access Modifier:
			  These are access - modifier in oops that will determine the scope of 
			  variable, method, class
			  
			  public  -  inside and outside of package
			  private - inside class only
			  default - inside package
			  protected - within package, and outside package through child class
			  
		 Non-Access modifier:
		 	Java provides some other modifiers to provide the functionalities other than the visibility. 
		 	These modifiers are called Non-Access Modifiers. There are many non-access modifiers 
		 	available in java. Each modifier have their own functionality. Some of the most used 
		 	non-access modifiers are listed below.
		 	
		 	static: member of that class can directly use that variable or method 
		 			without creating object
		 	
		 	abstract:
	  				method is defined in parent class
	  				body defined in sub class
	  		
	  		final:
	  			
	  			a method, of property once defined can't be changed further
	 */
    public static void main(final String[] args) {
//    	Classes_and_objects c1 = new Classes_and_objects();
//        c1.get();
    	vvv v1 = new ccc();
    	v1.sparsh();
    }
    
    void get() {
        System.out.println("Hello world");
    }
    
}

abstract class vvv{
	abstract void sparsh();
	
	//access/non access-modifier return-type function-name
}
class ccc extends vvv{
	void sparsh(){
		System.out.println("hello world");
	}
}