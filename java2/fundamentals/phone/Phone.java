package phone;

import java.util.Scanner;

class Phone {
	String model_name;
	int battery_size;
	double screen_size;
	String resolution;
	String camera;
	int storage;
	boolean finger_print;
	String processor;
	
	Phone(String company){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Company "+company);
		System.out.print("Enter model : ");
		this.model_name = sc.nextLine();
		
		System.out.print("Enter Battery size : ");
		this.battery_size = sc.nextInt();
		
		System.out.print("Enter Screen size : ");
		this.screen_size = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("Enter Screen Resolution : ");
		this.resolution = sc.nextLine();
		
		System.out.print("Enter Camera details : ");
		this.camera = sc.nextLine();
		
		System.out.print("Enter Storage size : ");
		this.storage = sc.nextInt();
		
		System.out.print("Fingerprint Available true/false : ");
		this.finger_print = sc.nextBoolean();
		sc.nextLine();
		
		System.out.print("Enter Processor details : ");
		this.processor = sc.nextLine();
		
		
	}
}
