package com;

public class Sample {
	
	private Sample(){
		System.out.println("Sample constructs");
	}
	
	int a = 10;
	void m1(){
		this.a = 100;
		Sample s = new Sample();
		s.a = 200;
		a = 20;
		s.m2();
		System.out.println(s.a);
	}
	
	void m2() {
		int a = 20;
		this.a = 300;
		a = 50;
		System.out.println(a);
	}
}
