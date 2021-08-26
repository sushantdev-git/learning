package oops;

public class Non_access_modifier_keyowrds {
	int i=10;
	/*
	 final keyword is used to create a final variable
	 
	 you can initialize final variables inside constructor
	 because an object calls a constructor only once
	 
	 whenever you feel a value should be fixed then use final
	 
	 final keyword should be written in all capital letter -> INT_MIN;
	 */
	
	final double x; //here x can not be change be further
	
	/*
	 static properties are those properties, that are shared with all the objects
	 and it is a property of class
	 it is not individual property of objects
	 
	 
	 if you want a property should be shared with all the objects
	 then you should make it static.
	 
	 static variable can be called without object
	 
	 static variable can be used outside of the class , so always make it private
	 
	 */
	private static int student_count;
	
	Non_access_modifier_keyowrds(){
		x = 0.5;
		student_count++;
	}
	
	
	//Static Function
	
	public static int getNumStudet() {
		//i=5; you can't access non-static variable inside static function
		//you also can't use this keyword in static function
		return student_count;//you can give read access to private variable through functions
		
	}
	
	
	//main is public static because you JRE can access main without making it's object
	
	public static void main(String args[]) {
		//x = 10;//error
//		Non_access_modifier_keyowrds n1 = new Non_access_modifier_keyowrds();
//		Non_access_modifier_keyowrds n2 = new Non_access_modifier_keyowrds();
		
//		System.out.println(n1.student_count);
//		System.out.println(n2.student_count);
		
		System.out.println(Non_access_modifier_keyowrds.student_count);//correct way of calling a static variable
	}
}
