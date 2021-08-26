package array1;
import java.util.Scanner;
public class Taking_input_in_array {
	
	static void print_array(int arr[]) {
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		
	}
	
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

	public static void main(String[] args) {
		
			
		int arr[] = takeInput();
		
		print_array(arr);
		
	}

}
