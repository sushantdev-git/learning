package function_and_scope;
import java.util.Scanner;
public class Check_prime {
	
	public static boolean checkPrime(int n) {
		
		int d =2;
		
		while(d <= n/2) {
			
			if(n%d ==0) {
				return false;
			}
			d+=1;
		}
		return true;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(checkPrime(n));
		
		sc.close();
				
	}

}
