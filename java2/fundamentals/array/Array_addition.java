package array;
import java.util.Scanner;

public class Array_addition {
	static void print_mat(final int[][] arr) {
        for (final int[] i : arr) {
            int[] array;
            for (int length2 = (array = i).length, l = 0; l < length2; ++l) {
                final int j = array[l];
                System.out.print(String.valueOf(j) + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("__________THIS IS A PROGRAM OF MATRIX ADDITION__________");
        System.out.print("Enter no of rows of matrix : ");
        final int r = sc.nextInt();
        System.out.print("Enter no of column of matrix : ");
        final int c = sc.nextInt();
        final int[][] mat1 = new int[r][c];
        for (int i = 0; i < r; ++i) {
            System.out.println("Enter " + c + " elements of " + (i + 1) + " row of Matrix ");
            for (int j = 0; j < c; ++j) {
                mat1[i][j] = sc.nextInt();
            }
        }
        System.out.println("______________________________________");
        final int[][] mat2 = new int[r][c];
        for (int k = 0; k < r; ++k) {
            System.out.println("Enter " + c + " elements of " + (k + 1) + " row of Matrix ");
            for (int l = 0; l < c; ++l) {
                mat2[k][l] = sc.nextInt();
            }
        }
        System.out.println("______________________________________");
        System.out.println("Matrix 1 is: ");
        print_mat(mat1);
        System.out.println("Matrix 2 is: ");
        print_mat(mat2);
        for (int k = 0; k < r; ++k) {
            for (int l = 0; l < c; ++l) {
                final int[] array = mat1[k];
                final int n = l;
                array[n] += mat2[k][l];
            }
        }
        System.out.println("Addition of above matix is ");
        print_mat(mat1);
        sc.close();
}
}
