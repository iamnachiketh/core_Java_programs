package org;

public class InsertArrayInsideAnotherArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {34,76,23,98,56,54,66,12,23,89};
		int[] b = {34,76,98,45,55,61,81,54,89,23,65,91,97};
		
		int idx = 3;
		
		insertArray(a,b,idx);
	}

	static void insertArray(int[] a, int[] b, int idx) {
		if(idx>a.length||idx<0) {
			System.out.println("Invalid");
			return;
		}
		
		int[] c = new int[a.length+b.length];
		
		for(int i =0;i<idx;i++) {
			c[i] = a[i];
		}
		int j = idx;
		for(int i= 0;i<b.length;i++) c[j++] = b[i];
		
		for(int k = idx;k<a.length;k++) c[j++] = a[k];
		
		for(int x:c) {
			System.out.print(x+" ");
		}
	}

}
