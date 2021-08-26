package card;

public class Main {
	
	public static void main(String args[]) {
		
		Credit_card c1 = new Bank_account();
		
		c1.payDollars();
		c1.getBalance();
		
		c1.payPounds();
		c1.getBalance();
		
		c1.payRupees();
		c1.getBalance();
		
		c1.payDollars();
	}
}
