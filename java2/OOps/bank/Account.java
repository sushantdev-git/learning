package bank;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;  

public class Account implements Account_interface{
	
	static int Account_balance = 0;
	static String min_s[] = new String[10];
	static int s=0;
	
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
	LocalDateTime now = LocalDateTime.now();
	
	void deposit(int n) {
		Account_balance+=n;
		System.out.println("Rs "+n+" deposited in account ");
		System.out.println("Update account balance "+Account_balance+"\n");
		updateDB(n, 'D');
	}
	
	void withdraw(int n) {
		
		if(n > Account_balance) {
			System.out.println("Insufficent funds !!!");
			return;
		}
		
		Account_balance-=n;
		System.out.println("Rs "+n+" withdrawl from account");
		System.out.println("Updated account balance "+Account_balance+"\n");
		updateDB(n, 'W');
	}
	
	void updateDB(int n,char type) {
		if(type == 'D') {
			String st = dtf.format(now)+" Deposit "+n+" "+Account_balance;
			if(s > 10) {
				removeLast();
				min_s[s++] = st;
			}
			else {
				min_s[s++] = st;
			}
		}
		else if(type == 'W') {
			String st = dtf.format(now)+" Withdraw "+n+" "+Account_balance;
			if(s > 10) {
				removeLast();
				min_s[s++] = st;
			}
			else {
				min_s[s++] = st;
			}
		}
		else if(type == 'O') {
			String st = dtf.format(now)+" OverDraft "+n+" "+0;
			if(s > 10) {
				removeLast();
				min_s[s++] = st;
			}
			else {
				min_s[s++] = st;
			}
		}
	}
	
	void removeLast() {
		int j=0;
		for(int i=1; i<s; i++) {
			min_s[j] = min_s[i];
			j++;
		}
		s-=1;
	}
	
	public void printMiniStatement() {
		System.out.println("Date\t\t Time\t Type\t\t Amount\t Updated Balance");
		
		String temp[];
		
		for(int i=0; i<s; i++) {
			temp = min_s[i].split(" ");
			System.out.println(temp[0]+"\t "+temp[1]+"\t "+temp[2]+"\t "+temp[3]+"\t "+temp[4]);
		}
	}
}
