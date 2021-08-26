package String_questions;

import java.util.Scanner;

public class Check_permutation {
	static boolean isPermutation(String str1, String str2) {
		//Your code goes here
        int ascii_arr[] = new int[26];
        
        for(int i=0; i<str1.length(); i++){
            ascii_arr[((int)str1.charAt(i))-97]++;
        }
        
        for(int i=0; i<str2.length(); i++){
            ascii_arr[((int)str2.charAt(i))-97]--;
        }
        
        for(int i: ascii_arr) {
        	System.out.print(i+" ");
        }
        
        for(int i=0; i<ascii_arr.length; i++){
            if(ascii_arr[i] != 0){
                return false;
            }
        }
        
        return true;
	}
	
	public static void main(String arg[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(isPermutation(sc.next(),sc.next()));


	}
}
