package operator_and_for_loop;

public class Bitwise_operator {
	
	public static void main(String args[]) {
		int a=10,b=2;
		
		int c = a&b; // single (&) is an bitwise and operator
		/*
		 a=10 so in binary it will be 1010
		 b=2 so in binary it will be 0010
		 
		 so anding a and mean
		 
		 	1 0 1 0 //here int is of 4 byte means 32 bit so 4 bit is shown here and rest all bits will be zero
		 	0 0 1 0
		 -----------
		 	0 0	1 0 
		 
		 so anding a and b will give 2
		 */
		System.out.println(c);
		
		c = a | b;//this is bitwise OR operator
		System.out.println(c);
		
		//bitwise exor operator(^)
		//1^0 = 1
		//1^1 = 0
		//0^0 = 0
		//0^1 = 1
		
		System.out.println(a^b);
		
		System.out.println(~a);//not operator all the bits are toggled);
		//if you want to find what will be value of a after bitwise negation
		//toggle all bit
		//get it's 2's complement and check the value
	}

}
