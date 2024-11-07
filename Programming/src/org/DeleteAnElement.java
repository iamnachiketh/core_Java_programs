package org;

public class DeleteAnElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {34,76,98,45,55,61,81,54,89,23,65,91,97};
		int idx = 6;
		deleteAnElement(a,idx);
	}

	static void deleteAnElement(int[] a, int idx) {
		
		if(idx>a.length-1 || idx<0) {
			System.out.println("Invalid Index");
			return;
		}
		int[] b = new int[a.length-1];
		int j = 0;
		for(int i=0;i<a.length;i++) {
			if(i == idx) continue;
			b[j++] = a[i];
		}
		
		for(int x:b) {
			System.out.print(x+" ");
		}
		
	}

}
