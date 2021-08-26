package e_shopping;
import java.util.Scanner;

public class Amazon implements Amazon_interface{
	Scanner sc = new Scanner(System.in);
	
	static String Electronics[] =  new String[5];
	static String Grocery[] = new String[5];
	static int e_price[] = new int[5];
	static int g_price[] = new int[5];
	static int e=0,g=0;
	//all these has to be static so that user can see these values
	//and don't have to ask employee to give values
	
	public void showGoods() {
		//this function is to show present goods
		//first it take a input on basis of that it shows 
		//result
		System.out.println("\nEnter type of goods you want to see :");
		System.out.print("Electronics : e \nGrocery : g ");
		char type = sc.next().charAt(0);
		
		if(type == 'e' || type =='E') {
			//if user enter e then show electronic products
			printGoods(Electronics, e_price,e,'E');
		}
		else if(type == 'g' || type =='G') {
			//if user enter g show grocery products
			printGoods(Grocery, g_price,g,'G');
		}
		else {
			//else invalid
			System.out.println("Invlaid input :-(");
		}
	}
	
	private void printGoods(String goods[],int price[], int n,char type) {
		//this function will print the type of good that user has selected
		if(type == 'E') {
			System.out.println("\nElectronics items are: ");
		}
		else if(type == 'G') {
			System.out.println("\nGrocery items are: ");
		}
		
		//for loop to print all goods and it's prices
		for(int i=0; i<n; i++) {
			System.out.println((i+1)+". "+goods[i]+" -> "+price[i]);
		}
	}
	
	void addGoods() {
		//with this function we can add products in amazon data base(array)
		System.out.println("\nEnter type of goods you want to add :");
		
		//first ask employee which type of product he want to add
		System.out.print("Electronics : e \nGrocery : g ");
		char type = sc.next().charAt(0);
		
		if(type == 'e' || type =='E') {
			//if employee enter e then add electronic product
			System.out.println("\nYou can add only "+(5 - e)+" more item");
			System.out.print("Enter how many Electronic items you want to add : ");
			int n = sc.nextInt();
			if(n>5) {
				System.out.println("Invaid input");
			}
			else {
				//add item will be called to add item in DB
				e = addItems(Electronics,e_price,n,e );
				//after adding the item we will update the count to items
			}
		}
		else if(type == 'g' || type =='G') {
			//if employee enter g then add grocery product
			System.out.println("\nYou can add only "+(5 - g)+" more item");
			System.out.print("Enter how many Grocery items you want to add : ");
			int n = sc.nextInt();
			if(n>5) {
				System.out.println("Invaid input");
			}
			else {
				//add item will be called to add item in DB
				g = addItems(Grocery,g_price,n,g);
				//after adding grocery updating grocery count
			}
		}
		else {
			System.out.println("Invlaid input :-(");
		}
	}
	
	private int addItems(String goods[],int price[],int n,int c) {
		//this function will add item in that category of good that has been
		//selected by employee
		System.out.println("Enter "+n+" items and its price :");

		for(int i=0; i<n ; i++) {
			goods[c] = sc.next();
			price[c++] = sc.nextInt();
			//after adding item updating count
		}
		
		return c;//returning count so global value will also be updated
	}
	
	public void BuyGoods() {
		//this function will be used to buy goods
		System.out.println("\nEnter type of goods you want to Buy :");
		System.out.print("Electronics : e \nGrocery : g ");
		//first ask user which type of good he want to buy
		char type = sc.next().charAt(0);
		if(type == 'e' || type =='E') {
			//if user enter e then first print all electronic items
			//and then call buy item function
			printGoods(Electronics, e_price,e,'E');
			BuyItems(Electronics, e_price, e);
			
		}
		else if(type == 'g' || type =='G') {
			//if user enter g then first print all grocery items
			//and then call buy item function
			printGoods(Grocery, g_price,g,'G');
			BuyItems(Grocery, g_price, e);
		}
		else {
			System.out.println("Invlaid input :-(");
		}
	}
	
	private void BuyItems(String goods[], int price[], int t_item) {
		//this is main function that will be use to buy product from amazon
		int total_price=0;
		System.out.print("\nEnter no of items you want to buy ");
		int n = sc.nextInt();
		//first ask user how many items he want to buy
		
		String temp="";//a temp string to collect all items entered by user
		
		int j;//j to store index of item
		
		for(int i=0; i<n; i++) {
			System.out.print("Enter index of your "+(i+1)+" item : ");
			j = sc.nextInt();//ask user to enter nth item and store it in j
			
			if(j > t_item || j <= 0) {
				System.out.println("Item not present :-(");
				//if j in invalid print this
			}
			else {
				//else add j in temp string
				temp+=(j-1)+" ";
				total_price+=price[j-1];
				//and also update total price
			}
		}
		
		String arr[] = temp.split(" ");//now split the temp string on basis of space
		System.out.println("\nItems selected : ");
		
		//and print all the items selected by user
		for(int i=0; i<arr.length; i++) {
			System.out.println((i+1)+". "+goods[Integer.parseInt(arr[i])]);//here user integer parseInt function to
			//convert string to integer
		}
		
		System.out.println("Total amount to pay: "+total_price);//print total price
		
		System.out.print("\nDo you want proceed to payment y/n : ");
		//ask user he want to proceed for payment
		char c = sc.next().charAt(0);
		
		if(c == 'y' || c == 'Y') {
			//if user enter yes then,
			//make object of Bank_interface
			//that will be used by amazon to make payment
			
			Bank_interface b = new Bank();
			
			//here a boolean withdraw function present on bank_interface that
			//will return whether payment was successful or not
			
			if(b.Withdraw(total_price) == true) {
				//if payment is successful then print this msg
				System.out.println("\nThank you for shopping :-)");
				System.out.println("Your item will be delivered soon !!");
			}
			else {
				System.out.println("\nPlease try again :-(");
			}
		}
		else {
			System.out.println("\nOk buy next time :-)");
		}
		
		
	}
}
