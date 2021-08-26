package ioStream;
import java.io.*;

public class File_java {
	
	/*
	 	
	 	
	 	#file class is present in java.lang package
	 		file class can be used to read and write file
	 	
	 	
	 	
	 */
	
	static void p(String s) {
		System.out.println(s);
	}
	
	public static void main(String args[]) {
		
		File f1 = new File("../a.java"); //creating new file
		
		p("File name " +f1.getName());
		
		p("Path" +f1.getPath());
		
		p("Abs Path: "+f1.getAbsolutePath());
		
		p("Parent "+f1.getParent());
		
		p(f1.exists() ? "exists" : "does not exist");
		
	}
	
}
