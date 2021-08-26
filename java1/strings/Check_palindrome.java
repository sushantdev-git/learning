package strings;

import java.util.Scanner;

public class Check_palindrome {
	static boolean isPlaindrome(String str) {
		
		int i=0, j=str.length()-1;
		
		while(i<j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		
		return true;
	}
	
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println(isPlaindrome(s.next()));
	}
}
