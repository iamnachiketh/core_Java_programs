package storingobjects;

public class Student {
	String name ;
	double marks;
	public Student(String name,double marks){
		this.name = name;
		this.marks = marks;
	}
	void displayDetails() {
		System.out.println("The name is "+this.name+"\t The marks is "+this.marks);
	}
}
