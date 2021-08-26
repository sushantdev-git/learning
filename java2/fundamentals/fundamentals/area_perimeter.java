package fundamentals;

import java.util.Scanner;

public class area_perimeter
{
    public static void main(final String[] args) {
        final Scanner s = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        final double radius = s.nextDouble();
        final double perimeter = 6.283185307179586 * radius;
        final double area = 3.141592653589793 * Math.pow(radius, 2.0);
        System.out.println("Perimeter is : " + perimeter);
        System.out.println("Area is :" + area);
        s.close();
    }
}