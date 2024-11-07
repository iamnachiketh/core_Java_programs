package org;

import java.util.Arrays;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {34,76,23,98,56,54,66,12,23,89};
		
		int[] b = {34,76,98,45,55,61,81,54,89,23,65,91,97};
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		mergeSortedArray(a,b);
	}
	
	static void mergeSortedArray(int[] a, int[] b) {
		int[] c = new int[a.length+b.length];
		int i=a.length-1, j=b.length-1, k=0;
		while(i>=0&&j>=0) {
			if(a[i]>b[j]) c[k++] = a[i--];
			else c[k++] = b[j--];
		}
		
		while(i>=0) c[k++] = a[i--];
		
		while(j>=0) c[k++] = b[j--];
		
		for(int x:c) System.out.print(x+" ");
	}

}
