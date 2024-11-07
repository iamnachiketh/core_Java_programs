package com;

import java.io.File;
import java.util.Date;

public class RandomNumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1.Creating a file object & specifying the name
		File f = new File("./src/com/Demo.java");
		
		// 2. lastModified() return milliseconds value
		long milliseconds = f.lastModified();
		
		//3. Converting milliseconds into date format
		Date d = new Date(milliseconds);
		
		//4. Printing reference variable because toString() overriden in Date class
		System.out.println(d);
		
		System.out.println("=====================================");
		
		File f1 = new File("./src/com/Demo.java");
		Date d1 = new Date(f1.lastModified());
		System.out.println(d1);
		
		System.out.println("=====================================");
		
		Date d2 = new Date(new File("./src/com/Demo.java").lastModified());
		System.out.println(d2);
		
		System.out.println("=====================================");
		
		System.out.println(new Date(new File("./src/com/Demo.java").lastModified()));
		
	}

}
