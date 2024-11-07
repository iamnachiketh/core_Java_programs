package ioprograms;

import java.io.File;
import java.io.FileWriter;

public class WriteExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File f  = new File("index.css");
		
		FileWriter fw = new FileWriter(f);
		
		fw.write(" ");
		fw.flush();
		fw.close();
	}

}
