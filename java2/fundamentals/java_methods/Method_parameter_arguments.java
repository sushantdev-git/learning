package java_methods;

public class Method_parameter_arguments
{
    static String myMethod(final String a) {
        System.out.println(String.valueOf(a) + " Hello");
        return "Hello";
    }
    
    public static void main(final String[] x) {
        final String a = myMethod("Sushant");
        System.out.println(a);
        System.out.println(myMethod("Sushant"));
    }
}