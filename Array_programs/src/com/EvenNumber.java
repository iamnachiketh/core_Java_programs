package com;

public class EvenNumber {

	public static void main(String[] args) {
		int[] a = {10,11,12,13,14,15};
		//System.out.println("Enter the nuber of elements");
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) System.out.println("Yes "+a[i]+" is a even number");
		}
	}
}
