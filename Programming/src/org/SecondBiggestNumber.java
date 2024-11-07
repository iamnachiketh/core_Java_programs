package org;

public class SecondBiggestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {89,76,23,98,56,54,66,12,23,34};
		
		if(a.length<2) {
			System.out.println("length is less than 2");
			return;
		}
		
		int max = a[0],smax = a[0];
		
		for(int i:a) {
			if(i>max) {
				smax = max;
				max = i;
			}else if(i>smax && i!=max) smax = i;
		}
		System.out.println("The max in an array is: "+max);
		System.out.println("The second max in an array is: "+smax);
	}

}
