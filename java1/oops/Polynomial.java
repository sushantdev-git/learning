package oops;

public class Polynomial {
	
	Dynamic_Array d = new Dynamic_Array();
	
	public void setCofficient(int deg,int cof) {
		d.set(deg, cof);
	}
	
	public void print() {
		int i=0; 
		while(i<d.size()) {
			if(d.get(i) != 0) {
				System.out.print(d.get(i)+"x^"+i+" + ");
			}
			i++;
		}
		System.out.println();
	}
	
	public void add(Polynomial p2) {
		
		int s = Math.max(this.d.size(), p2.d.size());
		
		int arr[] = new int[s];
		
		this.d.print();
		p2.d.print();
		
		for(int i=0 ;i<s; i++) {
			arr[i] = this.d.get(i)+p2.d.get(i);
		}
		
		
		this.d.set_arr(arr);
		
		this.d.print();
	}
	
	public static Polynomial add(Polynomial p1, Polynomial p2) {
		
		int s = Math.max(p1.d.size(), p2.d.size());
		
		int arr[] = new int[s];
		
		
		for(int i=0 ;i<s; i++) {
			arr[i] = p1.d.get(i)+p2.d.get(i);
		}
		
		Polynomial p3 = new Polynomial();
		
		
		p3.d.set_arr(arr);
		
		return p3;

	}
	
	public static Polynomial subtract(Polynomial p1, Polynomial p2) {
			
			int s = Math.max(p1.d.size(), p2.d.size());
			
			int arr[] = new int[s];
			
			
			for(int i=0 ;i<s; i++) {
				arr[i] = p1.d.get(i) - p2.d.get(i);
			}
			
			Polynomial p3 = new Polynomial();
			
			
			p3.d.set_arr(arr);
			
			return p3;
	
	}
	
	private static int[] simplify(int deg, int cof, int[] arr,Polynomial p2) {
		
		int temp;
		
		for(int i=0; i<p2.d.size(); i++) {
			
			if(p2.d.get(i) != 0) {
				temp = cof*p2.d.get(i);
				arr[deg+i]+= temp;
			}
		}
		
		return arr;
	}
	
	public static Polynomial multiply(Polynomial p1, Polynomial p2) {
		
		int s = p1.d.size()+ p2.d.size();
		
		int arr[] = new int[s];
		
		for(int i=0; i<p1.d.size(); i++) {
			
			if(p1.d.get(i) != 0) {
				arr = simplify(i, p1.d.get(i), arr, p2);
			}
		}
		
		Polynomial p3 = new Polynomial();
		
		p3.d.set_arr(arr);
		
		return p3;
	}
	
	public int evaluate(int x) {
		int sum = 0;
		
		for(int i=0; i<this.d.size(); i++) {
			
			if(this.d.get(i) != 0) {
				sum+= this.d.get(i)*Math.pow(x, i);
			}
		}
		
		return sum;
	}
	
	
	
	
	public static void main(String args[]) {
		
		Polynomial p1 = new Polynomial();
		
		p1.setCofficient(0, 4);
		p1.setCofficient(1, 3);
		
		p1.print();
		
		System.out.println(p1.evaluate(1));
		
		Polynomial p2 = new Polynomial();
		p2.setCofficient(1, 5);
		p2.setCofficient(0, 6);
		
		p2.print();
		
		//p1.add(p2);
		
		//p1.print();
		
		Polynomial p3 = Polynomial.add(p1,p2);
		
		p3.print();
		
		Polynomial p4 = Polynomial.subtract(p1,p2);
		
		p4.print();
		
		Polynomial p5 = Polynomial.multiply(p1,p2);
		
		p5.print();
		
		
		
	}
	
}
