package oops2;

class Inheritance {
	
	public static void main(String args[]) {
		
		car c1 = new car();
		c1.color="Black";
		c1.numDoors=4;
		c1.maxSpeed=100;
		c1.price=5000000;
		
		c1.print();
		
		bicycle b1 = new bicycle();
		
		b1.color="red-orange";
		b1.price=10000;
		b1.maxSpeed=20;
		b1.print();
		
		
		
	}
	
}

class vehicle{
	int maxSpeed;
	String color;
	int price;
	
	//private int non_accessible;//if you use private with any variable and function, then you can't
	//access these variables and functions in sub-class/child class.
	//you can use getter and setter method to access private members
	
	void print() {
		System.out.println("Color "+color+"\nmax speed "+maxSpeed+"\nPrice "+price);
		System.out.println();
	}
	
//	int getNa() {
//		return non_accessible;
//	}
	
	
}
class car extends vehicle{
	int numDoors;
	
	void print() {//it is overriding of function
		//when car object calls print function then this function will be executed
		//object search for print function in car and then vehicle 
		//where ever print function found first that will be executed
		System.out.println("Color "+color+"\nmax speed "+maxSpeed+"\nPrice "+price+"\nNumber of Doors "+numDoors);
		System.out.println();
	}
}

class bicycle extends vehicle{
	
}
