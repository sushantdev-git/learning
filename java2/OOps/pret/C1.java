package pret;

import java.util.*;
public class C1 {
	
	public static void main(String x[]){
		
		List <movie> ll = new ArrayList<>();
		ll.add(new movie("Avengers",  2012));
		ll.add(new movie("Avatar", 2008));
		ll.add(new movie("Iron man", 2008));
		ll.add(new movie("Joker", 2019));
		
		Collections.sort(ll);
		
		for(movie m: ll) {
			m.getDetails();
		}
	}

}

class movie implements Comparable<movie>{
	
	String name;
	int year;
	
	movie(String name, int year){
		this.name = name;
		this.year = year;
	}
	
	void getDetails() {
		System.out.println(this.name+" "+this.year);
	}
	
	public int compareTo(movie m2) {
		if(m2.year == this.year) {
			return 0;
		}
		else if(m2.year > this.year) {
			return 1;
		}
		return -1;
	}
	
}
/*
 comparable interface is present in java.lang package
 when we want to make a object comparable then we implement comparable
 interface in that class and then we can compare that object using compareTo
 method that is present in that interface
 
 
 
 */
