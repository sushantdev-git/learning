package oops;

public class Encapsulation {
	
	/*
	 Encapsulation means sensitive data must be hidden
	 from user
	 
	 declare variable as private
	 
	 provide public get and set method to access and update the value of 
	 private variable
	 
	 
	 Get and set
	 
	 The private variables can be accessed within same class
	 so we use get and set method to access private variable
	 
	 the syntax of getter method and setter method should be
	 
	 ex: variable name is: quantity
	 
	 set:  setQunatity()
	 get : getQunatity()
	 
	 */
	
	private String name; //private variable can be accessed with in class
	private int rollNo;
	
	public static void main(String args[]) {
		Encapsulation e = new Encapsulation();
		e.name="Sushant";
		System.out.println(e.name);
	}
	
	//wap to assign area of rectangle using getter and setter
	//length and b variable should be in private
}
