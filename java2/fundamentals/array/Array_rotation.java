package array;

public class Array_rotation
{
    static void print(final int[] arr) {
        for (final int i : arr) {
            System.out.print(String.valueOf(i) + " ");
        }
        System.out.println();
    }
    
    public static void rotate(final int[] arr, final int d) {
        for (int i = 0; i < d / 2; ++i) {
            final int temp = arr[d - i - 1];
            arr[d - i - 1] = arr[i];
            arr[i] = temp;
        }
        int i = d;
        for (int j = 0; j < (arr.length - d) / 2; ++j) {
            final int temp = arr[arr.length - j - 1];
            arr[arr.length - j - 1] = arr[i];
            arr[i] = temp;
            ++i;
        }
        for (i = 0; i < arr.length / 2; ++i) {
            final int temp = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[i];
            arr[i] = temp;
        }
    }
    
    public static void main(final String[] args) {
        final int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        final int k = 5;
        rotate(arr, k);
        print(arr);
    }
}