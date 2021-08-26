package oops;

public class Dynamic_Array {
	
	private int data[];
	private int size_arr = 0;
	
	
	public Dynamic_Array() {
		data = new int[5];
		size_arr = 0;
	}
	
	public int size() {
		return size_arr;
	}
	
	public boolean isEmpty() {
		return size_arr == 0;
	}
	
	public int get(int i) {
		if(i >= size_arr) {
			return 0;
		}
		return data[i];
	}
	
	public void set(int i, int x) {
		if(i >= size_arr) {
			set_arr_in(i,x);
			return;
		}
		data[i] = x;
	}
	
	public int pop() {
		if(isEmpty()) {
			return -1;
		}
		int x = data[size_arr-1];
		size_arr--;
		return x;
	}
	
	public void add(int x) {
		if(size_arr == data.length) {
			
			doubleCapacity();
		}
		data[size_arr] = x;
		size_arr++;
		
	}
	
	private void doubleCapacity() {
			
		int arr[] = new int[size_arr*2];
		
		for(int i=0 ; i<size_arr; i++) {
			arr[i]=data[i];
		}
		
		data = arr;
	}
	
	public void print() {
		if(size_arr == 0) {
			System.out.println("0 Elements in array");
		}
		for(int i=0; i<size_arr; i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
	}
	
	private void set_arr_in(int in, int ele) {
		
		int arr[] = new int[in+1];
		
		for(int i=0 ; i<size_arr; i++) {
			arr[i]=data[i];
		}
		
		arr[in] = ele;
		
		data = arr;
		
		size_arr = in+1;
		
		
	}
	
	public void insert(int in, int ele) {
		if(in > size_arr) {
			set_arr_in(in,ele);
			return;
		}
		
		if(size_arr+1 >= data.length) {
			doubleCapacity();
		}
		
		int j=size_arr+1;
		while(j>=in) {
			
			data[j]=data[j-1];
			
			j--;
		}
		
		data[in]=ele;
		size_arr++;
		
	}
	
	public void set_arr(int arr[]) {
		this.data = arr;
		size_arr = data.length;
	}
	
	
	public static void main(String args[]) {
		
		Dynamic_Array d = new Dynamic_Array();
		d.add(5);
		d.add(10);
		d.add(14);
		d.add(65);
		System.out.println(d.size());
//		System.out.println(d.get(0));
//		System.out.println(d.get(2));
//		System.out.println(d.pop());
		
		d.set(2,10);
		d.print();
		System.out.println(d.pop());
		System.out.println(d.isEmpty());
		
		
		Dynamic_Array d2 = new Dynamic_Array();
		
		
		
		for (int i=1; i<=5; i++) {
			d2.add(i*2);
		}
		
		d2.insert(11,1000);
		d2.print();
		d2.add(21);
		d2.print();
//		
//		d2.print();
//		
//		while(!d2.isEmpty()) {
//			System.out.println("Size "+d2.size());
//			System.out.println("Pop "+d2.pop());
//		}
//		System.out.println("Size "+d2.size());
		
	}

}
