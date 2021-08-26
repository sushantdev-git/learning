package Collections_Generics;

public class Generics_intro {
	
	/*
	 Many algorithms are logically the same but vary only on the type of data 
	 they are being applied to
	 
	 Generics allow you to define an algorithm once, independent of any specific
	 data type, and then apply that algorithm to a wide variety of data type without
	 any additional effort
	 */
	
	public <E> void printArray(E s[]) { //This is a generic method 
		//We need this method to avoid method overriding
		//Now our algorithm is type safe means independent of data type
		
		//here E is user defined data type
		for(E element : s) {
			System.out.printf("%s ",element);
		}
		System.out.println();
	}
	
	public <E> void printArray2(E s[], E y[]) {
		//here e can be user defined
		for(E ele : s) {
			System.out.print(ele+" ");
		}
		System.out.println();
		
		for(E ele : y) {
			System.out.print(ele+" ");
		}
		System.out.println();
	}
	
	public <E,T> void printArray3(E s[], T y[]) {
		//here E,T can be user defined
		
		
	}
	

	public static void main(String args[]) {
			
		Generics_intro obj = new Generics_intro();
		
		String str[] = {"India","Australia"};
		obj.printArray(str);
		
		Integer number[] = {12,13,14};
		obj.printArray(number);
		
		Character ch[] = {'S','u','s','h','a','n','t'};
		obj.printArray2(str,number);
		
	}
}
