package org;

public class NumberOfPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {34,53,67,12,22,98,93,29,18,78};
		int countPrime = 0;
		for(int i:a) {
			if(isPrime(i)) countPrime++;
		}
		
		System.out.println("The number of primes in an array is :"+countPrime);
	}
	
	static boolean isPrime(int num) {
		
		if(num==0||num==1) return false;
		for(int i = 2;i<=(int)Math.sqrt(num);i++) {
			if(num%i == 0) return false;
		}
		 return true;
	}

}
