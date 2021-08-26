package array1;

public class Primitive_with_functions {
	
	static void increment(int i) {
		i++;
	}
	
	static void print(int arr[]) {
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	static void increment_arr(int input[]) {
		System.out.println(input);
		
		input = new int[7];//here input is pointing to new array of length 7
		//not to that array that is passed into this function
		//by default all the values of array is initialized to zero;
		
		for(int i=0; i<input.length;i++) {
			input[i]+=1;
		}
		print(input);
	}
	
	public static void main(String x[]) {
			
		int i=10;
		increment(i);
		System.out.println(i);//here value of i is passed in function means 10 is passed in function
		
		int arr[] = {1,2,3,4,5};
		
		System.out.println(arr);//this will print the refrence of arr
		
		increment_arr(arr);//but here refrence of array is passed means 
		//where array is stored in memory that is passed
		//it is still not pass by refrence because 
		//in argument of increment_arr() the refrence of arr is copied and then passed to function
		//arr in main and input in increment_arr() is pointing to same array
		//length of arr is also copied
		
		print(arr);
	}
}
