package college;

import java.util.Scanner;

class M1 extends Master{
	int total_student= 0;
	private int marks_obtained;
		
	M1(){
		
		total_student+=1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Total marks obtained by "+this.name+" : ");
		this.marks_obtained = sc.nextInt();
		
		//sc.close();
		
	}
	
	void setMarks(int n) {
		this.marks_obtained = n;
	}
	
	int getMarks() {
		return this.marks_obtained;
	}
	
	public void student_details() {
		super.student_details();
		System.out.println("Marks scored by student : "+super.percentage(this.marks_obtained)+"%");
		System.out.println("\n");
	}
}
