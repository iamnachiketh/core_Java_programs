package org;

public class EvenOddNumbers {
	public static void main(String[] args) {
		int[] a= {10,34,23,67,12,89,56};
		int co = 0, ce = 0;
		for(int i : a) {
			if(i%2==0) ce++;
			else co++;
		}
		
		System.out.println("The count of odd numbers is :"+co);
		System.out.println("The count of even numbers is :"+ce);
	}
}
