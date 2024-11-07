package com;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Double> ls = new LinkedList  ();
		
		ls.add(30.00);
		ls.add(20.00);
		ls.add(90.00);
		for(int i =0;i<ls.size();i++) {
			System.out.println(ls.get(i));
		}
		System.out.println("=======================");
		for(int i =ls.size() - 1;i>=0;i--) {
			System.out.println(ls.get(i));
		}
		
		System.out.println(ls);
	}

}
