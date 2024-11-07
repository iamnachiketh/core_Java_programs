package com;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("A");
		System.out.println(s);// s.toString();
		System.out.println("================");
		
		System.out.println(s.hashCode());
		System.out.println("===============");
		
		String s1 = new String("java");
		String s2 = new String("java");
		System.out.println(s1 == s2);
		System.out.println(s.equals(s2));
	}

}
