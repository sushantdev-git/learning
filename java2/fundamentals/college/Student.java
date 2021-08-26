package college;

import java.util.Scanner;

public class Student extends College{
	
	int rollNo;
	String name;
	String PhoneNo;
	String Address;
	
	public Student(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter student name : ");
		this.name = sc.next();
		System.out.print("Enter "+this.name+" Roll Number : ");
		this.rollNo = sc.nextInt();
		System.out.print("Enter "+this.name+" Phone Number : ");
		this.PhoneNo = sc.next();
		System.out.print("Enter "+this.name+" Address : ");
		this.Address = sc.next();
		
		//sc.close();
	}
	
	
}


