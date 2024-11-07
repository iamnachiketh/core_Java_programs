package org;

public class ReverseTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,34,23,67,12,89,56};
		int i = 0, j = a.length - 1;
		
		while(i<=j) {
			swap(i,j,a);
			i++;
			j--;
		}
		
		for(int x: a) {
			System.out.println(x);
		}
	}
	
	static void swap(int i, int j, int[] a) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
