package e_shopping;

class User extends Bank_account{
	//this is user class that uses
	//amazon_interface to buy and see products
	
	private Amazon_interface aa = new Amazon();
	
	//this is user_otp that user have to enter at time of payment
	//to make payment
	//and this is given by bank
	
	private int user_otp = 7381;
	
	void searchAmazon() {
		aa.showGoods();
	}
	
	void buyFromAmazon() {
		System.out.println("Buy function");
		aa.BuyGoods();
	}
	
	int get_otp() {
		//this will be request by bank to user
		//to give otp he got
		return user_otp;
	}
}
