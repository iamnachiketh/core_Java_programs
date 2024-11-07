package multilevel;

public class Person {
	static {
		System.out.println("person static block");
	}
	{
		System.out.println("person non static block");
	}
	Person(){
		System.out.println("person constructors!!");
	}
	void eat() {
		System.out.println("Eats Something");
	}
}
