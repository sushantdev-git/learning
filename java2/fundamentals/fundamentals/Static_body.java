package fundamentals;

public class Static_body {
	static
  {
  System.out.print(1);
  }
  static
  {
  System.out.print(2);
  }
  static
  {
  System.out.print(3);
  }
  public static void main(String[]args)
  {
	  Static_body a;
	  //here all static block will be executed when a an object is declared of that class
  }
}
