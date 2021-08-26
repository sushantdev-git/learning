package class_work;

import java.util.Scanner;

public class Greater_of_three
{
    public static void main(final String[] x) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number");
        final int a = sc.nextInt();
        final int b = sc.nextInt();
        final int c = sc.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println(String.valueOf(a) + " is largest");
            }
            else {
                System.out.println(String.valueOf(c) + " is largest");
            }
        }
        else if (b > c) {
            System.out.println(String.valueOf(b) + " is largest");
        }
        else {
            System.out.println(String.valueOf(c) + " is largest");
        }
        sc.close();
    }
}