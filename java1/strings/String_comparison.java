package strings;

public class String_comparison {

		public static void main(String args[]) {
			
			String str1 = "abc";
			String str2 = "abc";
			//here both str1 and str2 are referring to same 
			//memory address
			if(str1 == str2) {
				System.out.println("Both are equal");
			}
			else {
				System.out.println("Both are not equal");
			}
			
			String str3 = new String("abc");
			//here str3 is stored in different memory address outside
			//string pool
			if(str1 == str3) {
				System.out.println("Both are equal");
			}
			else {
				System.out.println("Both are not equal");
			}
			
			if(str1.equals(str3)) {
				System.out.println("Both are equal");
			}
			else {
				System.out.println("Both are not equal");
			}
			
			
			//here we were comparing address
//			int arr1[] = {1,2};
//			int arr2[] = {1,2};
//			if(arr1 == arr2) {
//				System.out.println("Both are equal");
//			}
//			else {
//				System.out.println("Both are not equal");
//			}
//			
//			System.out.println(arr1+" "+arr2);
		}
}	
