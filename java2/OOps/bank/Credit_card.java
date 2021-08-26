package bank;

public class Credit_card extends Account{
	
	void deposit(int n) {
		if(n> 30000 || n<10000) {
			System.out.println("Can't deposit !!");
		}
		else {
			super.deposit(n);
		}
	}
	
	void withdraw(int n) {
		if(n>25000) {
			System.out.println("Limit exceeded !!");
		}
		else {
			super.withdraw(n);
		}
	}
}	
