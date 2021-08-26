package oops;

public class Runner {
	
	public static void main(String args[]) {
		
		This_keyword Sushant = new This_keyword();
		Sushant.set_mood("happy");
		
		
		This_keyword Raj = new This_keyword();
		Raj.set_mood("Angry");
		
		
		System.out.println(Raj);
		System.out.println(Raj.get_mood());
		System.out.println(Sushant);
		System.out.println(Sushant.get_mood());
	}
}
