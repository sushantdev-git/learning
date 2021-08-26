package oops;

public class construct{
	
	int A;
	construct() {//constructor name is same as name of class
		
		/*
		 what is constructor:
		 	-constructor is used to initialize the value at the time 
		 	 of creation of an object
		 	
		 	-it is called by itself at the time of creation of object
		 	
		 	-no of arguments is defined as the signature of constructor
		 	
		 	-there are different type of constructor, parameter less, parameterized constructor
		 	
		 	-constructor by default public in nature
		 	
		 	-you can define any number of constructor in a class
		 */
		System.out.println("Paramer less constructor");
	}
	
	construct(int a){
		A = a;
		System.out.println("This is parameterized constructor");
	}
}
