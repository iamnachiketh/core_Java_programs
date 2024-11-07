package com;

public class SumAndAvg {
	public static void main(String[] args) {
		int[] a = {10,20,30};
		int sum = 0;
		double avg;
		for(int i=0;i<a.length;i++) {
			sum +=a[i];
		}
		
		avg = sum / a.length;
		
		System.out.println("The sum is :"+sum);
		System.out.println("\nThe avg is : "+avg);
	}
}
