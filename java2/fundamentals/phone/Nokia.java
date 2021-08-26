package phone;

import java.util.Scanner;

class Nokia extends Phone{
	private String company = "Nokia";
	private int price;
	
	Nokia(){
		super("Nokia");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter "+this.model_name+" price : ");
		this.price = sc.nextInt();
		
	}
	
	
	void get_details() {
		System.out.println("Company :"+ this.company);
		System.out.println("Model :"+this.model_name);
		System.out.println("Camera :"+this.camera);
		System.out.println("Processor :"+this.processor);
		System.out.println("Screen size :"+this.screen_size+" inches");
		System.out.println("Screen Resolution :"+this.resolution+" px");
		System.out.println("Storage :"+this.storage+"GB");
		System.out.println("Fingerprint : "+this.finger_print);
		System.out.println("Battery : "+this.battery_size+"mah");
		System.out.println("Price :"+this.price);
	}
	
	int getPrice() {
		return this.price;
	}
	
	void setPrice(int n)
	{
		this.price = n;
	}
	
}
