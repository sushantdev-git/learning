package fundamentals;

import java.util.Scanner;

public class Scanner_intro
{
    public static void main(final String[] x) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("Enter user name");
        final String userName = sc.nextLine();
        System.out.println(userName);
        sc.close();
        System.out.println("Enter no of elements you want to store");
        final int n = sc.nextInt();
        final int[] array = new int[n];
        System.out.println("Enter " + n + " elements of array");
        for (int i = 0; i < n; ++i) {
            array[i] = sc.nextInt();
        }
        int[] array2;
        for (int length = (array2 = array).length, j = 0; j < length; ++j) {
            final int i = array2[j];
            System.out.print(String.valueOf(i) + " ");
        }
    }
}