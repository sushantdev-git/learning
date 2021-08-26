package bank;
import java.util.Scanner;
public interface Account_interface {
	Scanner sc = new Scanner(System.in);
	void printMiniStatement();
	
	default void deposit() {
		System.out.println("Choose a account type to Deposit :\n"
				+ "1. Saving\n"
				+ "2. Current\n"
				+ "3. Privileged\n"
				+ "4. Or credit Card");
		int n = sc.nextInt();
		if(n == 1) {
			Saving s1 = new Saving();
			System.out.print("Enter amount you want to deposit: ");
			s1.deposit(sc.nextInt());
		}
		else if(n==2) {
			Current s1 = new Current();
			System.out.print("Enter amount you want to deposit: ");
			s1.deposit(sc.nextInt());
		}
		else if(n==3) {
			Privileged s1 = new Privileged();
			System.out.print("Enter amount you want to deposit: ");
			s1.deposit(sc.nextInt());
		}
		else if(n==4) {
			Credit_card s1 = new Credit_card();
			System.out.println("Limit of deposit with credit card\nMin Rs10000\nMax Rs30000");
			System.out.print("Enter amount you want to deposit: ");
			s1.deposit(sc.nextInt());
		}
		
	}
	
	default void withdraw() {
		System.out.println("Choose a account type to withdrawl :\n"
				+ "1. Saving\n"
				+ "2. Current\n"
				+ "3. Privileged\n"
				+ "4. Or Credit card");
		int n = sc.nextInt();
		if(n == 1) {
			Saving s1 = new Saving();
			System.out.print("Enter amount you want to withdraw: ");
			s1.withdraw(sc.nextInt());
		}
		else if(n==2) {
			Current s1 = new Current();
			System.out.print("Enter amount you want to withdraw: ");
			s1.withdraw(sc.nextInt());
		}
		else if(n==3) {
			Privileged s1 = new Privileged();
			System.out.print("Enter amount you want to withdraw: ");
			s1.withdraw(sc.nextInt());
		}
		else if(n==4) {
			Credit_card s1 = new Credit_card();
			System.out.println("You can withdraw Max Rs25000");
			System.out.print("Enter amount you want to withdraw: ");
			s1.withdraw(sc.nextInt());
		}
	}
}
