package package1;

import java.util.Scanner;

public class Vehicle {
	
	int numWheels;
	int speed;
	String vehicle_type;
	String color;
	
	Vehicle(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter vehicle type: ");
		vehicle_type = sc.next();
		
		
		System.out.println("Enter no of wheels "+this.vehicle_type+": ");
		numWheels = sc.nextInt();
		
		System.out.println("Enter Max speed "+this.vehicle_type+": ");
		speed = sc.nextInt();
		
		
		System.out.println("Enter color "+this.vehicle_type+": ");
		color = sc.next();
		
	}
	
	void getInfo(){
		System.out.println("\n");
		System.out.println("Vehicle type "+this.vehicle_type);
		System.out.println("Number of wheels "+this.numWheels);
		System.out.println("Color "+this.color);
		System.out.println("Max speed "+this.speed);
		
		
	}
	
	
}
