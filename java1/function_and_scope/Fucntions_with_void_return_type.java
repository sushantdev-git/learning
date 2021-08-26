package function_and_scope;

public class Fucntions_with_void_return_type {
	
	public static int divideNumbers(int num, int deno) {
		
		if(deno == 0) {
			return Integer.MIN_VALUE;
		}
		
		return num/deno;
	}
	
	public static void printDivision(int n, int d) {
		if(d == 0) {
			
			System.out.println("division by zero is not allowed");
			return;
		}
		System.out.println(n/d);
	}
	
	public static void main(String x[]) {
		
			int num = 8;
			int deno = 0;
			int result = divideNumbers(num,deno);
			System.out.println(result);
			printDivision(num,deno);
	}

}
