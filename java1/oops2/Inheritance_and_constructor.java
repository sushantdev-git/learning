package oops2;

class Inheritance_and_constructor {
	
	public static void main(String args[]) {
		parent p = new parent(10);
		//parent constructor called once
		
		child c = new child("Sushant", 10);
		//the constructor of parent will be called first
		//then constructor of child will be called
		
		//this is happening because as child class extends parent class
		//all the properties of parent class must be initialized first
		//and then the properties of child class should be initialized
		//so first parent constructor called and then child
		//you can understand it as if parent exist then only child exist
		
		c.child();
	}
	
}
class parent{
	int n;
	parent(){
		
	}
	parent(int n){
		this.n =n;
		System.out.println("Parent constructor "+n);
	}
}
class child extends parent{
	
	String name="";
	child(String name, int n){
		super(n);//this is how you call parent constructor with super keyword
		//we are calling super constructor because
		//if child class is called the parent class will be called first
		//and if parent class is called we have to pass some value in it constructor
		//otherwise we will get an error
		//calling constructor must be first statement inside a constructor 
		//if don't have default parent constructor then you must 
		//explicitly call parent constructor, otherwise you will be getting errors
		
		this.name = name;
		System.out.println("Child constructor "+this.name);
	}
	
	void child() {
		System.out.println("You can define a method same name as class");
	}
}