package org;

public class CountTheNthBiggest {

	public static void main(String[] args) {
		
		int[] a = {34,76,23,98,56,54,66,12,23,89};
		countNthBiggest(a,3);
	}
	
	public static void countNthBiggest(int[] a,int x) {
		int count = 0;
		for(int i=0;i<a.length;i++) {
			for(int j =0;j<a.length;j++) {
				if(a[i]<a[j]) count++;
			}
			if(count == x-1) {
				System.out.println(a[i]+" is the "+x+"th biggest number !!!");
				return;
			}
			count = 0;
		}
	}

}
