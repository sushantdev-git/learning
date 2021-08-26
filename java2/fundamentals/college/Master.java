package college;

import java.util.Scanner;

class Master extends Student{
	
	String Degree="Master";
	String course;
	
	int Total_subject;
	
	Master(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter "+this.name+" "+this.Degree+" degree: ");
		this.Degree = sc.next();
		System.out.print("Enter "+this.name+" course : ");
		this.course = sc.next();
		
		System.out.print("Enter total number of subjects in "+this.course+" : ");
		this.Total_subject=sc.nextInt();
		
		//sc.close();
	}
	
	int percentage(int n) {
		return n*100/(Total_subject*100);
	}
	
	void student_details(){
		System.out.println("\n");
		System.out.println("College :"+this.c_name);
		System.out.println("College Address :"+this.c_address);
		System.out.println("Name :"+this.name);
		System.out.println("Roll No :"+this.rollNo);
		System.out.println("Phone No :"+this.PhoneNo);
		System.out.println("Address :"+this.Address);
		System.out.println("Degree :"+this.Degree);
		System.out.println("Course :"+this.course);
		System.out.println("Total Subject :"+this.Total_subject);
	}
}
