package strings;

import java.util.Scanner;

public class Reverse_a_string {
	
	static String reverse_string(String str) {
		System.out.print(str);
		String res="";
		for(int i=str.length()-1; i>=0; i--) {
			//going from back to begin
			res+=str.charAt(i);
		}
		
		return res;
	}
	
	static String reverse_2(String str) {
		System.out.print(str);
		String res="";
		for(int i=0; i<str.length(); i++) {
			//going of front to end 
			//res+=str.charAt(str.length() - i -1);
			
			res = str.charAt(i)+res;
		}
		
		return res;
	}
	
	public static void main(String args[] ) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nRevers of string is "+reverse_string(sc.nextLine()));
		
		System.out.println("\nRevers of string is "+reverse_2(sc.nextLine()));
	}
}
