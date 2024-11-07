package com.nachi.mydemo.app;

public class Student implements Comparable<Student>{
	
	int id, psp, bid;
	String name;
	
	Student(int id,String name,int psp,int bid){
		this.id = id;
		this.name = name;
		this.psp = psp;
		this.bid = bid;
	}
	
	@Override
	public int compareTo(Student s) {
		return s.id - this.id; 
	}
	
}
