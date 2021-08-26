package oops;

public class Student {
	
	//class keyword is used to create a class
	//class is a template
	
	public String name;
	//this property is now public and can be used in and out package
	
	int rollNumber;
	//These are properties in a class
	//here modifier is default
	
	private int marks=100;
	
	
	protected void set_marks(int m) { //this is known as setter function
		if(m<0) {
			return;
		}
		marks = m;
	}
	protected int get_marks() {//this is known as getter function
		
		return this.marks;//you can give access private to properties like this
	}

}
