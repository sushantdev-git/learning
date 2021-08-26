package fundamentals;

public class Arithmetic_operators {

	public static void main(String[] args) {
		int a =10;
		int b=30;
		int c= a/b; 
		System.out.println(c);
		
		//if you perform division(/) on two integer the answer is will be integer
		// 10/30 is 0 because both 10 and 30 are int
		// double c = 10/30 will give 0.0 because performing divsion on int
		// will give int and then it will be converted to double
		
		
		
		c = 3 + 2 / 5; //division will happen first
		//  /,*,% is of same precedence order
		//  +,- is of same precedence
		// if operator is of same precedence then evaluation take place from left to right
		
		System.out.println(c);
		
		b = 10;
		a = 3;
		c = b/(2*a);
		System.out.println(c);
		
	}
}
