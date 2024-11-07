package org;

public class RunnerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Runnable type objects
		Demo d1 = new Demo();
		// Converting Runnable type to thread type
		Thread t = new Thread(d1);
		// Setting thread name
		t.setName("Demo");
		// Invoking start()
		t.start();
		
		
		
		Thread t1 = new Thread(new Demo());
		t1.setName("demo");
		t1.start();
		
		Thread t2 = new Thread(new Demo(),"Demo");
		t2.start();
		
		new Thread(new Demo(),"Demo").start();
		
	}

}
