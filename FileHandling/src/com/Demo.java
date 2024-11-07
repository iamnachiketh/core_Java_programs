package com;

import java.io.File;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File f = new File("car.pdf");
		
		//boolean res = f.mkdir();
		
		f.createNewFile();
		
		if(f.exists()) {
			System.out.println("exists");
		}
	}

}
