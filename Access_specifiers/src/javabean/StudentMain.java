package javabean;

public class StudentMain {
	public static void main(String[] args) {
		Student s = new Student();
		s.setAge(20);
		System.out.println("Age: "+s.getAge());
	}
}
