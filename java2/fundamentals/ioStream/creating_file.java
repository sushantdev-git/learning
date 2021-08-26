package ioStream;

import java.io.*;

public class creating_file {
	
	public static void main(String args[]) throws IOException {
		
		File f = new File("C:\\Users\\coola\\Desktop\\java io\\newFile.txt");
		System.out.println(f.createNewFile());
		FileOutputStream fout = new FileOutputStream(f);
		
		String s = "New file is created";
		
		byte [] b = s.getBytes();
		fout.write(b);
		
		fout.close();
		
		System.out.println(f.exists());
		
	}
}	
