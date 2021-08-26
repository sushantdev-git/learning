package array;

import java.util.Scanner;

public class Find_maximum_and_minimum
{
    public static void main(final String[] x) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements you want to enter in array: ");
        final int n = sc.nextInt();
        final int[] arr = new int[n];
        System.out.println("Enter " + n + " elemetns in array");
        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for (int j = 1; j < n; ++j) {
            if (arr[j] < min) {
                min = arr[j];
            }
            if (arr[j] > max) {
                max = arr[j];
            }
        }
        System.out.println("Maximum  = " + max + " , Minimum = " + min);
        sc.close();
    }
}