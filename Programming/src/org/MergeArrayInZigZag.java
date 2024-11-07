package org;

public class MergeArrayInZigZag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {34,76,23,98,56,54,66,12,23,89};
		
		int[] b = {34,76,98,45,55,61,81,54,89,23,65,91,97};
		
		mergeZigZag(a,b);
	}

	static void mergeZigZag(int[] a, int[] b) {
		int[] c = new int[a.length+b.length];
		int i=0,j=0,k=0;
		
		while(i<a.length&&j<b.length) {
			c[k++] = a[i++];
			c[k++] = b[j++];
		}
		
		while(i<a.length) c[k++] = a[i++];
		
		while(j<b.length) c[k++] = b[j++];
		
		for(int x:c) {
			System.out.print(x+" ");
		}
		
	}

}
