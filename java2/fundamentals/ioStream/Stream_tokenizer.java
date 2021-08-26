package ioStream;
import java.io.*;
public class Stream_tokenizer {
	
	/*
	 StringTokenizer break the string into tokens and then read it.

 	count total character in the file
 	
 	comment char method 
 	line no
 	lower case
 	ordinary character
 		one argument
 		two argument
	 */
	public static void main(String args[]) throws IOException{
		
		
//		Reader rr = new StringReader("This is my first stream tokenizer 1234");
//		StreamTokenizer tt = new StreamTokenizer(rr);
//	
//		while(tt.nextToken() != StreamTokenizer.TT_EOF) {//TT_EOF is checking end of file
//			
//			System.out.println(tt.sval);//sval print token value if token is string type
//			System.out.println(tt.nval);//nval print token value if token is number type
//		}
		

	
		int WordCount = 0;
		int numberCount =0;
		
		//This will count number of words and number into the string 
		StreamTokenizer sTokenizer = new StreamTokenizer(new FileReader("C:\\Users\\coola\\Desktop\\java io\\numbers.txt"));
		
		while(sTokenizer.nextToken() != sTokenizer.TT_EOF) {
				
			if(sTokenizer.ttype == sTokenizer.TT_WORD) {
				WordCount++;
			}
			else if(sTokenizer.ttype ==sTokenizer.TT_NUMBER){
				numberCount++;
			}
		}
		
		System.out.println(WordCount);
		System.out.println(numberCount);
		
		
		
		//adding numbers in a line till EOL is reached
		StreamTokenizer st = new StreamTokenizer(new FileReader("C:\\Users\\coola\\Desktop\\java io\\numbers.txt"));
		double sum=0;
		st.eolIsSignificant(true);//making of TT_EOL significant else it will not be read
		while(st.nextToken() != st.TT_EOF) {
				
			if(st.ttype == st.TT_WORD) {
				System.out.print(st.sval+" ");
				sum=0;
			}
			else if(st.ttype == st.TT_NUMBER) {
				
				sum+=st.nval;
				
			}
			else if(st.ttype == st.TT_EOL ) {
				System.out.println(sum);
			}
		}
		System.out.println(sum);
		
		
		
		//Counting Character in File
		StreamTokenizer ss = new StreamTokenizer(new FileReader("C:\\Users\\coola\\Desktop\\java io\\numbers.txt"));
		sum = 0;
		while(ss.nextToken() != ss.TT_EOF) {
			
			if(ss.ttype == ss.TT_WORD) {
				sum+=((ss.sval).length());
			}
		}
		System.out.println("Number of characters in File is :"+(int)sum);
		
		
		
		
		
	
}
	};
