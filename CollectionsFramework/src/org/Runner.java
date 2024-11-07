package org;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Runner {
	public static void main(String[] args) {
		ArrayList<Integer> arr  = new ArrayList<>();
		
		arr.add(20);
		arr.add(10);
		arr.add(98);
		arr.add(78);
		
		System.out.println(arr);
		
		Collections.sort(arr);
		System.out.println(arr);
		
		Collections.reverse(arr);
		
		System.out.println(arr);
		
		LinkedList ls = new LinkedList();
		
		ls.add(20);
		ls.add(54);
		ls.add(67);
		ls.add(12);
		ls.add(true);
		ls.add(13.67);
		
		Collections.reverse(ls);
		
		System.out.println(ls);
	}
}
