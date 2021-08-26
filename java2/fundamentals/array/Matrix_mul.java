package array;

import java.util.Scanner;

public class Matrix_mul
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
    
    static int[][] multiply_mat(final int[][] mat1, final int[][] mat2, final int r1, final int c1, final int c2) {
        final int[][] result = new int[r1][c2];
        for (int i = 0; i < r1; ++i) {
            for (int k = 0; k < c2; ++k) {
                result[i][k] = 0;
                for (int j = 0; j < c1; ++j) {
                    final int[] array = result[i];
                    final int n = k;
                    array[n] += mat1[i][j] * mat2[j][k];
                }
            }
        }
        return result;
    }
    
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows of matrix 1: ");
        final int r1 = sc.nextInt();
        System.out.print("Enter no of column of matrix 1: ");
        final int c1 = sc.nextInt();
        final int[][] mat1 = new int[r1][c1];
        for (int i = 0; i < r1; ++i) {
            System.out.println("Enter " + c1 + " elements of " + (i + 1) + " row of Matrix ");
            for (int j = 0; j < c1; ++j) {
                mat1[i][j] = sc.nextInt();
            }
        }
        System.out.println("______________________________________");
        System.out.print("Enter no of rows of matrix 2: ");
        final int r2 = sc.nextInt();
        System.out.print("Enter no of column of matrix 2: ");
        final int c2 = sc.nextInt();
        final int[][] mat2 = new int[r2][c2];
        for (int k = 0; k < r2; ++k) {
            System.out.println("Enter " + c2 + " elements of " + (k + 1) + " row of Matrix ");
            for (int l = 0; l < c2; ++l) {
                mat2[k][l] = sc.nextInt();
            }
        }
        System.out.println("______________________________________");
        final int[][] res = multiply_mat(mat1, mat2, r1, c1, c2);
        print_mat(res);
        sc.close();
    }
}
