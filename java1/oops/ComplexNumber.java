package oops;

public class ComplexNumber {
	int real;
	int imaginary;
	
	ComplexNumber(int real,int imaginary){
		this.real = real;
		this.imaginary = imaginary;
		
	}
	
	public void print() {
		System.out.println(this.real+" + i"+this.imaginary);
	}
	
	public void add(ComplexNumber c2) {
		this.real  = this.real+c2.real;
		this.imaginary = this.imaginary+c2.imaginary;
	}
	
	public void multiply(ComplexNumber c2) {
		int real = this.real*c2.real - this.imaginary*c2.imaginary;
		int imaginary = this.real*c2.imaginary + c2.real*this.imaginary;
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public static ComplexNumber add(ComplexNumber c1,ComplexNumber c2) {
		int real = c1.real+c2.real;
		int imaginary = c1.imaginary+c2.imaginary;
		
		ComplexNumber c3 = new ComplexNumber(real,imaginary);
		
		return c3;
		
	}
	
	public static void main(String args[]) {
		
		ComplexNumber c1 = new ComplexNumber(4,5);
		c1.print();
		ComplexNumber c2 = new ComplexNumber(1,2);
		c2.print();
		
		c1.multiply(c2);
		
		c1.print();
	}
}
