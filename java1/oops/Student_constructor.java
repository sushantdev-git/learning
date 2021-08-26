package oops;

public class Student_constructor {
	
	public String name;
	private int rollNo;
	
	public Student_constructor() {
		//default constructor
	}
	
	public Student_constructor(String name, int rollNo) {
		
		this.name = name;
		this.rollNo = rollNo;
	}
	
	public void print() {
		System.out.println(name+" "+rollNo);
	}
	
	public int getRollno() {
		return this.rollNo;
	}
}
