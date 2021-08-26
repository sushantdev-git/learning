package strings;

public class String_vs_String_buffer {
	
	/*
	 with string buffer you can mutate string
	 String buffer don't do memory optimization
	 
	 while string provide memory optimization
	 
	 */
	
	public static void main(String args[]) {
		StringBuffer str = new StringBuffer("abc");
		
		str.setCharAt(0, 'd');
		str.append("def");
		
		String s="d";
		for(int i=0; i<5; i++) {
			s+='z';//every time a new string will be created
			str.append('z');//character will be added to previous string
		}
		
		System.out.println(s+""+str);
		
		StringBuffer str1=new StringBuffer("");
		for(int i=0;i<5;i++)
		{
		    str1.append((char)('a'+i)); //here when you add char in int 
		    //then result will be int 
		    //and ascii value of char and int will be added
		}
		System.out.println(str1);
		
		System.out.println('a'+5);
	}
}
