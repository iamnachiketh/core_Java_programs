package storingobjects;

import java.util.Scanner;

public class StudentMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Student Objects");
		int size = sc.nextInt();
		
		Student[] s = new Student[size];
		
		for(int i=0;i<size;i++) {
			
			System.out.println("Enter the name of the Student");
			String name = sc.next();
			System.out.println("Enter the marks of the Student");
			double marks = sc.nextDouble();
			s[i] = new Student(name,marks);
			
		}
		
		for(int i=0;i<s.length;i++) {
			s[i].displayDetails();
		}
		sc.close();
	}

}
