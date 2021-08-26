package strings;
import java.util.regex.Pattern;
public class Strings_info {
	
	/*
	 String is a class in java not data type
	 String represent array of character terminated with a null
	 character
	 
	 In java there are three class that can create strings
	 class String
	 class StringBuffer
	 class StringBuilder
	 
	 All three classes are part of java.lang.package
	 
	 if you declare string as constant then, that string is define in string pool
	 
	 String are immutable in nature
	 String can't be changed once created (like from uppercase to lower case)
	 
	 Difference between different class string
	 	All the classes in java in extending from object
	 
	 	String class is always public and final
	 	//so you can't extend string class
	 		
	 			String class extends object
	 			and String class implements
	 			implements serializable, comparable<String>, charSequence
	 			
	 			serializable - marker interface,
	 			in serializable there is no data member and not any method
	 			
	 			Comparable - it is also an interface, used for ordering classes
	 			-it provide one method compareTo
	 			
	 			charSequence - all three string classes are present in charSequence
	 			java.lang.String, java.lang.StringBuilder, java.lang.StringBuffer;
	 			
	 	#types of string constructor
	 	//public String(String s)
	 	//public String(StringBuffer s)
	 	//public String(StringBuilder s)
	 	//public String(char[] ch)
	 	//public String(byte[] s)
	 
	 */
	public static void main(String args[]) {
		String strx = "abcd";//declaring as a constant
		String stry = "abcd";//these are known as string literals
		String strz = new String("abcd");//creating string using new keyword
		String str1 = new String("Abcd");
		//when we create string using new keyword everytime a string is created with new
		//space in memory
		String s2 = new String();
		String s1 = "";
		
		System.out.println(strx+" "+stry);
		System.out.println("Are refrences of strx  and stry same?"+(strx == stry));
		System.out.println("Are refrences of strx and strz are same?"+(strx == strz));
		System.out.println("Are refrences of str1 and strz are same?"+(str1 == strz));
		System.out.println("Are refrences of s1 and s2 are same?"+(s1 == s2));
		
		//functions over strings
		System.out.println("The value of stirng strz and str1 are :"+strz.equals(str1));
		//when we use == means we are comparing refrence and when we use equals means we are comparing data
		System.out.println("The value of stirng strz and str1 are :"+strz.equalsIgnoreCase(str1));
		//equal function return boolean value
		System.out.println("Length of string "+(strz.length()));//length function return int value
		
		//toUpperCase() and toLowerCase()
		
		System.out.println(strz.toUpperCase().toLowerCase());//converting to uppercase and then lowercase
		
		System.out.println(strz.charAt(1));
		
		//isEmpty() and trim()
		
		//isEmpty method return if string in empty else false
		//trim() method remove the spaces from beginning and ending of string
		
		System.out.println(str1.isEmpty());
		
		String s ="  sushant mishra  ";
		System.out.println(s.trim());
		
		//compareTo()  and compareToIgnoreCase()
		
		//compareTo method is used to for comparing two string lexicographically, 
		//and each character of string is converted into unicode
		//it will return the value in unicode
		/*
		 if s1 == s2 then 
		 compare to return 0
		 
		 if s1> s2 then
		 compare to return +ve
		 
		 if s1 < s2 then
		 compare to return -ve
		 
		 */
		
		s1 = "abcdg";
		s2 = "abcdg";
		
		/*
		 here it goes character by character and calculate their ascii value difference,
		 and any time if value is not 0 then it return the difference
		 of ascii value of character of first string minus character of second string
		 
		 if two string matches completely till a point but after that the length of two string 
		 is different then compareTo method return difference of their length
		 */
		
		System.out.println(s1.compareTo(s2));
		
		s1="aaB";
		s2="AABadfa";
		
		System.out.println(s1.compareToIgnoreCase(s2));
		
		//concatenation
		s1="Sushant ";
		s2="Mishra";
		System.out.println(s1+s2);//simple method
		System.out.println(s1.concat(s2));
		System.out.println(s1);
		System.out.println(1+2+3+s1);
		//you can't use - operator with string
		
		
		//substring method 
		//substring(int a, int b); a = initial value(inclusive) to start substring, destination value (exclusive)
		
		System.out.println(s1.substring(0));
		System.out.println(s1.substring(1,5));
		
		//replace, replaceFirst, replaceAll
		s1 ="hello how how are you ??";
		System.out.println(s1.replace("h", "k"));
		System.out.println(s1.replaceAll("how", "cool"));
		System.out.println(s1.replaceAll("\\sh.*w\\s", " cool "));
		System.out.println(s1.replaceAll("\\bh.*w\\b", " cool"));
		System.out.println(s1.replaceFirst("how", "good"));
		
		String a = "meow";
		String ab = a+"deal";
		String abc = "meowdeal";
		System.out.println(ab+abc);
		System.out.println(ab == abc);
		
		
	}
	
}


