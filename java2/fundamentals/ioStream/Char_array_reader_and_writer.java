package ioStream;
import java.io.*;
public class Char_array_reader_and_writer {
	
	
	public static void main(String args[]) throws IOException {
			
		char[] temp = {'S','u','s','h','a','n','t'};

		
		CharArrayReader ca = new CharArrayReader(temp);
		
		int c = 0;
		
		while((c = ca.read()) != -1) {
			
			System.out.println(c);
			
			System.out.println((char)c);
		}
		

		
	}
}
