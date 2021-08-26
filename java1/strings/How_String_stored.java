package strings;

public class How_String_stored {
	
	/*
	 Different memory area in java
	 1>Stack memory 
	 	all functions call goes in stack and all primitive data type
	 	
	 2>heap memory
	 	array = {1,2,3,4,5};
	 	the actual array is stored in heap and reference of array is stored in
	 	stack
	 	#heap is very big than stack
	 
	 In strings 
	 	in case of string literal:
	 		str = "abc"
	 		str1 = "abc"
	 		when we create a string literal, the data of string will 
	 		be stored in string pool, and if any another string literal
	 		is created will same data, then jvm will point the new string 
	 		literal address to previous data that is available in string pool, 
	 		and both str and str1 will point to same data and will have same reference
	 		
	 		this is done by JVM for space optimization
	 	
	 	in case of string object:
	 		new string object is created, and it is created outside the 
	 		string pool, and it has own reference and space in memory
	 
	 Immutable string in java
	 	
	 	once a string is created in string it can't be changed
	 	means a char inside that string can't be replace, added or deleted
	 	
	 	str[i] = "d";//no possible
	 	
	 	if you do something like:
	 		str = "abc"
	 		str = "agcd"
	 		
	 		
	 		
	 		here you are only changing reference not changing data
	 		and the new string literal will be added to string pool
	 		
	 		str+="ac" //this is also creating a new data
	 		//and changing str reference
	 		
	 
	 */

	
	public static void main(String args[]) {
		String str = "abc";//string literal
		String str1 = "abc";
		//This type of string are stored in string pool
		//this is a special area in heap memory
		
		
		String str2 = new String("abc");//string object
		//this string will be stored in heap and str2 will be stored in stack
		
		//string immutability
		str = "abc";
		str1 = "a";
		
		str2 = str1+"bc";
		
		
		System.out.println(str == str2);//false
	}
}


