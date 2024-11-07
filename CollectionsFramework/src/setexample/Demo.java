package setexample;

import java.util.*;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set hs = new HashSet(); // Insertion order is not maintained
		hs.add(10);
		hs.add("java");
		hs.add(10);
		hs.add(true);
		
		System.out.println("The size of hashset is: "+hs.size());
		
		for(Object obj:hs) {
			System.out.println(obj);
		}
		
		LinkedHashSet <Integer>ls = new LinkedHashSet<>();
		Set s = null;
		ls.add(10);
		ls.add(20);
		ls.add(10);
		ls.add(30);
		
		System.out.println("The size of linked hashset is: "+ls.size());
		
		for(Object obj:ls) {
			System.out.println(obj);
		}
	}

}
