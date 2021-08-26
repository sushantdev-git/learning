package bank;
import java.util.Scanner;
public class User{
	
	Scanner sc = new Scanner(System.in);
	Account_interface a1 = new Account();
	
	void deposit() {
		a1.deposit();
	}
	
	void withdraw() {
		a1.withdraw();
	}
	void printMiniStatement() {
		a1.printMiniStatement();
	}
}
