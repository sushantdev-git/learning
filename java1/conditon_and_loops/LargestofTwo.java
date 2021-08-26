package conditon_and_loops;
import java.util.Scanner;
public class LargestofTwo {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a,b;
		
		a = s.nextInt();
		b = s.nextInt();
		//Three ways of writing a same program and by down optimizing it
		//------------------------------------------------------------------
//		if(a>b) {
//			System.out.println("First number is greater");
//		}
//		if(b>a) {
//			System.out.println("Second num is greater");
//		}
//		if(a == b) {
//			System.out.println("both are equal");
//		}
		//here all if condition is checked which will take extra time
		
		//--------------------------------------------------------------
//		if(a>b) {
//			System.out.println("First number is greater");
//		}
//		else {
//			if(b>a) {
//				System.out.println("Second num is greater");
//			}
//			else {
//				System.out.println("both are equal");
//			}	
//		}
		//here code look more complicated
		
		//---------------------------------------------------------------
		
		if(a>b) {
			System.out.println("First number is greater");
		}
		else if(b>a) {
			System.out.println("Second num is greater");
		}
		else {
			System.out.println("both are equal");
		}	
		//here code is simplified and does take any extra time
		
		s.close();
	}
}
