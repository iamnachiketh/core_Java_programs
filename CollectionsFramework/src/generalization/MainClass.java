package generalization;

import java.util.ArrayList;

public class MainClass {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person> arr = new ArrayList<>();
		
		arr.add(new Employee());
		arr.add(new Student());
		// arr.add(new Demo()); Error!!!
		
		for(Person i:arr) {
			if(i instanceof Employee) {
				Employee e = (Employee)i;
				System.out.println("Salary: "+e.salary);
			}else{
				Student s = (Student)i;
				System.out.println("Marks: "+s.marks);
			}
		}

	}

}
