package function_and_scope;

import java.util.Scanner;

public class Calculating_nCr {
	
	public static int fact(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		return fact;
	}
	
	public static int nCr(int n, int r) {
		int n_fact=fact(n);
		int r_fact=fact(r);
		int n_r_fact=fact(n-r);
		return n_fact/(r_fact*n_r_fact);
	}
	
	public static void main(String x[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int r = sc.nextInt();
		
		System.out.println("Combination of "+n+" to "+r+" is "+nCr(n,r));
		
		
		sc.close();
		
		/*
		 We use functions to remove repetitive task
		 And, we use function to increase readability of code
		 And, we use function to increase Testability of code
		 //in java function you can not return more than one value
		*/
		
	}


}
