package com;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = new ArrayList<>();
		
		ls.add("Harsh");
		ls.add("Manish");
		ls.add("Rohit");
		
		ListIterator <String> i = ls.listIterator();
		//ListIterator<String> it = ls.listIterator(ls.size());
		
		while(i.hasNext()) System.out.println(i.next());
		
		System.out.println("===============================");
		
		while(i.hasPrevious()) System.out.println(i.previous());
		
	}

}
