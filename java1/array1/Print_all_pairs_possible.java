package array1;

public class Print_all_pairs_possible {
	
	static void printAllpairs(int arr[]) {
		
		for(int i=0; i<arr.length-1;i++) {
			
			for(int j=i+1; j<arr.length;j++) {
				System.out.print("("+arr[i]+","+arr[j]+")");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int arr[]= {1,4,7,6,5};
		
		printAllpairs(arr);

	}

}
