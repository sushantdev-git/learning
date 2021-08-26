package pret;
import java.util.*;
public class MC {
	
	public static void main(String args[]) {
		
		Comparator<info> c1 = new Comparator<info>(){
			
			public int compare(info i1, info i2) {
				return i1.name.compareTo(i2.name);
			}
		};
		
		Comparator<info> c2 = new Comparator<info>(){
			
			public int compare(info i1, info i2) {
				if(i1.rollno > i2.rollno) return -1;
				return 1;
			}
		};
		
		Map <info, Integer> map = new TreeMap<>(c2);
		//Collections.reverseOrder()
		
		map.put(new info("Sushant", 10, 489327409),1);
		map.put(new info("Rahul", 15, 878590432),2);
		map.put(new info("Avinash", 20, 1398439209),3);
		map.put(new info("Rohit", 30, 232482738),4);
		
		
		System.out.println(map);
		
		
		
	}
}

class info implements Comparable<info>{
	//making object of info type comparable
	String name;
	int rollno;
	int phoneNo;
	
	info(String name, int rollno, int phoneNo){
		this.name = name;
		this.rollno = rollno;
		this.phoneNo = phoneNo;
	}
	
	public String toString(){
		return this.name+" "+this.rollno+" "+this.phoneNo;
	}
	
	public int compareTo(info i2) {
		return this.name.compareTo(i2.name);
	}

}
