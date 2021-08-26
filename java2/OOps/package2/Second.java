package package2;
import package1.*;

public class Second extends First implements I2{
	
	public static void main(String args[]) {
		
		First f1 = new First();
		f1.add();
		f1.mul();
		f1.sub();
		f1.div();
		
		I1.display();
	}
	
	public void show() {
		System.out.println("Hello");
	}
}
