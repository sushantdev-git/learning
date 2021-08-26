package card;
import java.util.Scanner;
public class Bank_account implements Credit_card{
	
	private int Account_balance = 100000;
	
	private int user_pin = 8403;
	
	Scanner sc = new Scanner(System.in);
	
	private void Transaction(double cost) {
		//this function is perform transaction
		
		if(cost > Account_balance) {
			System.out.println("Insufficient funds !!");
			System.err.println("Transaction failed !!\n");
		}
		else {
			Account_balance-=cost;
			System.out.println("Transaction successfull\n");
		}
	}
	
	private boolean authenticate() {
		//this function is to authenticate user
		
		System.out.println("\nEnter your 4 digit private pin :");
		int pin = sc.nextInt();
		if(pin == user_pin) {
			return true;
		}
		
		return false;
	}
	
	public void payRupees() {
		//this function to pay in rupees
		System.out.println("\nEnter cost in Rupees : ");
		double cost = convert_to_rupees('R', sc.nextDouble());
		if(authenticate() == true) {
			Transaction(cost);
		}
		else {
			System.out.println("Invalid pin");
		}
			
	}
	
	public void payDollars() {
		//this function in use to pay in dollars
		
		System.out.println("\nEnter cost in Dollars: ");
		double cost = convert_to_rupees('D', sc.nextDouble());
		if(authenticate() == true) {
			Transaction(cost);
		}
		else {
			System.out.println("Invalid pin");
		}
		
	}
	
	public void payPounds() {
		
		System.out.println("\nEnter cost in pound :");
		double cost = convert_to_rupees('P', sc.nextDouble());
		if(authenticate() == true) {
			Transaction(cost);
		}
		else {
			System.out.println("Invalid pin");
		}
	}
	
	private double convert_to_rupees(char c, double cost) {
		
		if(c == 'R') {
			
			return cost;
		}
		
		if(c == 'D') {
			
			return cost*72.44;
		}
		
		if(c == 'P') {
			
			return cost*100.48;
		}
		
		return 0;
	}
	
	public void getBalance() {
		System.out.println("Your account Balance is : "+Account_balance);
	}
	
	
}
