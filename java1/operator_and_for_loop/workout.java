package operator_and_for_loop;

class X
{
  protected int i = 1221;

  void methodOfX()
  {
    System.out.println(i);
  }
}

public class workout
{
   public static void main(String[] args)
   {
      X x = new X();

      System.out.println(x.i);

      x.methodOfX();
   }
}

