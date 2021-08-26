package oops;

public class Student_array {

	public static void main(String args[]) {
		
		Student_details s[] = new Student_details[2];
		
		for(int i=0; i<2; i++) {
			System.out.println("Enter details of student "+(i+1));
			s[i] = new Student_details();
			s[i].getInput();
			s[i].get_details();
		}
		
	}
}
