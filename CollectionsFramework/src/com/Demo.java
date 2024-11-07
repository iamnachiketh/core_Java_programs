package com;

import java.util.ArrayList;
import java.util.LinkedList;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList  arr = new ArrayList();
		
		arr.add(20);
		arr.add(40);
		
		LinkedList ls = new LinkedList();
		ls.add(10);
		ls.add(30);
		
		ls.addAll(arr);
		ls.add(arr);
		System.out.println(ls);
		
		System.out.println(ls.containsAll(arr));
		
	}

}
