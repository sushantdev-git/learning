package oops;

public class Getter_setter {
	
		public static void main(String args[]) {
			
			get_set rec1 = new get_set();
			
			rec1.setLength(10);
			rec1.setBreadth(20);
			System.out.println(rec1.getArea());
		}
}
class get_set{
	
	private int length;
	private int breadth;
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	public int getArea() {
		return this.length*this.breadth;
	}
}
