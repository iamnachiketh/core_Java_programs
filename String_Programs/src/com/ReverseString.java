package com;

import java.util.Scanner;

public class ReverseString {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String");
		String s = sc.next();
		String res = "";
		for(int i = s.length()-1;i>=0;i--) res +=s.charAt(i);
		System.out.println("The reverse of the string "+s+" is: "+res);
	}

}
