package com;

public class MainClass {
	
	static void selectState(India obj) {
		if(obj instanceof Karnataka) {
			Karnataka k = (Karnataka) obj;
			System.out.println(k.pm+" "+k.cm);
		}else if(obj instanceof Tamilnadu) {
			Tamilnadu t = (Tamilnadu) obj;
			System.out.println(t.pm+" "+t.cm);
		}else if(obj instanceof Goa ) {
			Goa g = (Goa)obj;
			System.out.println(g.pm+" "+g.cm);
		}
	}
	public static void main(String[] args) {
		selectState(new Goa());
	}
}
