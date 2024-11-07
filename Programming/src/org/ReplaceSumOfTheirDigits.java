package org;

public class ReplaceSumOfTheirDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {34,76,98,45,55,0,81,54,89,23,65,91,97};
		for(int i=0;i<a.length;i++) a[i] = sumOftheDigits(a[i]);
		
		for(int i:a) {
			System.out.println(i);
		}
	}
	
	static int sumOftheDigits(int num) {
		int sum = 0;
	
		while(num!=0) {
			int rem = num%10;
			sum = sum + rem;
			num = num/10;
		}
		return sum;
	}

}
