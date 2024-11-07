package storingobjects;

import java.util.*;

public class StudentMainClass {

	public static void main(String[] args) {
		
		Student s1 = new Student("Alex",22);
		Student s2 = new Student("Tom",20);
		Student s3 = new Student("Devin",23);
		
		ArrayList<Student> arr = new ArrayList<>();
		
		arr.add(s1); // arr.add(new Student("Alex",22))
		arr.add(s2); // arr.add(new Student("Tom",20))
		arr.add(s3); // arr.add(new Student("Devin",23))
		
		
		for(int i=0;i<arr.size();i++) {
			 System.out.println(arr.get(i));// printing ref var -> toString()
			 System.out.println(" ");
		}
		
		System.out.println("==================================");
		
		for(Student x:arr) {
			System.out.println(x); // printing s1,s2,s3 (ref var) -> toString()
			System.out.println(" ");
		}

	}

}
