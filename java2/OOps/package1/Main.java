package package1;

import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		
		Car c1 = new Car();
		c1.getInfo();
	}
}

class Car extends Vehicle{
	int numDoors;
	private String Model;
	private int price;
	Car(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of Doors "+this.vehicle_type+": ");
		numDoors = sc.nextInt();
		
		System.out.println("Enter Model "+this.vehicle_type+": ");
		Model = sc.next();
		
		System.out.println("Enter Price of "+this.vehicle_type+": ");
		price = sc.nextInt();
	}
	
	void getInfo(){
		super.getInfo();
		System.out.println("Model "+this.Model);
		System.out.println("Number of Doors "+this.numDoors);
		System.out.println("Price of vehicle "+this.price);
			
	}
}

class Truck extends Vehicle{
	int numDoors;
	private String Model;
	private int price;
	
	Truck(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Doors "+this.vehicle_type+": ");
		numDoors = sc.nextInt();
		
		System.out.println("Enter Model "+this.vehicle_type+": ");
		Model = sc.next();
		
		System.out.println("Enter Price of "+this.vehicle_type+": ");
		price = sc.nextInt();
	}
	
	void getInfo(){
		super.getInfo();
		System.out.println("Number of Doors "+this.numDoors);
		System.out.println("Model "+this.Model);
		System.out.println("Price of vehicle "+this.price);
		
		
	}
}

class Bicycle extends Vehicle{
	private String Model;
	private int price;
	Bicycle(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Model "+this.vehicle_type+": ");
		Model = sc.next();
		
		System.out.println("Enter Price of "+this.vehicle_type+": ");
		price = sc.nextInt();
	}
	
	void getInfo(){
		super.getInfo();
		System.out.println("Model "+this.Model);
		System.out.println("Price of vehicle "+this.price);
			
	}
}
