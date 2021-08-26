package collections;
import java.util.*;

/*
make a class sort the movies according to the year
Laptop class sort by brand
*/
public class Comparator_movies{
	int year;
	String name;
	float rating;
	
	Comparator_movies(String name, int year, float rating){
		this.name = name;
		this.year = year;
		this.rating = rating;
	}
	
	public static void main(String args[]) {
		ArrayList<Comparator_movies> al = new ArrayList<>();
		al.add(new Comparator_movies("Inception",2010, 8.5f));
		al.add(new Comparator_movies("Joker",2019, 8.7f));
		al.add(new Comparator_movies("Interseller",2014, 9f));
		al.add(new Comparator_movies("Avengers Endgame",2020, 9.2f));
		
		System.out.println("Sorting by Name: ");
		al.sort(new SortByName());
		
		for(Comparator_movies m:al) {
			System.out.println(m.name+" "+m.year+" "+m.rating);
		}
		
		System.out.println("\nSorting by Year: ");
		al.sort(new SortByYear());
		
		for(Comparator_movies m:al) {
			System.out.println(m.name+" "+m.year+" "+m.rating);
		}
		
		System.out.println("\nSorting by Rating: ");
		Collections.sort(al,new SortByRating());
		
		for(Comparator_movies m:al) {
			System.out.println(m.name+" "+m.year+" "+m.rating);
		}
	}
	
	
}

class SortByName implements Comparator<Comparator_movies> {
	
	
	public int compare(Comparator_movies m1, Comparator_movies m2) {
		
		return m1.name.compareTo(m2.name);
	}
	
}

class SortByYear implements Comparator<Comparator_movies>{
	
	public int compare(Comparator_movies m1, Comparator_movies m2) {
		if(m1.year == m2.year) {
			return 0;
		}
		else if(m1.year>m2.year) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
	
}

class SortByRating implements Comparator<Comparator_movies>{
	
	public int compare(Comparator_movies m1, Comparator_movies m2) {
		if(m1.rating == m2.rating) {
			return 0;
		}
		else if(m1.rating>m2.rating) {
			return -1;
		}
		else {
			return 1;
		}
		
		//if you want to reverse the order then change -1 with 1 and 1 with -1
	}
	
}
