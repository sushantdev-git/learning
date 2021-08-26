package operator_and_for_loop;

public class Increment_decrement_operator {
	
	public static void main(String x[]) {
		
		
		int a=60;
		
		a++;//post increment : first a value will be used and then a value will be incremented
		++a;//pre increment	: first value of a is incremented and then a is used;
		
		a--;//post decrement : same as post increment
		--a;//pre decrement : same as pre increment
		
		a=60;
		
		System.out.println(a+=1);//in this case it is pre increment
		
		int b=80;
		a=60;
		
		if(++a >60 || b++ >80) {
			System.out.println("Inside if ");
		}
		else {
			System.out.println("Inside else");
		}
		System.out.println("a "+a+" b "+b);//here value of a will be 61 but
		//value of b will be 80 because of concept of short circuiting
		
		//in a if statement if there is two condition and the conditions are joined
		//with a OR operator then if first condition is correct then second condition 
		//will not be executed and this concept is known as short circuiting
		
		
		
		int z=10,y=20;
	    System.out.println(z+++--y);//line 1
	    //System.out.println(z--+++y);//line 2
	    System.out.println(z++-++y);//line 3
	    //System.out.println(z+++++y);//line 4
	    //line 2 and line 4 will give error
	}
}
