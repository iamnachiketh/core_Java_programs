package customsorting;

public class Student {
	 int age;
	 String name;
	 public Student(String name,int age){
		 this.name = name;
		 this.age = age;
	 }
	 
	 @Override
	 public String toString() {
		 return "Name: "+this.name+" Age: "+this.age;
	 }
}
