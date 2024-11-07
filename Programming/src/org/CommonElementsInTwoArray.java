package org;

public class CommonElementsInTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {34,76,23,98,56,54,66,12,23,89};
		
		int[] b = {34,76,98,45,55,61,81,54,89,23,65,91,97};
		
		for(int i:a) {
			for(int j:b) {
				if(i == j) System.out.println("The common element is : "+j);
			}
		}
	}

}
