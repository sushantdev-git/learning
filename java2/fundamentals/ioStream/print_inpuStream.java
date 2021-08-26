package ioStream;
import java.io.*;
public class print_inpuStream {
	
	public static void main(String args[]) throws IOException {
		
		FileOutputStream fout = new FileOutputStream("C:\\Users\\coola\\Desktop\\Output.txt");
		
		PrintStream pout = new PrintStream(fout);
		
		pout.println(2016);
		pout.println("Sushant");
		pout.close();
		fout.close();
		System.out.println("Succes");
	}
	
}
