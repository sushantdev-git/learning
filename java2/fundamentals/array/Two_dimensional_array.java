package array;

public class Two_dimensional_array
{
    public static void main(final String[] x) {
        final int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] array;
        for (int length = (array = a).length, k = 0; k < length; ++k) {
            final int[] i = array[k];
            int[] array2;
            for (int length2 = (array2 = i).length, l = 0; l < length2; ++l) {
                final int j = array2[l];
                System.out.print(j);
            }
            System.out.println();
        }
    }
}