package conditon_and_loops;
import java.util.Scanner;
public class Even_odd {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a no :");
		int n = s.nextInt();
		
		if(n%2 == 0) {
			System.out.println(n+" is an even no");
		}
		else {
			System.out.println(n+" is odd no");
		}
		s.close();
		
	}
}
