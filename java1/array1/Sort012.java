package array1;

import java.util.Scanner;

public class Sort012 {
	public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.println();
    }
    
	public static int[] input(int n) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[n];
		
		for(int i=0; i<n;i++) {
			
			arr[i]=sc.nextInt();
			
		}
		
		sc.close();
		
		return arr;
	}
    public static void sort012(int[] arr){
    	//Your code goes here
        
        int i=0, one_i=0, temp; 
        
        while(i<arr.length){
            
            if(arr[i] == 0){
                temp=arr[one_i];
                arr[one_i]=arr[i];
                arr[i]=temp;
                one_i++;
            }
            i++;
        }
        
        printArray(arr);
        
        i=0;
        one_i=arr.length-1;
        while(i<arr.length && i<one_i){
            
            if(arr[i] == 2 && arr[one_i] != 2){
            	System.out.println("i "+i+" two_index "+one_i);
                temp=arr[one_i];
                arr[one_i]=arr[i];
                arr[i]=temp;
                one_i--;
                printArray(arr);
            }
            
            if(arr[i] == 2 && arr[one_i] == 2) {
            	one_i--;
            	continue;
            }
            
            i++;
        }
    }
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
//		int arr[]= input(sc.nextInt());
//		
//		sort012(arr);
//		
//		printArray(arr);
		
		System.out.println(15/10);
		
		sc.close();
		
	}
}
