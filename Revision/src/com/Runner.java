package com;

import java.util.ArrayList;
import java.util.Set;

public class Runner {
	
	static void display(Object obj,ArrayList arr) {
		
		if(obj instanceof Example || obj instanceof Solution) arr.add(obj);
		else System.out.println("Not a new Example or not a Solution object");
	}
	
	public static void main(String[] args) {
		
//		ArrayList arr = new ArrayList();
//		display(new Example(),arr);
//		display(new Solution(),arr);
//		display(new Runner(),arr);
//		System.out.println(arr);	
		Set s = null;
	}
	
}
