package conditon_and_loops;

public class Relational_logical_operators {
	
	public static void main(String[] args) {
		int a=10, b=10;
		
		// Relation operator
		System.out.println("Relational Operator");
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		
		
		
		//Logical operator
		//-------------------- (AND(&&), OR(||), NOT(!))
		/*
		 In And both condition should be true to result to be true
		 In OR any one condition should be true to result to be true
		 	#in 'OR' if condition is satisfied then second condition is not checked
		 In NOT it is negation of condition (true become false and false become true)
		 */
		System.out.println("Logical Operator");
		System.out.println(true && false);
		//System.out.println(true || false);
		System.out.println(!true);
	}
}
