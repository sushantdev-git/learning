package fundamentals;

public class how_data_is_stored {
	
	public static void main(String[] args) {
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		System.out.println(min+" "+max);
		
		
		
		//char ch = 'a';
		System.out.println('a'+3); //100 because ascii value of a = 97 and +3 is 100
	}
	/*
	 How Integer is Stored
	 -----------------------
	  the no is store in system is in from of binary
	  
	  when binary no is stored the LSB(Left significant bit is known as sign bit)
	  
	  a sign bit is that bit which represent wheather a no is +ve or -ve
	  
	  if signed bit is 0 then no is +ve else if 1 then no is -ve
	  
	  When a negative no is stored, it is stored in form of 
	  it 2's complement
	  
	  means (converting to 1's complement and adding 1 to it)
	  
	  ex:   if no is -2 in 4 bit
	  		then it will be written as:
	  			
	  			 1 1 1 0 (simply written no -2)
	  			 		 (how we know its -2 , because it LSB is 1)
	  			 		 
	  			 0 0 0 1 (1's complement)
	  			 	 + 1    # 1+1 = 2 which is 10 in binary so 0 down and 1 carry
	  			---------
	  			 0 0 1 0 (2's complement)  which implies 0010 is 2 in binary
	  			 							so with 1 as LSB it will be -2 
	  			 
	  			 if -2 is written as 1110 in binary
	  			 
	  			 
	 so the range of no if we have 4 bit
	 		-8 to +7
	 		
	 		for maximum in positive all bit 'ON' it mean 0 1 1 1 = which is +7
	 		
	 		#imp(if you have n bit so there is only n-1 bit to store data and LSB is to store sign(-ve or +ve)
	 		
	 		for minimum in negative all bit 'OFF' it mean 1 0 0 0 = which is -8 (by 2's complement)
	 		
	so if you have N bit:
		then range of number you can store is
			-2**(N-1) to (2**(N-1))-1 
			
			for int its 4 byte = 32 bit
			
			this means
			
			-2**31 to 2**31-1
	---------------------------------------------------------
	
	How char is Stored
	---------------
	
	char is stored is in from of ASCII value
	
	if you want to store 'a' then it ASCII value will be sotred
	
	which is 97 for 'a'
	
	and Zero(0) can also be stored in from of char
	
	and it ASCII value is 48
	
	
	 */
}
