package phone;

import java.util.Scanner;

class Samsung extends Phone{
	
	private String company = "Samsung";
	private int price;
	
	Samsung(){
		super("Samsung");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter "+this.model_name+" price : ");
		this.price = sc.nextInt();
		
	}
	
	
	void get_details() {
		System.out.println("\n-------------------------------------");
		System.out.println("Company : \t"+ this.company);
		System.out.println("Model : \t"+this.model_name);
		System.out.println("Camera : \t"+this.camera);
		System.out.println("Processor : \t"+this.processor);
		System.out.println("Screen size : \t"+this.screen_size+" inches");
		System.out.println("Screen Resolution : \t"+this.resolution+" px");
		System.out.println("Storage : \t"+this.storage+"GB");
		System.out.println("Fingerprint : \t"+this.finger_print);
		System.out.println("Battery : \t"+this.battery_size+"mah");
		System.out.println("Price : \t"+this.price);
		System.out.println("---------------------------------------\n");
	}
	
	int getPrice() {
		return this.price;
	}
	
	void setPrice(int n)
	{
		this.price = n;
	}
	
}
