package oops;
import java.util.Scanner;
public class Student1_ {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		Student_details s1 = new Student_details();
		
		System.out.println("Enter student name: ");
		s1.name=sc.next();
		
		System.out.println("Enter student Roll no: ");
		s1.rollNo=sc.nextInt();
		
		System.out.println("Enter student Class: ");
		s1.Class= sc.next();
		
		System.out.println("Enter student Address: ");
		s1.Address=sc.next();
		
		System.out.println("Enter student Marks: ");
		s1.marks=sc.nextInt();
		
		
		s1.get_details();
		
		sc.close();
		
		Student_details s2 = new Student_details("A",12,"G","Unknown",500);
		
		s2.get_details();
		
	}
}
