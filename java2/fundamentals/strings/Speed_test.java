package strings;

public class Speed_test {
	
	public static void StringTest(String s) {
		
		for ( int i=0; i<10000; i++) {
			s = s+"test";
			//here every time we add "test" in s 
			//it create a new object in string pool
			//and changing its reference
		}
	}
	
	public static void StringBufferTest(StringBuffer s) {
		
		for ( int i=0; i<10000; i++) {
			s = s.append("test");
			//String Buffer method don't create new object 
			//it append data in same object
			//and it is synchronized means thread safe
			//means no two thread can use methods of StringBuffer at same time
			
		}
		
	}
	
	public static void StringBuilderTest(StringBuilder s) {
		for ( int i=0; i<10000; i++) {
			s = s.append("test");
			//It is same as String Buffer
			//But it is not synchronized so it is faster than that
		}
	}
	
	public static void main(String args[]) {
			
		String s1 = new String("test");
		
		StringBuffer s2 = new StringBuffer("test");
		
		StringBuilder s3 = new StringBuilder("test");
		
		
		long startTime = System.currentTimeMillis();
		StringTest(s1);
		System.out.println("Time taken by string class "+(System.currentTimeMillis() - startTime)+"ms");
		
		startTime = System.currentTimeMillis();
		StringBufferTest(s2);
		System.out.println("Time taken by string class "+(System.currentTimeMillis() - startTime)+"ms");
		
		startTime = System.currentTimeMillis();
		StringBuilderTest(s3);
		System.out.println("Time taken by string class "+(System.currentTimeMillis() - startTime)+"ms");
	}
}
