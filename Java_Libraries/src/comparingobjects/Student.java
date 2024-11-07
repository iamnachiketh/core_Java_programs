package comparingobjects;

public class Student {
	
	int age;
	Student(int age){
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) { // Up Casting
		if(obj instanceof Student) {	// Check instanceof 
			Student s =  (Student) obj;	// Down Casting 
			return this.age == s.age;	// Comparision of logic
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(22);
		Student s2 = new Student(22);

		System.out.println(s1.equals(s2));
		System.out.println(s1);
		System.out.println(s2);
	}

}
