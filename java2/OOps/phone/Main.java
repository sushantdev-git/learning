package phone;

public class Main {
	
	public static void main(String args[]) {
		
		Contact c = new Contact();
		
		c.createContact("Sushant", "7973934925");
		c.printAllMno();
		
		c.addMoreMno();
//		c.deleteContact();
		
		c.createContact("Rahul", "3927598729034", "892734589702");
		c.printAllMno();
		c.getTotalMno();
		c.change_name("Aman");
	}
	
}
/*
1283749012
4892317498
1238749324
4213897409
1234093289
1234790327
4329714098
4823917021
4198237409
1974312093
*/

