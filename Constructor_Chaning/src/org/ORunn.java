package org;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class ORunn {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//		Optimus o = new Optimus(null, null, null, null, 0, 0);
//		o.displayFeatures();
		File f = new File("sample.txt");
//		if(f.exists()) {
//			FileWriter fw = new FileWriter(f);
//			fw.write("This is a sample File");
//			fw.flush();
//			fw.close();
//		}else {
//			f.createNewFile();
//			FileWriter fw = new FileWriter(f);
//			fw.write("This is a sample File");
//			fw.flush();
//			fw.close();
//		}
//		if(f.exists()) {
//			FileReader fr = new FileReader(f);
//			int ch = fr.read();
//			while(ch!=-1) {
//				System.out.print((char)ch+"");
//				ch = fr.read();
//			}
//			
//		}
		
		FileWriter fw = new FileWriter(f,true);
		if(f.exists()) {
			fw.write(" and i am appending some text!!");
			fw.flush();
		}
		
	}

}
