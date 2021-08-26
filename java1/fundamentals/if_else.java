package fundamentals;

import java.util.Scanner;

public class if_else {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a no: ");
		int a;
		
		a = scan.nextInt();
		
		if(a%2 ==0) {
			System.out.println("You Entered a even no");
		}else {
			System.out.println("YOu entered a odd no");
		}
		System.out.println("new no is "+(++a));
		
		scan.close();
	}
}
