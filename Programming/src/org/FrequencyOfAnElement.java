package org;

public class FrequencyOfAnElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {10,34,23,67,10,12,89,56,10,};
		int num = 10,count = 0;
		for(int i: a) {
			if(i == num) count+=1;
		}
		
		System.out.println("The frequency of number "+num+" is :"+count);
	}

}
