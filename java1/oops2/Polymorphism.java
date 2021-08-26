package oops2;



public class Polymorphism {
	
	/*
	 Polymorphism:
	 
	 One thing capable to taking multiple form
	 
	 
	 */
	
	public static void main(String args[]) {
			
		vehicle v1 = new car(); //we can create object like this also
		//here we are able create object of car class with it's base class
		//name, because car is also a type of vehicle and when we are creating
		//object of v1 of car v1 indirectly referring to class vehicle
		
		vehicle v2 = new bicycle();
		//now one #important thing to notice
		//that if you are making objects like this
		//then you will only be able to access those properties
		//that are present in vehilce class specifically,
		//you will not be able to access property of car and bicycle class
		
		v1.maxSpeed=10;
		//v1.numDoors = 20;//this is an error
		//this is an compile time error
		
		v1.print();//here car print function will be called
		//this is known as runtime polymorphism
		
		//you can understand this scenario can be understand as
		//at compile time v1 is is referring to vehicle class
		//and at runtime v1 is referring to car class
		
		//------------------------------------------------------------------
		
		//You can do typecasting in object also
		vehicle v = new car();
		//v = new bicycle();
		
		car c = (car)v; //you can convert an object of object of another sub class forcefully
		//if you are sure that a parent class have of one sub-class then
		//only you should try casting otherwise you will get an error
		c.numDoors = 3;
		
		//-----------------------------------------------------------------------
		//Every class in java is sub-class of a super class known as Object
		
		Object o = new car();
		
		//all properties we get by default for a object of a class
		//are actually properties of object class
	}
}
