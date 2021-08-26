package abstraction_and_Interface;

public class Interface_ambiguity {
	
	public static void main() {
		jj ob1 = new jj();
		ob1.print();
		AA.print();
	}
}

interface AA{
	static void print() {
		System.out.println("Hello AA");
	}
	
	void printt();
}
interface BB{
	
	default void print() {
		System.out.println("Hello BB");
	}
}

class jj implements AA,BB{
	
//	void print() {
//		System.out.println("Hello");
//	}
	//we can't override default and static method from interface
	
	
	public void printt() {
		
	}
}