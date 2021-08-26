

package pattern;

import java.util.Scanner;

public class Right_tirangle_pattern
{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        final int n = sc.nextInt();
        System.out.println("Reverse Right Triangle\n");
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\nRight Triangle \n");
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n - i - 1; ++j) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n Square Rotated by 45° \n");
        final int x = n / 2;
        for (int k = 0; k < x + 1; ++k) {
            for (int l = 0; l < x - k; ++l) {
                System.out.print("  ");
            }
            for (int l = 0; l <= k; ++l) {
                System.out.print("* ");
            }
            for (int l = 0; l < k; ++l) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int k = 0; k < x; ++k) {
            System.out.print("  ");
            for (int l = 0; l < k; ++l) {
                System.out.print("  ");
            }
            for (int l = 0; l <= x - k - 1; ++l) {
                System.out.print("* ");
            }
            for (int l = 0; l < x - k - 1; ++l) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
