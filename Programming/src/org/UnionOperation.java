package org;

public class UnionOperation {
	public static void main(String[] args) {
		
		int[] a = {34,76,23,98,56,54,66,12,23,89};
		
		int[] b = {34,76,98,45,55,61,81,54,89,23,65,91,97};
		
		unionOpetaion(a,b);
	}
	
	public static void unionOpetaion(int[] a, int[] b) {
		
		int count = 0;
		for(int i : a) {
			for(int j:b) {
				if(i ==j) count++;
			}
		}
		
		int[] c = new int[a.length+b.length - count];
		for(int i=0;i<a.length;i++) {
			c[i] = a[i];
		}
		
		int idx = a.length;
		boolean f = false;
		for(int i=0;i<b.length;i++) {
			f = false;
			for(int j=0;j<a.length;j++) {
				if(b[i] == a[j]) {
					f = true;

					break;
				}
				if(f == false) c[idx++] = b[i];
			}
		}
		for(int i:c) {
			System.out.print(i+" ");
		}
	}
}
