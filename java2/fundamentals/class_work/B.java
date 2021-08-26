package class_work;
class B {
	public static void main(String args[]) {
		System.out.println(Static_key.a);
		Static_key.a=20;
		//inside same package if you want to access the value of variables of
		//some other class then you can use class_name.var_name
		//but the condition is that, that variable can't be private
		//and that variable must be static
		//for that you have to use get and set method
		//Static_key.print();
	}
}
