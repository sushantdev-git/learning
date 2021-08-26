package ioStream;
import java.io.*;

public class BufferedInput_Stream {
	
	public static void main(String args[]) {
		
	
		 try{    
			    FileInputStream fin=new FileInputStream("C:\\Users\\coola\\Desktop\\java io\\output.txt");    
			    BufferedInputStream bin=new BufferedInputStream(fin);  
			    
			    int i;    
			    
			    while((i=bin.read())!=-1){    
			     System.out.print((char)i);    
			    }    
			    bin.close();    
			    fin.close();    
		    
		  }
		 catch(Exception e)
		 {
			  	System.out.println(e);
		 } 
		
		}
	}
	
