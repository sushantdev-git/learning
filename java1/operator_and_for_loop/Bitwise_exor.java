package operator_and_for_loop;

public class Bitwise_exor {
	
	public static void main(String x[]) {
		/*
		 eXclusive OR (^) 
		 A^B = (~A)&(B) | (~B)&(A)
		 in bitwise eXor if and only if one of two value is high then output is high else low
		 */
		int c;
		
		int a= 10, b= -20;
		System.out.println(a^b);
		c =(~a)&(b) | (~b)&(a);
		System.out.println(c);
	}
}
