package com;

public class DemoStringBufferClass {

	public static void main(String[] args) {
		
		String  s1 = new String("Java");
		System.out.println(s1);
		s1.concat(" Program");
		System.out.println(s1); // Java
		System.out.println("===============");
		
		String s2 = new String("Hello");
		System.out.println(s2);
		s2 = s2.concat(" Java"); // Hello Java
		System.out.println(s2);
		System.out.println("================");
		
		StringBuffer s3 = new StringBuffer("Godu");
		System.out.println(s3); // Godu
		s3.append(" Morning Pineapple");
		System.out.println(s3); // Godu Morning Pineapple
	}

}
