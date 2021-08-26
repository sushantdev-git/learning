package phone;

import java.util.Scanner;

public class Contact {
	
	Scanner sc = new Scanner(System.in);
	
	private int T_Mno = 0;
	
	private String name="";
	
	private String arr[] = new String[10];
	//if you want to store any no of contact you can use
	//Dynamic array
	
	
	Contact() {
		//constructor of contact
		System.out.println("You can save maximun 10 Mobile no for this contact :-) ");
	}
	
	
	
	void createContact(String name, String number1) {
		
		if(this.name.length() > 0) {
			//if there is some name assigned 
			//ask if user want to change name
			change_name(name);
		}
		else {
			this.name = name;
		}
		
		if(T_Mno >= 10) {
			//if Mno list is full
			//check is user want to delete and add Mno
			System.out.println("Maximum no of Mobile no saved of "+this.name);
			System.out.println("Do you want to delete a Mobile no "+this.name+" y/n");
			char c = sc.next().charAt(0);
			
			if(c == 'y' || c == 'Y') {
				//if user want to delete Mno then, call these functions
				printAllMno();
				deleteMno();
				
				arr[T_Mno++] = number1;
				//every time after adding more mobile no arr,
				//increment no of mobile no added
			}
			
		}
		else {
			//if list is not full then add Mno
			arr[T_Mno++] = number1;
			
		}
		
		
	}
	
	void createContact(String name, String number1, String number2) {
		//if use want to add two mobile no to at once,
		//then this function will be called
		
		if(this.name.length() > 0) {
			change_name(name);
			//if there is some name assigned 
			//ask if user want to change name
		}
		else {
			
			this.name = name;
		}
		
		if(T_Mno >= 9) {
			//if n=9 means we can add 1 more mobile no
			if(T_Mno >= 10) {
				//if n=10 means we can't add any mobile no
				System.out.println("You have to delete 2 Mobile no to save more mobile no to "+this.name+" list");
			}
			else {
				System.out.println("You have to delete 1 Mobile no to save more mobile no to "+this.name+" list");
			}
			
			//to add more mobile no ask user if he want to delete some previous Mno
			System.out.println("Do you want to delete some Mobile no "+this.name+" y/n");
			char c = sc.next().charAt(0);
			
			if(c == 'y' || c == 'Y') {
				//if use enter yes then, call these functions
				printAllMno();
				deleteMno();
				
				if(T_Mno <= 8) {
					//if total Mno is <= 8 means user deleted more than 2 number 
					//so we can add 2 number
					arr[T_Mno++] = number1;
					arr[T_Mno++] = number2;
				}
				else if(T_Mno <= 9) {
					//if total Mno is <= 9 means user deleted more than 1 number
					//here we can only add one mobile as user can have deleted only
					//one mobile number
					arr[T_Mno++] = number1;
				}
				
			}
			
			
		}
		else {
			//if arr is no full then add these mobile number
			arr[T_Mno++] = number1;
			arr[T_Mno++] = number2;
		}
		
	}
	
	void change_name(String name) {

		//if there is previously name store in name variable
		//ask if user want to change name
		System.out.println("\nOops.. This contact is already saved with a name = "+this.name);
		System.out.println("Do you want to change name of contact - y/n");
		char c = sc.next().charAt(0);
		
		if(c == 'y' || c == 'Y') {
			this.name = name;
			System.out.println("Name change as "+this.name+"\n");
		}
	}
	
	void getTotalMno() {
		//this function will print total mobile no present in contact list
		System.out.println("Total no of Mobile no saved for "+this.name+" = "+this.T_Mno);
	}
	
	void deleteMno() {
		
		//this function is to delete Mobile no
		
		System.out.println("\nEnter no of Mobile no you want to delete : ");
		
		int no = sc.nextInt();
		//taking no input
		
		if(no > T_Mno) {
			//if no > total Mno means 
			//delete more mobile than present in list
			//so that in not possible
			System.out.println("Invalid Entry");
			return;
		}
		
		if(no == T_Mno) {
			//if no == total Mno, means
			//user want to delete all number
			//so, make a new array and change reference
			
			arr = new String[10];
			T_Mno=0;
			//setting total Mno to zero
			return;
			
		}
		
		int temp;//temp var to take input
		int c=0;//c to count if there is any invalid entry
		
		System.out.println("Enter "+no+" indexes you want to delete :");
		for(int i=0; i<no; i++) {
			
			temp = sc.nextInt();
			
			if(temp > T_Mno || temp <= 0) {
				//if temp > total Mno or <= 0
				//means that index can be accessed so invalid entry
				System.out.println("invalid input");
				c++;
			}
			
			else {
				
				//accessing one temp-1 as array start from 0
				//those indexes which we have to delete setting as
				//empty
				arr[temp-1] = "";
			}
			
		}
		
		int j=0;
		for(int i=0; i<T_Mno; i++) {
			//this loop is used to shift all 
			//no to mobile no to left
			//if there any gap more it to right
			
			arr[j] = arr[i];
			if(arr[i] == "") {
				j--;
			}
			
			j++;
		}
		
		while(j < T_Mno) {
			
			//this is not mandatory
			//this is used to set all no after j index as empty
			//as we moved all mobile no of left till j
			//so after j all index should be empty
			arr[j] = "";
			j++;
		}
		
		
		System.out.println((no - c)+" Mobile no deleted of "+this.name);
		
		T_Mno-=(no - c);//decrementing total m_no to 
		//total mobile minus no of element deleted
		
		printAllMno();
		
		
		
	}
	
	void addMoreMno() {
		//this function is to add more mobile no to contact list
		
		//printing no of more mobile no that can be added
		System.out.println("\nYou can only add "+(10 - T_Mno)+" more Mobile no to "+this.name+" list");
		
		System.out.println("Enter no of Mobile no you want to add of "+this.name+" list : ");
		
		int no = sc.nextInt();
		
		if(no+T_Mno > 10) {
			//if user entered a no that is > 10 - T_Mno
			//if this is invalid
			//as we can't add more mobile no out of empty spaces
			
			System.out.println("Invalid input");
			return;
		}
		
		System.out.println("Enter "+no+" Mobile no");
		//here user will enter no mobile no and
		//we add it to contact list
		
		for(int i=0; i<no ; i++) {
			
			arr[T_Mno++] = sc.next();
			//here adding mobile no at index of total_mobile no
		}
		
		//then printing all mobile no
		printAllMno();
	}
	
	void printAllMno() {
		
		//this function is to print all mobile no of that contact......
		System.out.println("\nContacts of "+this.name+" are: ");
		for(int i=0 ; i<T_Mno; i++) {
			System.out.println(i+1+". "+arr[i]);
		}
	}
	
	
}
