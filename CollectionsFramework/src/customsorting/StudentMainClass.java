package customsorting;

import java.util.TreeSet;

public class StudentMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Student> ts = new TreeSet<>(new StudentNameComparator());
		
		ts.add(new Student("Alex",22));
		ts.add(new Student("Naveen",17));
		ts.add(new Student("Harsh",25));
		
		for(Student s:ts) {
			System.out.println(s);
		}
		
	}

}
