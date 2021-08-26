package bank;

public class Main {
	
	public static void main(String args[]) {
		User u1 = new User();
		
		u1.deposit();
		u1.withdraw();
		u1.deposit();
		u1.withdraw();
		u1.deposit();
		u1.withdraw();
		u1.deposit();
		u1.withdraw();
		u1.printMiniStatement();
	}
}
