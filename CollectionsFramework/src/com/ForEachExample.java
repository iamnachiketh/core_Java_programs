package com;

public class ForEachExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10,23,12};
		
		for(int i : a) {
			System.out.println(i);
		}
		
		System.out.println("=======================================");
		
		String[] s = {"Apple","Orange","Banana","Pomogranate"};
		for(String x : s) {
			System.out.println(x);
		}
	}

}
