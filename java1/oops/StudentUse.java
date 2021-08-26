package oops;

//import java.util.Scanner;

public class StudentUse {
	
	public static void main(String args[]) {
		
		//Scanner s = new Scanner(System.in);
		
		//s is object of class
		//new is used to allocate memory
		
		
		//This is how an object of a class is created
		Student s1 = new Student();//Object of student class
		Student s2 = new Student();
		System.out.println(s1+" "+s2);//s1 store address where s1 object is stored
		
		//s1 , s2 stored is stack
		//and real objects are stored in heap
		
		s1.name = "Sushant";
		s1.rollNumber = 12;
		s2.name = "Rahul";
		s2.rollNumber = 55;
		
		//s1.marks = 100;//you can't do this because marks is a private propery of class
		//and can be accessed within the class only
		s1.set_marks(89);
		System.out.println(s1.get_marks());
		
		//you can change properties of objects outside the class
		//and also read that properties
		
		System.out.println(s1.name+" "+s1.rollNumber);
		System.out.println(s2.name+" "+s2.rollNumber);
		
		//s1 and s2 are totally different from each other
		//and have no relation in between 
		//only relation is that they are object of same class
	}
}
