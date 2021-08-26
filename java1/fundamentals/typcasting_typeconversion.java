package fundamentals;

public class typcasting_typeconversion {
	public static void main(String[] args) {
		char ch ='a';
		int i = ch;
		System.out.println(i);//97 because i is storing ASCII value of a
		
		//ch = i; // this will not work because int is of 4byte but char can only store 2 byte
		//this is implicit type conversion
		
		ch = (char)i;//this is a explicit type conversion and it done forcefully 
		System.out.println(ch);
		
		//ch = ch + 1 will not work because 1 is int
		
		ch = (char)(ch+1);
		
		System.out.println(ch);
		
		i= 100;
		short a;
		//a = i; will not work
		
		a = (short)i;
		
		System.out.println(a);
		
		
		float f = 1.7f;
		//1.7 is store in temproary memory and type of memory is double
		//float is 4byte long space
		//so this is an error
		//so we use f at end to convert it to a float;
		// or you can do f = (float)1.5;
		//all decimal no by default is of type double
		System.out.println(f);
		
		System.out.println(4+1.5);// so answer will be 5.5 because 1.5 is type of double
		//#imp#  when arithmetic operation is performed on two data type then answer 
		//will be in from of bigger data type
		
		System.out.println(2/5); //0 when two int is used ans is type of int
		System.out.println((double)2/5);//0.4
		System.out.println(2.0/5);//0.4
		//in below two cases 2 is type of double 
		
		int z='c';
		System.out.println(z);
		
	}
}
