package conditon_and_loops;

import java.util.Scanner;

public class Prime_or_not {

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		boolean isPrime = true;
		int div = 2;
		while(div <= Math.sqrt(n)) {
			if(n%div == 0) {
				isPrime = false;
				break;//here using break to break the loop;
				//you can use return also to exit from main
			}
			div = div+1;
		}
		
		if(isPrime) {
			System.out.println(n+" is a Prime No");
		}
		else {
			System.out.println(n+" is a composite No");
		}
		
		s.close();
	}
}
