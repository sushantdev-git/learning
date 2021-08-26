package Collections_Generics;

public class Wrapper_class {
	
	/*
	 wrapper class is used to convert primitive data type into object
	 and vice - versa
	 
	 java.lang package is known as wrapper class in java
	 
	 
	 Autoboxing - automatic conversion to primitive data type to corresponding
	 				wrapper class , ex - boolean to Boolean
	 				
	 unboxing - automatic conversion of Wrapper object of primitve data type 
	 			is known as unboxing, ex - Integer to int
	 
	 primitive type 						Wrapper Class
	 boolean								Boolean
	 char									Character
	 int									Integer
	 */
	public static void main(String argsp[]) {
		
		int a=20;
		//Autoboxing
		Integer z = Integer.valueOf(a); //converting int to Integer object
		Integer j = a;//after java 5 compiler will automatically convert to wrapper class object
		
		
		
		System.out.println(a+" "+z+" "+j);
		
		//unboxing
		int x = z.intValue();
		int y = j;
		
		System.out.println(x+" "+j+y);
		System.out.println();
		
		byte b=10;
		short s=20;
		int i=30;
		long l=40;
		
		Byte byteobj = b;
		Short shortobj = s;
		Long longobj = l;
		Integer intobj = i;
		
		
		
	}
}
