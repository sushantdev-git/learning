package fundamentals;

import java.util.Scanner;

public class taking_distace_printing_speed
{
    public static void main(final String[] args) {
        final Scanner s = new Scanner(System.in);
        System.out.print("Enter Distance covered in meter: ");
        final double distance = s.nextDouble();
        System.out.print("Input hour");
        final double hour = s.nextDouble();
        System.out.print("Input minutes");
        final double min = s.nextDouble();
        System.out.print("Input Second");
        final double sec = s.nextDouble();
        System.out.println("Your speed in meters/second is : " + distance / sec);
        System.out.println("Your speed in km/h is : " + distance / 1000.0 / hour);
        System.out.println("Your speed in miles/h is : " + distance / 1609.0 / hour);
        s.close();
    }
}