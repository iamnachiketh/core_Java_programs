package javabean;

public class EmployeeMainClass {
	 public static void main(String[] args) {
		Employee e = new Employee();
		
		e.setId(101);
		e.setName("Ray");
		e.setSalary(20000);
		
		System.out.print(12%26);
		
		System.out.println("Name: "+e.getName()+"\t ID: "+e.getId()+"\t Salary: "+e.getSalary());
	}
}
