package operator_and_for_loop;

public class Bitwise_left_right_shift {
	
	public static void main(String args[]) {
		//left shift
		int  a=120;
		System.out.println(a<<1);
		//in left shift every bit is shifted by position you have specified
		//sign bit also change of last bit is changed
		//in bitwise one left shift the Number provided is doubled or multiplied by 2
		//or a*(2**(no of left shift))
		
		
		//right shift
		a=60;
		System.out.println(a>>1);
		//in right shift sign bit is filled with previous sign bit
		//a*(2**(-1((no of right shift)+1)))
		//of halving the value by 2**((no of right shift) + 1)
	}
}
