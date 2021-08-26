package array;

import java.util.Scanner;

public class Transpose_of_matrix
{
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
        System.out.print("Enter no of row of matrix");
        final int r = sc.nextInt();
        System.out.print("Enter no of column of matrix");
        final int c = sc.nextInt();
        final int[][] mat = new int[r][r];
        for (int i = 0; i < r; ++i) {
            System.out.println("Enter " + r + " elements of " + (i + 1) + " row of Matrix");
            for (int j = 0; j < c; ++j) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix is: ");
        print_mat(mat);
        for (int k = 0; k < r; ++k) {
            for (int l = k; l < r; ++l) {
                final int temp = mat[k][l];
                mat[k][l] = mat[l][k];
                mat[l][k] = temp;
            }
        }
        System.out.println("Matrix Transpose is: ");
        print_mat(mat);
        sc.close();
    }
}