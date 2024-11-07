package storingobjects;

import java.util.*;

public class EmployeeMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Employee> ts = new TreeSet<>();
		
		ts.add(new Employee(101,"Alex",3.5));
		ts.add(new Employee(102,"Harry",3.2));
		ts.add(new Employee(103,"Tom",3.9));
		
		for(Employee e:ts) {
			System.out.println(e);
			System.out.println(" ");
		}
		
	}

}
