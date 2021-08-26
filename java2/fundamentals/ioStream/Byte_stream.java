package ioStream;
import java.io.*;

public class Byte_stream {
	
	/*
	 A stream can be defined as sequence of data
	 	The java.io package contains nearly every class you might ever need to perform
	 	input and output in java
	 	
	 	By using stream make the process faster 
	 	
	 	Input Stream - Taking data from Source
	 	Output Stream - Output data
	 	
	 	InputStream can be used to input data from file(can be any type of file txt, batch), Console, Socket
	 	
	 	Socket is used to transfer data in networking
	 	
	 	OutPutStream is used to output data to file, Console Socket
	 	
	 	
	 	Types of Stream
	 		Byte Stream:
	 			It is used when we perform input and output with 8-bit type of data
	 			
	 			It provides two classes
	 				FileInputStream
	 				
	 				FileOutputStream
	 				
	 			ByteArrayInputStream
	 			BufferInputStream
	 			DataInputStream
	 			PrintStream
	 				
	 
	 	Differences between ByteStream and CharacterStream
	 		In ByteStream we have BaseClass as Input and output
	 		In CharacterStream we have Base Class Reader and writer
	 		
	 	In ByteStream for every output stream we have an input Stream but reverse is not true
	 	
	 	#These all classes comes under java.io package
	 	
	 	
	 	#All io Stream gives io exception
	 	
	 	#ByteArrayOutputStream
	 		This class is present in Outputstream
	 		
	 	
	 	
	 */
	public static void main(String args[]) throws IOException{
				
		byte[] buf = {35,36,37,38}; //This is a byte Array
		
		ByteArrayInputStream byt = new ByteArrayInputStream(buf);//Putting The byte Array in The ByteInputStream
		//now the byt object can be used to read data from byte array
		int k=0;
		
		while((k = byt.read()) != -1) {
				
			char ch = (char)k;
			
			System.out.println("Acii Value of Character is : "+k+"; Special character is :"+ch);
		}
		
	}
	
}
