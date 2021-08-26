package String_questions;

public class Rverse_letter {
	
	public static StringBuffer f(String S) {
		
		char s[] = new char[S.length()];
		
		for(int i=0; i<S.length(); i++) {
			s[i] = S.charAt(i);
		}
		
		
		
		StringBuffer ans= new StringBuffer();
		
		int i=0;
		int j=s.length-1;
		
		while(i<j) {

			if( (97<=(int)s[i] && (int)s[i]<=122) && (97<=(int)s[j] && (int)s[j]<=122)) {
				System.out.println("swap");
				char temp = s[i];
				s[i] = s[j];
				s[j] = temp;
				i++;
				j--;
			}
			else if(97>(int)s[i] || (int)s[i]>122) {
				i++;
			}
			else {
				j--;
			}

		}
		
//		for(char ele:s) {
//			System.out.print(ele);
//		}
		
		for( i=0; i<s.length; i++) {
			ans.append(s[i]);
		}
		
		
		return ans;
		
	}
	
	public static void main(String args[]) {
		
		String s = "123-abcd-z-2z4";
		System.out.println(f(s));
	}
}
