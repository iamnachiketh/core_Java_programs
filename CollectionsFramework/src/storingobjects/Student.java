package storingobjects;

public class Student {
	
	int age;
	String name;
	Student(String name,int age){
		this.age = age;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name+" is "+this.age+" years old";
	} 
}
