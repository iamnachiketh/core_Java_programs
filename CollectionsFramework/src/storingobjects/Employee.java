package storingobjects;

public class Employee implements Comparable<Employee>{
	int id;
	String ename;
	Double salary; // Wrapper class declaration to call compareTo() of Double class
	
	Employee(int id, String ename, double salary){
		this.ename = ename;
		this.id = id;
		this.salary = salary;// auto-boxing  happens
	}
	
	@Override
	public String toString() {
		return "Employee ID: "+this.id+", Name: "+this.ename+", Salary: "+this.salary;
	}
	
	@Override
	public int compareTo(Employee e) {
//		if(this.salary > e.salary) {
//			return -1;
//		}else if(this.salary < e.salary) {
//			return 1;
//		}
//		return 0;
		
		return this.salary.compareTo(e.salary);
	}
}

/**
 * 
 * this -> Current to be Inserted
 * e -> Already Existing Object
 * 
 * -> Sorting based on id (int)
 * 		1.Ascending Order -> return this.id - e.id
 * 		2. Descending Order -> return e.id - this.id;
 * 
 * -> Sorting based on name (String) -> calling compareTo() of String class;
 * 		1. Ascending Order -> return this.name.compareTo(e.name);
 * 		2. Descending Order -> return e.name.compareTo(this.name);
 * 
 * ->  Sorting based on salary (Double) -> calling compareTo() of Double class;
 * 		1. Ascending Order -> return this.salary.compareTo(e.salary);
 * 		2. Descending Order -> return e.salary.compareTo(this.salary);
 * 
 */
