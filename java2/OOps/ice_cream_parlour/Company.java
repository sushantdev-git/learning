package ice_cream_parlour;

import java.util.Scanner;

public class Company {
	Scanner sc = new Scanner(System.in);
	static int T_flavour = 0;
	static String flavour[] = new String[10];
	static int price[] = new int[10];
	
	void Buy(String flavour[], int price[], int T_flavour) {
		
		printFlavour(flavour,price, T_flavour);
		System.out.println("For how many people you want buy");
		int n = sc.nextInt();
		
		int total_price = 0;
		
		for(int j=0; j<n; j++) {
			
			System.out.println("Enter choice of "+(j+1)+" person: ");
			int i = sc.nextInt();
			
			if(i<=0 || i > T_flavour) {
				System.out.println("Flavour no present");
				j--;
			}
			else {
				
				System.out.println("Here is your "+flavour[i-1]+" flavoured ice cream\n");
				total_price+=price[i-1];
				
			}
			
			
		}
		
		System.out.println("You have to pay : Rs"+total_price);
		
		int p = sc.nextInt();
		while(true) {
			if(p ==  total_price) {
				break;
			}
			else if(p > total_price) {
				System.out.println("Here is your return "+(p-total_price)+" :-)");
				break;
			}
			else {
				
				System.out.println("You have to pay "+(total_price - p)+" more");
				total_price-=p;
				p = sc.nextInt();
			}
			
		}
		
		System.out.println("Thanks for buying :-)\n");
		
		
	}
	
	void printFlavour(String flavour[],int price[], int n) {
		System.out.println("\nHere is list of flavour and it's price :");
		for(int i=0; i<n; i++) {
			System.out.println((i+1)+". "+flavour[i]+" -> "+price[i]);
		}
		System.out.println("\n");
		
	}
	
	void addFlavour() {
		
		System.out.println("\nYou can only add "+(10 - T_flavour)+" more Flavour");
		
		System.out.println("Enter no of flavour you want to add : ");
		
		int no = sc.nextInt();
			
		if(no+T_flavour > 10) {

			
			System.out.println("Invalid input");
			return;
		}
		
		System.out.println("Enter "+no+" Flavour and it price :");

		for(int i=0; i<no ; i++) {
			flavour[T_flavour] = sc.next();
			price[T_flavour++] = sc.nextInt();
		}
	}
	
	
}
