package fundamentals;

public class Switch
{
    public static void main(final String[] args) {
        final int day = 4;
        switch (day) {
            case 1: {
                System.out.println("Monday");
                break;
            }
            case 2: {
                System.out.println("Tuesday");
                break;
            }
            case 3: {
                System.out.println("Wedday");
                break;
            }
            case 4: {
                System.out.println("Thrusday");
                break;
            }
            case 5: {
                System.out.println("Friday");
                break;
            }
            case 6: {
                System.out.println("Satday");
                break;
            }
            case 7: {
                System.out.println("Sunday");
                break;
            }
            default: {
                System.out.println("Invalid input");
                break;
            }
        }
    }
}
