package org;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentMmainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> arr  = new ArrayList<>();
		
		arr.add(new Student("Alex",101,19));
		arr.add(new Student("Harsh",103,20));
		arr.add(new Student("Naveen",102,21));
		
		Iterator<Student> it = arr.iterator();
		
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("Name: "+s.name+" id: "+s.id+" Age: "+s.age);
		}
	}

}
