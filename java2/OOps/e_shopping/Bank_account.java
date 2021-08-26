package e_shopping;

import java.util.Scanner;

public class Bank_account{
	//in this class we have user bank details 
	static double Account_balance = 0;
	Scanner sc = new Scanner(System.in);
	
	double getBalance() {
		//this function will be used by bank to get 
		//user account balance at time of transaction 
		return Account_balance;
	}
	
	void setBalance(double amt) {
		//this function can be used by bank and user to set balance
		if(amt < 0) {
			System.err.println("Invalid amount !!");
			return;
		}
		Account_balance = amt;
	}
	
	boolean authenticate(){
		//this is function that bank can use to verify user
		
		User u1 = new User();//making object of user to get his otp
		
		System.out.print("\nEnter your 4 digit otp you get : ");
		if(sc.nextInt() == u1.get_otp()) {
			
			//if otp entered by user and given by bank is same then return true
			return true;
		}
		
		return false;
	}
	
	
}
