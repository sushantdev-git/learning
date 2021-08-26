package ioStream;
import java.io.*;

public class Read_write {
	
	public static void main(String args[]) throws IOException {
		
		//here using Buffered Input and Output Stream
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\coola\\Desktop\\java io\\output.txt"));
		
		bw.write("Hello how are you??\nAre you doing good");
		bw.close();
		
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\coola\\Desktop\\java io\\output.txt"));
		
		String s;
		while((s = br.readLine()) != null) {
			System.out.println(s);
		}
		br.close();
		
	}
}
