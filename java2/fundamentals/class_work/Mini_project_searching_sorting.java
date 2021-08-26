package class_work;
import java.util.Scanner;
public class Mini_project_searching_sorting {
	
	
	static void print(final int[] arr) {
        for (final int i : arr) {
            System.out.print(String.valueOf(i) + " ");
        }
        System.out.println();
    }
	
	//------------------------------------------------------------------------
	static int[] takeInput() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of array = ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter "+n+" elements of array = ");
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		return arr;
	}
	
	//------------------------------------------------------------------------
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		searchingSorting ss = new searchingSorting();
		int arr[];
		
//		int arr[]= {4 ,5 ,1, 3 ,6};
		while(true) {
			System.out.println("Below the index of different searching and sorting alorithm is given:");
			System.out.println("1.Linear search\n2.Binary search\n3.Bubble sort\n4.Insertion sort\n5.Selection sort\n6.Merge sort");
			System.out.println("Enter an index to process ahead = ");

			int input = sc.nextInt();
			
			if(input == 0) {
				break;
			}
			
			arr = takeInput();
			switch(input) {
				
			case 1:
				System.out.println("Enter element you want to search:");
				int x = sc.nextInt();
				System.out.println("Elment found at index = "+ss.l_search(arr, x));
				System.out.println("\n");
				break;
			case 2:
				System.out.println("Enter element you want to search:");
				x = sc.nextInt();
				System.out.println("Elment found at index = "+ss.b_search(arr,0,arr.length-1, x));
				System.out.println("\n");
				break;
			case 3:
				arr = ss.bubble_sort(arr);
				print(arr);
				System.out.println("\n");
				break;
			case 4:
				arr = ss.in_sort(arr);
				print(arr);
				System.out.println("\n");
				break;
			case 5:
				arr = ss.s_sort(arr);
				print(arr);
				System.out.println("\n");
				break;
			case 6:
				arr = ss.mergeSort(arr,0,arr.length-1);
				print(arr);
				System.out.println("\n");
				break;
			default:
				System.out.println("Invalid input !!!");
			}
		}
		
		sc.close();
		
		
	}
}

//-------------------------------------------------------------------------------------------
class searchingSorting{
	
	 
	
	 int b_search(final int[] arr, final int l, final int r, final int n) {
	        if (l > r) {
	            return -1;
	        }
	        final int mid = l + (r - l) / 2;
	        if (arr[mid] == n) {
	            return mid;
	        }
	        if (arr[mid] > n) {
	            return this.b_search(arr, l, mid - 1, n);
	        }
	        return this.b_search(arr, mid + 1, r, n);
	  }
	 
	 //------------------------------------------------------------------------------
	 
	 int l_search(final int[] arr, final int x) {
	        for (int i = 0; i < arr.length; ++i) {
	            if (arr[i] == x) {
	                return i;
	            }
	        }
	        return -1;
	 }
	 
	 
	//------------------------------------------------------------------------------
	 
	 int[] bubble_sort(int[] arr) {
		 
		 int temp;
		 
		 for (int i=0; i<arr.length-1; i++) {
			 
			 for(int j=0; j<arr.length-i-1; j++) {
				 
				 if(arr[j] > arr[j+1]) {
					 temp = arr[j];
					 arr[j]=  arr[j+1];
					 arr[j+1]=temp;
				 }
			 }
		 }
		 
		 return arr;
	 }
	 
	//------------------------------------------------------------------------------
	 
	 int[] s_sort(int[] arr) {
	        for (int i = 0; i < arr.length - 1; ++i) {
	            int min = i;
	            for (int j = i + 1; j < arr.length; ++j) {
	                if (arr[j] < arr[min]) {
	                    min = j;
	                }
	            }
	            int temp = arr[min];
	            arr[min] = arr[i];
	            arr[i] = temp;
	        }
	        
	        return arr;
	   }
	 
	//------------------------------------------------------------------------------
	 
	 int [] in_sort(final int[] arr) {
	        for (int i = 1; i < arr.length; ++i) {
	            final int temp = arr[i];
	            for (int j = i - 1, k = i; j >= 0; --j, --k) {
	                if (arr[j] > arr[k]) {
	                    arr[k] = arr[j];
	                    arr[j] = temp;
	                }
	            }
	        }
	        
	        return arr;
	    }
	 
	//------------------------------------------------------------------------------
	 
	 void merge(final int[] a, final int l, final int m, final int r) {
	        final int n1 = m - l + 1;
	        final int n2 = r - m;
	        final int[] L = new int[n1];
	        final int[] R = new int[n2];
	        System.arraycopy(a, l, L, 0, n1);
	        System.arraycopy(a, m + 1, R, 0, n2);
	        int i = 0;
	        int j = 0;
	        int k = l;
	        while (i < n1) {
	            if (j >= n2) {
	                break;
	            }
	            if (L[i] <= R[j]) {
	                a[k] = L[i];
	                ++i;
	            }
	            else {
	                a[k] = R[j];
	                ++j;
	            }
	            ++k;
	        }
	        while (i < n1) {
	            a[k] = L[i];
	            ++i;
	            ++k;
	        }
	        while (j < n2) {
	            a[k] = R[j];
	            ++j;
	            ++k;
	        }
	    }
	    
	   int[] mergeSort(final int[] a, final int l, final int r) {
	        if (r - l > 0) {
	            final int m = l + (r - l) / 2;
	            mergeSort(a, l, m);
	            mergeSort(a, m + 1, r);
	            merge(a, l, m, r);
	        }
	        
	        return a;
	    }
}
