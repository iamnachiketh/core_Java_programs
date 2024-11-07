package org;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {34,76,23,98,56,54,66,12,23,89};
		removeDuplicates(a);
	}
	
	public static void removeDuplicates(int[] a) {
		boolean[] b = new boolean[a.length];
	
		for(int i=0;i<a.length;i++) {
			if(b[i]==false) {
				for(int j=i+1;j<a.length;j++) {
					if(a[j]==a[i]) b[j] = true;
				}
			}
		}
		int count = 0;
		for(boolean i:b) {
			if(i == false) count++;
		}
		
		int[] c = new int[count];
		int idx = 0;
		for(int i=0;i<a.length;i++) {
			if(b[i]==false) c[idx++] = a[i];
		}
		for(int i:c) System.out.print(i+" ");
	} 

}
