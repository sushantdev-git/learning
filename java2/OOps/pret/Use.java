package pret;
import java.util.*;

public class Use {
	
	public static void main(String args[]) {
		
		int arr[] = takeArray();
		
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		for(int i=0; i<arr.length; i++) {
			if(hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i])+1);
			}
			else {
				hm.put(arr[i], 1);
			}
		}
		
		System.out.println(hm);
		
		
	}
	
	static int[] takeArray() {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[];
		
		System.out.println("Enter size of array : ");
		int n = sc.nextInt();
		
		arr= new int[n];
		
		System.out.println("Enter "+n+" elements of Array: ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		return arr;
	}
}
