package ioStream;
import java.io.*;

public class Input_stream {
	
	/*
	 Method of input Stream
	 void mark() - it uses to mark the String to which we want to read, 
	 void reset() - it resets from where we want to read the file
	 				like we read 5 lines, and we call reset function then it will reset
	 				pointer to starting and file will read from starting
	 				
	 				if we used reset with mark, then it can't go previous to mark
	 				
	 boolean markSupport() -  check if mark and reset is supported
	 
	 */
		
	public static void main(String args[]) throws IOException {
			
		String st="Reader and writer class";
		
		Reader re = new StringReader(st);
		
		int c;
		
		for(int i=0; i<10; i++) {
			c=re.read();
			System.out.print((char)c);
		}
		
		System.out.println();
		
		re.mark(0);
		re.reset();
		
		for(int i=0; i<10; i++) {
			c=re.read();
			System.out.print((char)c);
		}
		
		System.out.println();
		
		System.out.println(re.markSupported());
		
		
		
		
	}

}
