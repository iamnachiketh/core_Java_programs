package org;

public class PairOfElementSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3,86,23,3,56,54,66,12,23,89};
		pairSum(a,6);
	}
	
	public static void pairSum(int[] a, int target) {
		
		for(int i=0;i<a.length;i++) {
			int r = target - a[i];
			for(int j=i+1;j<a.length;j++) {
				if(a[j] == r) System.out.println("("+a[i]+","+a[j]+")");
			}
		}
	}

}
