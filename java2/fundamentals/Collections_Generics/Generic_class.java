package Collections_Generics;

public class Generic_class<T> {
	//This is a generic class
	//here T is type of generic class
	
	//here you can pass more than one type of parameter in generic class like:
	//class Test<T,U>{}
	
	T i;
	public void Add(T i1) {
		i = i1;
	}
	
	public T get() {
		//in return type you can give T only
		return i;
	}
	
//	public T get(T s[]) {
//		return s;
//	}
	
	public static void main(String args[]) {
		Generic_class<Integer> gc1 = new Generic_class<Integer>();
		Generic_class<String> gc2 = new Generic_class<String>();

		gc1.Add(13);
		
		gc2.Add("Hello");
		System.out.println(gc1.get());
		System.out.println(gc2.get());
		
	}
}
