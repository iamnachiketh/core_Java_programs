package org;

public class MinusOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {34,76,23,98,56,54,66,12,23,89};

		int[] b = {34,76,98,45,55,61,81,54,89,23,65,91,97};
		minusElements(a, b);
	}
	
	public static void minusElements(int[] a,int[] b) {
		boolean[] bool = new boolean[a.length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) bool[i] = true;
			}
		}
		for(int i=0;i<a.length;i++) {
			if(bool[i]==false) System.out.print(a[i]+" ");
			}
		}
		
	}
	
//	public static int numberOfCommon(int[] a, int[] b) {
//		int count = 0;
//		for(int i:a) {
//			for(int j:b) {
//				if(i==j)count++;
//			}
//		}
//		return count;
//	}


