package example;

public class Person implements Runnable{

	@Override
	public void run() {
		for(int i =0;i<5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
