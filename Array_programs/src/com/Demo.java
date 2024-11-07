package com;

public class Demo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] fruits = {"Apple","kiwi","Tomato","Orange","Banana","Papaya"};
		int flag = 0;
		String res = "[";
		for(int i = 0; i<fruits.length; i++) {
			if(i==fruits.length-1) {
				res = res + fruits[i];
				flag = 1;
				break;
			}
			res = res + fruits[i] + ",";
			flag = 20;
//			System.out.println(fruits[i]);
		}
		res = res + "]";
		System.out.println(res);
		System.out.println(flag);
	}

}
