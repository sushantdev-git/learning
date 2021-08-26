package class_work;

import java.util.Scanner;

public class Calculator
{
    public static void main(final String[] x) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("This is a program of Calculator");
        System.out.println("Choose an oprator to continue + - * /");
        final char op = sc.next().charAt(0);
        System.out.println("Enter 1st Number");
        final int a = sc.nextInt();
        System.out.println("Enter 2nd Number");
        final int b = sc.nextInt();
        switch (op) {
            case '+': {
                System.out.println(a + b);
                break;
            }
            case '-': {
                System.out.println(a - b);
                break;
            }
            case '*': {
                System.out.println(a * b);
                break;
            }
            case '/': {
                System.out.println(a / b);
                break;
            }
            default: {
                System.out.println("Please enter a valid input");
                break;
            }
        }
        sc.close();
    }
}