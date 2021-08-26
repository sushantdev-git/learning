package ice_cream_parlour;

import java.util.Scanner;

public class Shop1 extends Company{
	
	private String flavour[] = new String[5];
	private int price[] = new int[5];
	
	private int T_s_f = 0;
	
	Scanner sc = new Scanner(System.in);
	
	void addsplFlavour() {
			
		System.out.println("\nYou can only add "+(5 - T_s_f)+" more Flavour");
		
		System.out.println("Enter no of flavour you want to add : ");
		
		int no = sc.nextInt();
			
		if(no+T_s_f > 5) {

			
			System.out.println("Invalid input");
			return;
		}
		
		System.out.println("Enter "+no+" Flavour and it price :");

		for(int i=0; i<no ; i++) {
			flavour[T_s_f] = sc.next();
			price[T_s_f++] = sc.nextInt();
		}
	}
	
	void Buy() {
		
		System.out.println("Which flavour you want to buy \n1. Normal\2. Special");
		int n = sc.nextInt();
		
		if(n == 1) {
			super.Buy(Company.flavour,Company.price,T_flavour);
			return;
		}
		else {
			
			super.Buy(this.flavour,this.price,this.T_s_f);
			
		}
	}
	
	void addFlavour() {
		super.addFlavour();
	}
	
	
}
