package strings;

import java.util.Scanner;

public class Take_string_input {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		String str;
		str = sc.next();//next take one token of input
		//means next take input till it find a delimiter
		//example of delimiter: " ", '\t', '\n'
		System.out.println(str+" "+str.length());
		
		str = sc.nextLine();
		//nextLine take input till it find '\n'
		System.out.println(str+" "+str.length());
		
		
		//print all character of a string
		str="Hello how are you????????";
		for(int i=0; i<str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}
}
