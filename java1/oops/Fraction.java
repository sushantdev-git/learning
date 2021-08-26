package oops;

public class Fraction {
	
	private int numerator;
	private int denominator;
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
		simplify();
	}
	
	private void simplify() {
		//here we are using private because there is no need to call simplify function outside the class
		
		int gcd = 1;
		
		int smaller = Math.min(numerator, denominator);
		
		for(int i=2; i<=smaller; i++) {
			if(numerator %i == 0 && denominator%i == 0) {
				gcd = i;
			}
		}
		
		numerator/=gcd;
		denominator/=gcd;
		
	}
	
	//all those function that should be called outside of the class must be public 
	public void increment() {
		
		numerator = numerator+ denominator;
		simplify();
	}
	
	
	
	public void print() {
		System.out.println(numerator+"/"+denominator);
	}
	
	public void add(Fraction f2) {
		this.numerator = this.numerator*f2.denominator+f2.numerator*this.denominator;
		this.denominator = this.denominator*f2.denominator;
		
		simplify();
	}
	
	public static Fraction sum(Fraction f1, Fraction f2) {
		
		int n,d;
		
		d = f1.denominator*f2.denominator;
		
		n = f1.numerator*f2.denominator+f2.numerator*f1.denominator;
		
		Fraction f3 = new Fraction(n,d);
		
		return f3;
	}
	
	
	public static void main(String args[]) {
		Fraction f1 = new Fraction(4,6);
		Fraction f2 = new Fraction(4,8);
		
		f1.print();
//		f1.increment();
//		f1.print();
		f2.print();
		
		f1.add(f2);
		
		f1.print();
		
		Fraction f3 = Fraction.sum(f1,f2);
		f3.print();
		
	}
}
