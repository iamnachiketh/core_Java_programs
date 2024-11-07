package com;

public class Student {
	String name;
	int id;
	static String clgName;
	Student(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	Student(String collagename){
		Student.clgName = collagename; 
	}
	
	void display() {
		System.out.println("Name of a student : "+this.name+"\t and id of the student : "+this.id+"\n");
	}
	
	
	static void display(String collageName) {
		System.out.println("Name of the collage : "+collageName+"\n");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Student("NMAMIT");
		Student s1 = new Student(1,"Raj");
		s1.display();
		display(Student.clgName);
		Student s2 = new Student(2,"Amith");
		s2.display();
		display(Student.clgName);
		
	}

}
