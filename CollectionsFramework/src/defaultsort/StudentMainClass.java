package defaultsort;

import java.util.TreeSet;

public class StudentMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(22);
		Student s2 = new Student(20);
		Student s3 = new Student(21);
		
		TreeSet<Student> ts = new TreeSet<>();
		
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		
		for(Student s:ts) {
			System.out.println(s);
		}
	}

}
