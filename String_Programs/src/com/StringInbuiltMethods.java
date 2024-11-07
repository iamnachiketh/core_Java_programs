package com;

public class StringInbuiltMethods {
	public static void main(String[] args) {
		String s = "Software Engineer";
		System.out.println(s.length()); // 17
		System.out.println(s.charAt(2)); // f
		System.out.println(s.toLowerCase()); // software engineer
		System.out.println(s.toUpperCase()); // SOFTWARE ENGINEER
		System.out.println(s.startsWith("S",0)); //true
		System.out.println(s.startsWith("Soft",6)); // false
		System.out.println(s.concat(" I")); // Software Engineer I
		System.out.println(s.indexOf('e')); // 7
		System.out.println(s.indexOf("Engi")); // 9
		System.out.println(s.replace("Engineer", "Developer")); // Software Developer
		System.out.println(s.contains("Dveloper")); // false it dosent replace the original 
		// String object returns a copy
		System.out.println(s.contains("g")); // true original string has Engineer in it
		String x = "java";
		String y = "jaVA";
		System.out.println(x.equals(y)); // false
		System.out.println(x.equalsIgnoreCase(y)); // true
	}
}
