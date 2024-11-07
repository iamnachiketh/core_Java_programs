package org;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,34,23,67,12,89,56};
		
		int sum = 0;
		for(int i:a) {
			sum = sum + i;
		}
		
		double avg = (double)sum/a.length;
		
		System.out.println("The sum of a array is :"+sum+" \nthe avg of an array is: "+avg);
	}

}
