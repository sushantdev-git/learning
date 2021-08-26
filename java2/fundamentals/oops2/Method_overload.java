package oops2;

public class Method_overload {
	
	
	public static void main(String args[]) {
		
		add_s s = new add_s();
		
		System.out.println(s.add(15.0, 13));
		System.out.println(s.add(12, 13, 14));
		System.out.println(s.add(14, 13.1));
		System.out.println(s.add(4, 5));
		
	}
}

class add_s{
	int add(int x, int y) {
		return x+y;
	}
	
	int add(int x,int y,int z) {
		return x+y+z;
	}
	
	int add(double x, int y) {
		return (int)x+y;
	}
	
	int add(int x, double y) {
		return x+(int)y;
	}
}
