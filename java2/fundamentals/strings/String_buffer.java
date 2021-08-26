package strings;

public class String_buffer {
	
	/*
	 String buffer is peer class of string
	 
	 String buffer represents growable-length and 
	 mutable character which is opposite of String class
	 
	 StringBuffer is known as mutable classes
	 
	 methods of StringBuffer are synchronized in nature
	 synchronized methods are threadSafe => means use MULTITHREADING
	 
	 MULTITHREADING means we divide code into smaller part
	 and run those code simultaneously for faster process
	 
	 
	 
	 */
	public static void main(String args[]) {
		//Assignment 
		//Similar methods of string and stringBuffer
		
		StringBuffer s = new StringBuffer("Hello java");
		
		System.out.println("Leght of string"+s.length());//return length of string
		System.out.println("Capacity of string"+s.capacity());
		//return capacity of StringBuffer object
		//by default capacity is 16
		
		//Append method
		s.append(" this is a stirng");
		s.append(1);
		//you can pass many things is append method
		System.out.println(s);
		
		//insert method
		s.insert(3, " hello ");
		char ch[] = {'F','i','n','e'};
		
		s.insert(s.length(), ch);
		System.out.println(s);
		
	}
}
