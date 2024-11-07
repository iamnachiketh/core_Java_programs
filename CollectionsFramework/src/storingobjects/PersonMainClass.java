package storingobjects;

import java.util.*;

public class PersonMainClass {

	public static void main(String[] args) {
		
		TreeSet<Person> arr = new TreeSet<>();
		
		arr.add(new Person("Alex",20));
		arr.add(new Person("Ooa",22));
		arr.add(new Person("Oo",21));
		
		for(Person p:arr) {
			System.out.println(p);
		}
	}

}
