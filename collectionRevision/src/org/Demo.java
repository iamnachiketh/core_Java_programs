package org;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arr1 = new ArrayList<>();
		
		Vector<Integer> arr2 = new Vector<>();
		
		arr1.add(20);
		arr1.add(30);
		arr1.add(12);
		arr1.add(40);
		
		arr2.add(50);
		arr2.add(200);
		arr2.add(175);
		
		arr1.addAll(arr2);
		System.out.println(arr1);
	}

}
