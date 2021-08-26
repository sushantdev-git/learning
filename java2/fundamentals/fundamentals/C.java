package fundamentals;
import class_work.Static_key;
public class C extends Static_key{
	
	public static void main(String args[]) {
		System.out.println(Static_key.a);
		//inside other package if you want to access the value of variables of
		//some other class then 
		//first you have to import that class and then
		//you can use class_name.var_name
		//but the condition is that, that variable must be public, if that variable is
		//private, default, protected then that variable can't be used
		//and that variable must be static
		//if you want to use that variable
		//for that you have to use get and set method
		
		//if you want to inherit some class outside the package
		//then you have to import that class, 
		//and then inherit that class
		//and if you inherit that class then variable can be public or protected
		//and variable must be static
		
		//the variable should be static because, it is a property of class
		//and can't be different for different objects
		//it is same across all objects 
		//
	}
}
