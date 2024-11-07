package com;
import java.util.*;

public class ArrayListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer>arr = new ArrayList<>();
		
		arr.add(20);
		arr.add(89);
		arr.add(67);
		
		System.out.println(arr);
		
		arr.add(1,55);
		
		System.out.println(arr);
		
		arr.set(3, 78);
		
		//System.out.println(arr);
		for(int i : arr) System.out.println(i);
		System.out.println("=================================");
		ListIterator<Integer> ls = arr.listIterator();
		
		while(ls.hasNext()){
			System.out.println(ls.next());
		}
		
		
	}

}
