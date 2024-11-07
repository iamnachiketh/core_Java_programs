package defaultsort;

public class Student implements Comparable<Student>{
	int age;
	public Student(int age){
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student age :"+this.age;
	}
	
	@Override
	public int compareTo(Student s) {
		return s.age - this.age;
	}
	
	//this -> current object to be inserted
	// s -> already existing object
	// Ascending Order -> return this.age - s.age;
	// Descending Order -> return s.age - this.age;
	
}
