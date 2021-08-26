package array1;

public class Data_type {
	
	public static void main(String x[]) {
		
		/*
		 Data types are of two types:
		 Primitive:
		 	int, char, double, long etc.
		 	
		 	in primitive data type:
		 	int i=1;
		 	some where 4 byte memory is created and 1 is stored in that memory 
		 	and the name of memory becomes i;
		 	
		 Non-primitive:
		 	Arrays, Strings, Scanner
		 	
		 	in non-primitive data type
		 	int arr[]=new int[5];
		 	
		 	some where 20 byte memory is allocated and 
		 	arr store refrence of that memory and length of array
		 	
		 	
		 	all not primitive data type store refrence
		 */
		
		int arr[]= {1,2,3,4,5};
		System.out.println(arr);//this will the address of the array
		System.out.println(arr.length);
	}
}
