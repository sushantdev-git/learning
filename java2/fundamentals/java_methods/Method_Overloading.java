package java_methods;

public class Method_Overloading
{
    static double area(int r) {
    	//area of circle
        return Math.PI * Math.pow(r, 2);
    }
    
    static int area(int l, int b) {
    	//area of rectangle
        return l * b;
    }
    
    static int area(int a, int b, int c) {
    	int s = (a+b+c)/2;
    	//semi_perimeter
    	//heron's formula
    	
    	int area = (int)Math.sqrt(s*(s - a)*(s - b)*(s - c));
    	return area;
    }
    
    public static void main(String[] x) {
        System.out.println("Area of circle = " + area(5));
        System.out.println("Area of rectangle = " + area(5, 10));
        System.out.println("Area of triangle = "+area(122,22,120));
    }
}