package conditon_and_loops;

public class Scopee {
	
	public static void main(String[] args) {
		
		int i=1;
		while(i<=5) {
			int j=10;
			System.out.println(j);//every time while loop runs a new value of j is created so 
			i++;					//same value of j is printed same 
			j++;				//the new j is created evry time because after on run the environment of while 
		}						//is destroyed and new environment is created
		System.out.println(i);
		//System.out.println(j);//you cannot print j outside the scope
		
		
//		int a = 10;// scope of variable a is from line 7 till ending curly braces of block
//		// in a scope you cannot declare two variable with same name
//		//int a = 100; // this is an error  , changing type will not work
//		//you can assign different value to variable
//		a = 100;
//		
//		if(a >= 100) {
//			int b = 10;//scope of b is restricted to enclosing curly brackets
//			//int a=10; // you cannot create a inside if because it is present in global scope
//			System.out.println(b);
//		}else {
//			int c = 20;
//			int b = 30; //you can declare variable with same name in different scope
//			System.out.println(b+""+c);
//		}
//		System.out.println(b);//you cannot print b and c outside if block
//		System.out.println(c);
	}
}
