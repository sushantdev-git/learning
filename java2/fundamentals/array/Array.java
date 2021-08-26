package array;

public class Array
{
    public static void main(final String[] args) {
        final int[] a = { 0, 1, 3, 4, 5 };
        int[] array;
        for (int length = (array = a).length, k = 0; k < length; ++k) {
            final int i = array[k];
            System.out.println(i);
        }
        final int[] b = { 1, 2, 3, 4, 5 };
        int[] array2;
        for (int length2 = (array2 = b).length, l = 0; l < length2; ++l) {
            final int j = array2[l];
            System.out.println(j);
        }
    }
}
