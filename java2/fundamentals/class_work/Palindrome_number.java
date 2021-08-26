package class_work;

import java.util.Scanner;

public class Palindrome_number
{
    static int isPalindrome(final int n, int temp) {
        if (n == 0) {
            return temp;
        }
        temp = temp * 10 + n % 10;
        return isPalindrome(n / 10, temp);
    }
    
    public static void main(final String[] x) {
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        if (isPalindrome(n, 0) == n) {
            System.out.println(String.valueOf(n) + " is an Palindrome number");
        }
        else {
            System.out.println(String.valueOf(n) + " is not a Palindrome number");
        }
        sc.close();
    }
}