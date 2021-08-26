package array;

public class Remove_duplicate
{
    static void print(final int[] arr) {
        for (final int i : arr) {
            System.out.print(String.valueOf(i) + " ");
        }
        System.out.println();
    }
    
    public static void main(final String[] args) {
        final int[] arr = { 0, 1, 2, 2, 3, 4, 4, 4, 5, 5, 1, 6, 3, 7 };
        final int[] temp_arr = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] != Integer.MIN_VALUE) {
                for (int j = i + 1; j < arr.length; ++j) {
                    if (arr[i] == arr[j]) {
                        arr[j] = Integer.MIN_VALUE;
                    }
                }
            }
            if (arr[i] != Integer.MIN_VALUE) {
                temp_arr[k] = arr[i];
                ++k;
            }
        }
        print(arr);
        print(temp_arr);
    }
}


