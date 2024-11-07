package multilevel;

public class Tom extends Employee{
	static {
		System.out.println("tom static block");
	}
	{
		System.out.println("tom non static block");
	}
	Tom(){
		System.out.println("tom constructors!!");
	}
	int age = 30;
}
