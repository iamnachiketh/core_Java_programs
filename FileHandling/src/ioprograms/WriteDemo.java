package ioprograms;

import java.io.*;

public class WriteDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File f = new File("festival.txt");
		
		FileWriter fw = new FileWriter(f);
		
		fw.write("Happy Dasara & kindly dont forget java!!");
		fw.flush();
		fw.close();
	}

}
