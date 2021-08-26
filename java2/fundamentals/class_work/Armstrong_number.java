package class_work;

import java.util.Scanner;

public class Armstrong_number
{
    static boolean isArmstrong(int n) {
        int s = 0;
        final int temp = n;
        final int p = (int)Math.log(n) / 2 + 1;
        System.out.println(p);
        while (n != 0) {
            System.out.println(n % 10);
            s += (int)Math.pow(n % 10, p);
            n /= 10;
        }
        System.out.println(s);
        return s == temp;
    }
    
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        if (isArmstrong(n)) {
            System.out.println(String.valueOf(n) + " is an armstrong number");
        }
        else {
            System.out.println(String.valueOf(n) + " is not a armstrong number");
        }
        sc.close();
    }
}