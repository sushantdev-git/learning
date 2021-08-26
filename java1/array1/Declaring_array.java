package array1;

public class Declaring_array {
	static void print(int a[]){
		for(int i:a) {//accessing elements of array
			
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public static void main(String x[]) {
		
		int arr[] = new int[10]; 
		//whenever we use new in java in allocate some amount of memory to us
		//int[10] means i want a continuous memory of 10 int i.e 40 bytes;  
		
		arr = new int[20];//you change size of array afterwards
		//by default all the value of array is initialized to zero
		
		//Array Operation
		arr[5]=5; arr[8]=12;//assigning value at ith index 
		arr[6]=17;
		
		print(arr);
		
		
		//arr[-1]=18; arr[10]=12; //you can't do like this, always maintain the index range
		
		char[] cArray = new char[10];//by default all value will be null whose ascii in 0;
		double[] dArray = new double[10];//by default all value is 0.0;
		System.out.println(cArray[0]+" "+dArray[0]);
	}
	
	/*
	 Array is a data structure that contain elements in a continuous memory location
	 You just have to store address of first element and 
	 and you can directly access element by 
	 (address of first element + index*(size of type of array(int))
	 
	 because every element of int array will take 4 byte so next element 
	 will be stored after 4 byte
	 
	 That's why accessing element in an array is order 1 operation;
	 
	 Memory used by array is = length of array * size of type of array (int)
	 
	 
	 Array can be of different type int,long,double etc
	 
	 indexing in array start from 0 index and last element is present at arr.length-1
	 
	 
	*/

}
