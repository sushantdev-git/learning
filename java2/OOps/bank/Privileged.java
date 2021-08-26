package bank;
import java.util.Scanner;
public class Privileged extends Account{
	Scanner sc = new Scanner(System.in);
	void deposit(int n) {
		super.deposit(n);
	}
	
	void withdraw(int n) {
		if(n > Account_balance) {
			System.out.println("Insufficent funds !!");
			System.out.println("Do you want to access overdraft facility y/n: ");
			char c = sc.next().charAt(0);
			
			if(c=='Y' || c=='y') {
				
				System.out.println("Overdraft facility accessed ");
				super.updateDB(n - Account_balance, 'O');
				System.out.println("You will be charged with interest rate '10% pa' for Rs"+(n-Account_balance)+"\n");
				Account_balance=0;
			}
		}
	}
}
