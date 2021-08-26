package strings;

class s{
	int rno;
	String name;
	
	s(int rno, String name){
		this.rno = rno;
		this.name=name;
	}
	
	public String toString() {
		return rno+" "+name;
	}
}
public class String_2 {
	
	public static void main(String args[]) {
		s s1 = new s(10,"Ram");
		System.out.println(s1.toString());
		//by default toStirng return the address of string
		//we can override this method and can be used to return the value of object
		
		System.out.println(s1.rno);
		System.out.println(s1.name);
	}
}
