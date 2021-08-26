package fundamentals;

public class Looping
{
    public static void main(final String[] args) {
        int i = 1;
        int s = 0;
        while (i <= 10) {
            s += i;
            ++i;
        }
        System.out.println("While sum = " + s + " i = " + i);
        i = 1;
        s = 0;
        do {
            s += i;
        } while (++i <= 10);
        System.out.println("Do While sum = " + s + " i = " + i);
        s = 0;
        int j;
        for (j = 1, i = 1; j <= 10 && i <= 5; ++j, ++i) {
            System.out.println(String.valueOf(i) + " " + j);
            s += j + i;
        }
        System.out.println("FOR sum = " + s);
        final char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
        char[] array;
        for (int length = (array = vowels).length, k = 0; k < length; ++k) {
            final char item = array[k];
            System.out.println(item);
        }
    }
}
