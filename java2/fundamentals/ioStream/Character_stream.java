package ioStream;
import java.io.*;

public class Character_stream {
	
	/*
	 CharacterStream have two main classes InputStreamReader and writer
	 CharacterStream is used to read char and String while ByteStream used to read byte
	 
	 	we have fileReader and FileWriter and read and write data
	 	
	 		It will throw file not found exception
	 		
	 	
	 	We use BufferedReader and BufferedWriter to read and write data to console
	 	
	 	
	 
	 */
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//here we are creating object of bufferedReader which will use object of InputStreamReader
		//which uses the System.in library which is single library to read data from console
		
		char c1 = (char)br.read();//br.read return int
		System.out.println(c1);
		
		String s1 = br.readLine();
		System.out.println(s1);
		
		
		//make a program which used both input and output stream
		
	}
	
}	
