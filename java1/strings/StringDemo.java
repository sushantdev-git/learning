package strings;


class StringDemo {
	/*
	 To store character we use char data type
	 but if you want to store collections of character you can use String data type
	 
	 String is not a primitive data type
	 */
	public static void main(String[] args) {
		//char arr[] = {'C','o','d','i','n','g'};
		String str = "Coding";
		
		System.out.println(str.length());//this is how you can fetch the length of string
		
		//inside string - the data is stored in character array
		
		System.out.println(str.charAt(2));//if you want to fetch some index char in string
		
		//empty string is "" no space in between, if there is a space in between " " 
		//this will be considered as one character, length of string will be 1
		
		String str2 = "is fun";
		
		str+=str2;
		
		System.out.println(str);
		
		str = str.concat(str2);
		
		System.out.println(str);
		
		//some useful functions of string
		
		str2 = str;
		System.out.println(str.equals(str2));
		
		str="Coding";
		str2 = "Codingg";
		
		System.out.println(str.compareTo(str2));
		//compare to function returns the non-zero difference in ASCII values 
		//starting from 0th index to (n-1)st index and if all the indices of string are same, it returns 0.
		//if all character of match till length of first string then it will return difference length of string
		
		
		str2="ing";
		
		System.out.println(str.contains(str2));
		
		System.out.println(str.substring(3));//return a string after the passed index(inclusive)
		
		System.out.println(str.substring(1,5));//5 is exclusive
		//in substring you can pass number only till string length
		
		
	}
}
