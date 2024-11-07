package org;

public class InsertElementAtPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {34,76,98,45,55,61,81,54,89,23,65,91,97};
		int idx = 5;
		int ele = 51;
		insertAnElement(a,idx,ele);
	}

	static void insertAnElement(int[] a, int idx,int ele) {
		// TODO Auto-generated method stub
		if(idx>a.length-1 || idx<0) {
			System.out.println("Invalid");
			return;
		}
		
		int[] b = new int[a.length+1];
		for(int i=0;i<a.length;i++) b[i] = a[i];
		for(int i = b.length-2;i>idx;i--) b[i+1] = b[i];
		b[idx] = ele;
		for(int x:b) {
			System.out.print(x+" ");
		}
		
	}

}
