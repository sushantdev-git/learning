package conditon_and_loops;

import java.util.Scanner;

public class Conditionals {
	
	public static void main(String[] args) {
		int a,b;
		Scanner s = new Scanner (System.in);
		a = s.nextInt();
		b = s.nextInt();
		
		if(a > b) {
			System.out.println("Inside if");
		}else 
		{
			System.out.println("Inside else");
		}
		System.out.println("Outside if else");
		
		s.close();
	}
}
