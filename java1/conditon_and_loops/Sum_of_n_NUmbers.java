package conditon_and_loops;

import java.util.Scanner;
public class Sum_of_n_NUmbers {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int i=0,sum=0;
		
		while(i<=n) {
			sum+=i;
			i++;
		}
		System.out.println("Sum of "+n+" natural no is "+sum);
		s.close();
	}
}
