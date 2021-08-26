package String_questions;

import java.util.Scanner;

public class All_substring {
	
	static void all_sub(String str) {
		String temp="";
		
		for(int i=0; i<str.length(); i++) {
			
			for(int j=i; j<str.length(); j++) {
				temp+=str.charAt(j);
				System.out.println(temp);
			}
			
			temp="";
		}
	}
	
	static void all_sub_rev(String str) {
		String temp="";
		
		for(int i =str.length()-1; i>=0 ; i--) {
			
			for(int j=i; j>= 0 ; j--) {
				temp+=str.charAt(j);
				System.out.println(temp);
			}
			
			temp="";
		}
	}
	
	static void all_sub_seq(String str) {
		
		for(int i=1; i <= str.length(); i++) {
			
			for(int j=0; j <= str.length() - i; j++) {
				int n = i+j-1;
				System.out.println(str.substring(j,n+1));
			}
		}
	}
	
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
//		all_sub(sc.nextLine());
		//all_sub_rev(sc.nextLine());
		all_sub_seq(sc.nextLine());
	}
}
