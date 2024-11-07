package ctp;

public class Calcu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calcu c = new Calcu();
		c.add(10,20);
		c.add(10,20,30);
	}
	
	void add(int a,int b) {
		System.out.println(a+b);
	}
	
	void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}

}
