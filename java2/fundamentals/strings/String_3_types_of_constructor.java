package strings;

public class String_3_types_of_constructor {
	//#types of string constructor
 	//public String(String s)
 	//public String(StringBuffer s)
 	//public String(StringBuilder s)
 	//public String(char[] ch)
 	//public String(byte[] s)
	
	public static void main(String args[]) {
			
		String str1 = "Sushant";
		String str2 = new String("Mishra");
		
//		str2 = "hello";
		byte b[] = {98,99,100};
		
		String str3 =new String(b);//here string constructor change all byte
		//in character and concat them
		System.out.println(str3);
		
		char c[] = {'a','b','c'};
		
		String str4 = new String(c);//here it concatenated the all character of array
		System.out.println(str4);
		
		char c1[] = new char[] {'a','b','c'};//this is an example of anonymous array initialization
		/*
		  int[] fgfg(){
		  
		  		return new int[]{1,2,3}
		  	}
		 */
		String str5 = new String(c1);
		System.out.println(str5);
		
		
		StringBuffer sb = new StringBuffer("Hello");
		
		String str6 = new String(sb);
		System.out.println(str6);
		
		
		StringBuilder sB = new StringBuilder("Java");
		
		String str7 = new String(sB);
		System.out.println(str7);
		
		//if you use String class then you can't change its content
		//but if you use StringBuffer then you can change it's content
		

		
		String str = "I am going to Delhi and from there to Mumbai";
		int begin = 14;
		int end = 19;
		
		
		char aSTR[] = new char [end - begin];
		str.getChars(begin, end, aSTR, 0);
		//get chars method return a copy of a string in a char array
		//if take four arguments 
		//getChars(int srcBeginIndex, int srcEndIndex, char[] destination, int dstBeginIndex)  
		
		System.out.println(aSTR);
		
		
		
		char cc[] = new char[]{'d','o','g'};
		System.out.println(cc);
		
		//endswith , startwith method
		str1 = "Delhi";
		str2 = "Kanpur";
		str3 = new String(str1);
		str4 = "Delhi";
		
		System.out.println("str3 "+ str3);
		System.out.println("Str1 starts with Del= "+ str1.startsWith("Del"));
		System.out.println("Str1 ends with pur= "+ str1.endsWith("pur"));
		System.out.println("Str2 ends with pur= "+ str2.endsWith("pur"));
		
		
		//valueof() method
		//it is used to change any type of variable into string
		//return type this method is string
		//the data is not changed i.e 65 will be stored as "65" not A
		int a=10;
		System.out.println((String.valueOf(a)));
		
		
		//contains()
		//return true or false
		String name="hello how are you doing";
		System.out.println(name.contains("how are you"));
		
		//getBytes();
		//convert string to ascii code and return array of byte type
		byte[] b_a = name.getBytes();
		
		
		for(int i : b_a) {
			System.out.print(i+" ");
		}
		

		
		
		
	}
}
