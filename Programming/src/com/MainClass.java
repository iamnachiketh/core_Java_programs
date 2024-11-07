package com;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number: ");
		int num = ScannerObj.sc.nextInt();
		decimalToBinary(num);
	}
	
	static void decimalToBinary(int num) {
		int[] arr = new int[1000];
		String result = "";
		int i =0;
		while(num>0) {
			arr[i] = num % 2;
			i++;
			num = (int)num/2;
			
		}
		
		for(int j = i-1;j>=0;j--) result = result + arr[j];
		System.out.println(result);
	}
	
//	static boolean checkPrime(int num) {
//		int count = 0;
//		for(int i=1;i<=Math.sqrt(num);i++) {
//			if(num%i==0) {
//				count++;
//				if(num/i!=i) count++;
//			}
//		}
//		return count == 2;
//	}
	
//	static boolean strong(int num) {
//		int r = num%10, temp = num,sum = 0;
//		if(num == 0) return true;
//		while(num!=0) {
//			int rem = num%10;
//			sum = sum + fact(rem);
//			num = num/10;
//		}
//
//		return sum == temp;
//	}
//	static int fact(int num) {
//		int fact = 1;
//		if(num==0) return 1;
//		for(int i =2;i<=num;i++) {
//			fact = fact * i;
//		}
//		return fact;
//	}
}
