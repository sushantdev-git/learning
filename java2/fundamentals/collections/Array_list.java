package collections;
import java.util.*;

public class Array_list {
	
	public static void main(String args[]) {
		
		ArrayList aa = new ArrayList();
		
		aa.add("Sunday");
		aa.add("Monday");
		aa.add("Tuesday");
//		aa.add("Wednesday");
		aa.add("Thrusday");
		aa.add("Friday");
		aa.add("Saturday");
		
		System.out.println(aa);
		
		aa.add(3,"Wednesday");//adding an element at index no
		aa.add(12);
		System.out.println(aa);
		
		if(aa.contains("Sunday")) {
			//membership in arrayList
			System.out.println("Name found");
		}
		
		System.out.println("Iterating over list");
		
		for(int i=0; i<aa.size(); i++) {
			//size can be found using size()
			
			System.out.println(aa.get(i));
			//using get(i) to get element of array list
		}
		
		//Iterator<?> itr = aa.iterator();
		//using generic object of iterator
		//making iterator of aa(array list)
		
		Iterator itr = aa.iterator();
		
		while(itr.hasNext()) {//hasNext() will return boolean value
			
			Object s = itr.next();
			System.out.println(s);
			
//			if(itr.next().equals("Sunday")) {
//				itr.remove(s);
//				//this method can be used to remove data from
//			}
			
		}
		
		System.out.println(aa);
		//clear size remove equals
		
	}
	
}
