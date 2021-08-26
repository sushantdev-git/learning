package oops;
import java.util.Scanner;
public class Student {
	
	public static void main(String args[]) {
		Student_details Sushant = new Student_details("Sushant",713,"G19","Unknown",480);
		Sushant.get_details();
	}

}

class Student_details{
	
	Scanner sc = new Scanner(System.in);
	
	String name;
	int rollNo;
	String Class;
	String Address;
	double marks;
	
	Student_details(){
		
	}
	
	
	void getInput() {
		
		System.out.println("Enter student name: ");
		name=sc.next();
		
		System.out.println("Enter student Roll no: ");
		rollNo=sc.nextInt();
		
		System.out.println("Enter student Class: ");
		Class= sc.next();
		
		System.out.println("Enter student Address: ");
		Address=sc.next();
		
		System.out.println("Enter student Marks: ");
		marks=sc.nextInt();
		
		System.out.println("\n");
		
	}
	
	Student_details(String nm, int rn, String Cl,String Addr, double ma){
		name = nm;
		rollNo = rn;
		Class = Cl;
		Address = Addr;
		marks = ma;
	}
	
	double percentage() {
		
		return (marks/500)*100;
	}
	
	void get_details() {
		System.out.println("Name "+name);
		System.out.println("Roll no "+rollNo);
		System.out.println("Class "+Class);
		System.out.println("Address "+Address);
		System.out.println("Marks "+marks);
		System.out.println("Percentage "+percentage());
		System.out.println("\n");
	}
}
