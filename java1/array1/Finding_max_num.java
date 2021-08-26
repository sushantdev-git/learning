package array1;

import java.util.Scanner;

public class Finding_max_num {
	
	static int[] takeInput() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of array");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Enter element at "+i+"th index =  ");
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		
		return arr;
	}
	
	public static int largest(int arr[]) {
		
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		
		return max;
		
	}
	
	public static void main(String args[]) {
		
		int arr[] = takeInput();
		
		int lar = largest(arr);
		
		System.out.println(lar);
		
		
	}

}
