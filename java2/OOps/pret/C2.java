package pret;
import java.util.*;
class Laptop{
	
	String Brand;
	int ram;
	float price;
	
	Laptop(String Brand, int ram, float price){
		this.Brand = Brand;
		this.ram = ram;
		this.price =price;
	}
	
	void getDetails(){
		System.out.println(this.Brand+"\t"+this.ram+"\t"+this.price);
	}
}

public class C2 {
	
	public static void main(String args[]) {
		
		List <Laptop> lap = new ArrayList<>();
		lap.add(new Laptop("Asus", 8, 30000));
		lap.add(new Laptop("HP", 12, 40000));
		lap.add(new Laptop("Dell", 16, 60000));
		lap.add(new Laptop("Apple", 8, 90000));
		
		Comparator<Laptop> c1 = new Comparator<Laptop>() {
			//this is a anonymous class and can be helpful for single time use

			public int compare(Laptop l1, Laptop l2) {
				if(l1.price == l2.price) {
					return 0;
				}
				else if(l1.price > l2.price) {
					return -1;
				}
				return 1;
			}
			
		};
		
		Comparator<Laptop> c2 = new Comparator<Laptop>() {
			//this is a anonymous class and can be helpful for single time use

			public int compare(Laptop l1, Laptop l2) {
				return l1.Brand.compareTo(l2.Brand);
			}
			
		};
		
		
		Comparator<Laptop> c3 = new Comparator<Laptop>() {
			//this is a anonymous class and can be helpful for single time use

			public int compare(Laptop l1, Laptop l2) {
				if(l1.ram == l2.ram) {
					return 0;
				}
				else if(l1.ram > l2.ram) {
					return -1;
				}
				return 1;
			}
			
		};
		
		
//		lap.sort(c1);
//		System.out.println("Sorting on basis of price ");
//		for(Laptop l: lap) {
//			l.getDetails();
//		}
		

//		lap.sort(c2);
//		System.out.println("\nSorting of basis of Brand Name");
//		for(Laptop l: lap) {
//			l.getDetails();
//		}
//		
		lap.sort(c3);
		System.out.println("\nSorting of basis of Ram");
		for(Laptop l: lap) {
			l.getDetails();
		}
	}

}

