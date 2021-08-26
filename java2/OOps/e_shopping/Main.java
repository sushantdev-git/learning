package e_shopping;

public class Main {
	
	public static void main(String args[]) {
		
		Amazon employee = new Amazon();
		employee.addGoods();
		employee.addGoods();
		
		User user1 = new User();
		user1.setBalance(100000);
		
		user1.searchAmazon();
		user1.buyFromAmazon();
		
	}
}

/*
 Electronic item
 
 Phone 20000
 Wrist_Band 5000
 Laptop 50000
 Camera 30000
 Console 35000
 
 Tea 200
 Coffee 300
 Honey 400
 Pickles 300
 Noodle(famil_pack) 100
*/
