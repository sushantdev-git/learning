package conditon_and_loops;

import java.util.Scanner;
public class Loop {
	
	public static void main(String[] args) {
		
//		for(int i=1 ; i<=10; i++) {
//			System.out.println(i);
//		}
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int i=1;
		
		while(i<=n){
			System.out.println("Hello "+i);
			i++;
		}
		
		s.close();
	}
}
