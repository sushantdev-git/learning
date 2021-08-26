package abstraction_and_Interface;

public class Interface_getter {
	public static void main(String args[]) {
		
		dy y = new dy();
		y.getDisplay();
	}
}

interface dx {
	
	default void getDisplay() {
		display();
	}
	
	private void display() {
		System.out.println("Hello");
	}
	
	
}
class dy implements dx{
	
}
