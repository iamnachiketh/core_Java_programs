package org;

public class Zomato implements Runnable{
	@Override
	public void run() {
		try {
			for(int i=0;i<5;i++) {
				Thread.sleep(1000);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Running zomato");
	}
}
