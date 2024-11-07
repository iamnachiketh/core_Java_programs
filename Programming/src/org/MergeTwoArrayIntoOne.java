package org;

public class MergeTwoArrayIntoOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {34,76,23,98,56,54,66,12,23,89};
		
		int[] b = {34,76,98,45,55,61,81,54,89,23,65,91,97};
		mergeTwoArray(a,b);
	}

	static void mergeTwoArray(int[] a, int[] b) {
		int[] c = new int[a.length+b.length];
		int i = 0;
		for(i =0;i<a.length;i++) c[i] = a[i];
		for(int j=0;j<b.length;j++) {
			c[i] = b[j];
			i++;
		}
		for(int x:c) {
			System.out.print(x+" ");
		}
		
	}

}
