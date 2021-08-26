package e_shopping;

class Bank extends Bank_account implements Bank_interface{
	
	//bank have this one withdraw function that is used by amazon to process user payment
	public boolean Withdraw(double amt) {
		
		if(amt > getBalance()) {
			//if amt is greater that user ac_balance then 
			//fail transaction
			System.err.println("\nInsufficient funds !!");
			System.err.println("Transaction failed !");
		}
		else {
			//else first authenticate user 
			
			if(authenticate() == true) {
				//if user is authenticated make transaction
				System.out.println("\nTransaction Successfull");
				setBalance(getBalance()-amt);//set user account balance to
				//previous_balance - debited value
				return true;
				
				//and return true that transaction is successful
			}
			else {
				System.err.println("\nInvalid OTP !!");
				System.out.println("Transaction failed !!");
			}
			
		}
		
		return false;
	}
}
