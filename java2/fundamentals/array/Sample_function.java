package array;

public class Sample_function
{
    static int sums(final int[] a) {
        int s = 0;
        for (final int i : a) {
            s += i;
        }
        return s;
    }
    
    public static void main(final String[] x) {
        final int[] a = { 5, 5, 5, 5, 5 };
        final int s = sums(a);
        System.out.println("Sum of each element of array is: " + s);
    }
}
