package traversingobjects;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> arr = new ArrayList<>();
		
		arr.add(new Student("Alex",22));
		arr.add(new Student("Amith",19));
		arr.add(new Student("Harsh",23));
		
		Iterator<Student> i = arr.iterator();
		
		while(i.hasNext()) {
			Student s = i.next();
			System.out.println("Name: "+s.name+" Age: "+s.age);
		}
	}

}
