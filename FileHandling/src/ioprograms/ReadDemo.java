package ioprograms;

import java.io.File;
import java.io.FileReader;

public class ReadDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File f = new File("festival.txt");
		
		FileReader fr = new FileReader(f);
		
		int x = fr.read();
		while(x!=-1) {
			System.out.print((char)x+" ");
			x = fr.read();
		}
		fr.close();
	}

}
