package com;

public class Runner {

	static void display(Father obj) {
		
		if(obj instanceof Son) {
			
			System.out.println("Downcasting to son");
			Son s = (Son) obj;
			System.out.println(s.x+" "+s.y);
			
		}else if(obj instanceof Daughter) {
			
			System.out.println("Downcasting to Daughter");
			Daughter d = (Daughter) obj;
			System.out.println(d.x+" "+d.z);
		}
		
	}

}
